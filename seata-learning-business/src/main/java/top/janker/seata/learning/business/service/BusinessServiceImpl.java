package top.janker.seata.learning.business.service;

import com.alibaba.dubbo.config.annotation.Reference;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;
import top.janker.seata.learning.common.api.OrderDubboService;
import top.janker.seata.learning.common.api.StockDubboService;
import top.janker.seata.learning.common.dto.BusinessDTO;
import top.janker.seata.learning.common.dto.CommodityDTO;
import top.janker.seata.learning.common.dto.OrderDTO;
import top.janker.seata.learning.common.enums.RspStatusEnum;
import top.janker.seata.learning.common.exception.DefaultException;
import top.janker.seata.learning.common.response.ObjectResponse;

/**
 * @author janker
 * @date 2023/4/9 23:57
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
@Service
public class BusinessServiceImpl implements BusinessService {

    @Reference(version = "1.0.0")
    private StockDubboService stockDubboService;

    @Reference(version = "1.0.0")
    private OrderDubboService orderDubboService;

    private boolean flag;

    /**
     * 处理业务逻辑
     *
     * @Param:
     * @Return:
     */
    @Override
    @GlobalTransactional(timeoutMills = 300000, name = "dubbo-demo-business-service")
    public ObjectResponse handleBusiness(BusinessDTO businessDTO) {
        System.out.println("开始全局事务，XID = " + RootContext.getXID());
        ObjectResponse<Object> objectResponse = new ObjectResponse<>();
        //1、扣减库存
        CommodityDTO commodityDTO = new CommodityDTO();
        commodityDTO.setCommodityCode(businessDTO.getCommodityCode());
        commodityDTO.setCount(businessDTO.getCount());
        ObjectResponse stockResponse = stockDubboService.decreaseStock(commodityDTO);
        //2、创建订单
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setUserId(businessDTO.getUserId());
        orderDTO.setCommodityCode(businessDTO.getCommodityCode());
        orderDTO.setOrderCount(businessDTO.getCount());
        orderDTO.setOrderAmount(businessDTO.getAmount());
        ObjectResponse<OrderDTO> response = orderDubboService.createOrder(orderDTO);

        //打开注释测试事务发生异常后，全局回滚功能
        //        if (!flag) {
        //            throw new RuntimeException("测试抛异常后，分布式事务回滚！");
        //        }

        if (stockResponse.getStatus() != 200 || response.getStatus() != 200) {
            throw new DefaultException(RspStatusEnum.FAIL);
        }

        objectResponse.setStatus(RspStatusEnum.SUCCESS.getCode());
        objectResponse.setMessage(RspStatusEnum.SUCCESS.getMessage());
        objectResponse.setData(response.getData());
        return objectResponse;
    }
}
