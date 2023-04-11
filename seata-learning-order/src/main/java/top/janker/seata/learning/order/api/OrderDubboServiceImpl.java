package top.janker.seata.learning.order.api;

import com.alibaba.dubbo.config.annotation.Service;
import io.seata.core.context.RootContext;
import org.springframework.beans.factory.annotation.Autowired;
import top.janker.seata.learning.common.api.OrderDubboService;
import top.janker.seata.learning.common.dto.OrderDTO;
import top.janker.seata.learning.common.response.ObjectResponse;
import top.janker.seata.learning.order.service.ITOrderService;

/**
 * @author janker
 * @date 2023/4/10 00:07
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
@Service(version = "1.0.0", protocol = "${dubbo.protocol.id}", application = "${dubbo.application.id}",
        registry = "${dubbo.registry.id}", timeout = 3000)
public class OrderDubboServiceImpl implements OrderDubboService {

    @Autowired
    private ITOrderService orderService;

    @Override
    public ObjectResponse<OrderDTO> createOrder(OrderDTO orderDTO) {
        System.out.println("全局事务id ：" + RootContext.getXID());
        return orderService.createOrder(orderDTO);
    }
}