package top.janker.seata.learning.stock.service;

import com.baomidou.mybatisplus.service.IService;
import top.janker.seata.learning.common.dto.CommodityDTO;
import top.janker.seata.learning.common.response.ObjectResponse;
import top.janker.seata.learning.stock.entity.TStock;

/**
 * @author janker
 * @date 2023/4/10 00:07
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public interface ITStockService extends IService<TStock> {

    /**
     * 创建订单
     */
    ObjectResponse decreaseStock(CommodityDTO commodityDTO);
}