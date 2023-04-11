package top.janker.seata.learning.stock.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import top.janker.seata.learning.stock.entity.TStock;

/**
 * @author janker
 * @date 2023/4/10 00:05
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public interface TStockMapper extends BaseMapper<TStock> {

    /**
     * 扣减商品库存
     *
     * @Param: commodityCode 商品code  count扣减数量
     * @Return:
     */
    int decreaseStock(@Param("commodityCode") String commodityCode, @Param("count") Integer count);
}
