package top.janker.seata.learning.order.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import top.janker.seata.learning.order.entity.TOrder;

/**
 * @author janker
 * @date 2023/4/10 00:05
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public interface TOrderMapper extends BaseMapper<TOrder> {

    /**
     * 创建订单
     *
     * @Param: order 订单信息
     * @Return:
     */
    void createOrder(@Param("order") TOrder order);
}
