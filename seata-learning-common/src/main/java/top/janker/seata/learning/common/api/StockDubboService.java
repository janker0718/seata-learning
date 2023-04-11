package top.janker.seata.learning.common.api;

import top.janker.seata.learning.common.dto.CommodityDTO;
import top.janker.seata.learning.common.response.ObjectResponse;

/**
 * 仓库服务
 * @author janker
 * @date 2023/4/9 19:07
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public interface StockDubboService {
    /**
     * 扣减库存
     */
    ObjectResponse decreaseStock(CommodityDTO commodityDTO);
}
