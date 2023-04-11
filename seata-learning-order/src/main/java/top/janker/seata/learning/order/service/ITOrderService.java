package top.janker.seata.learning.order.service;

import com.baomidou.mybatisplus.service.IService;
import top.janker.seata.learning.common.dto.OrderDTO;
import top.janker.seata.learning.common.response.ObjectResponse;
import top.janker.seata.learning.order.entity.TOrder;

/**
 * @author janker
 * @date 2023/4/10 00:07
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public interface ITOrderService extends IService<TOrder> {

    /**
     * 创建订单
     */
    ObjectResponse<OrderDTO> createOrder(OrderDTO orderDTO);
}