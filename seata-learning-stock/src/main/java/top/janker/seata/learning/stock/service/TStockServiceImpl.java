package top.janker.seata.learning.stock.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.janker.seata.learning.common.dto.CommodityDTO;
import top.janker.seata.learning.common.enums.RspStatusEnum;
import top.janker.seata.learning.common.response.ObjectResponse;
import top.janker.seata.learning.stock.entity.TStock;
import top.janker.seata.learning.stock.mapper.TStockMapper;

/**
 * @author janker
 * @date 2023/4/10 00:09
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
@Service
public class TStockServiceImpl extends ServiceImpl<TStockMapper, TStock> implements ITStockService {

    @Override
    public ObjectResponse decreaseStock(CommodityDTO commodityDTO) {
        int storage = baseMapper.decreaseStock(commodityDTO.getCommodityCode(), commodityDTO.getCount());
        ObjectResponse<Object> response = new ObjectResponse<>();
        if (storage > 0) {
            response.setStatus(RspStatusEnum.SUCCESS.getCode());
            response.setMessage(RspStatusEnum.SUCCESS.getMessage());
            return response;
        }

        response.setStatus(RspStatusEnum.FAIL.getCode());
        response.setMessage(RspStatusEnum.FAIL.getMessage());
        return response;
    }
}