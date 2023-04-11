package top.janker.seata.learning.stock.api;

import com.alibaba.dubbo.config.annotation.Service;
import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import top.janker.seata.learning.common.api.StockDubboService;
import top.janker.seata.learning.common.dto.CommodityDTO;
import top.janker.seata.learning.common.response.ObjectResponse;
import top.janker.seata.learning.stock.service.ITStockService;

/**
 * @author janker
 * @date 2023/4/10 00:07
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
@Service(version = "1.0.0", protocol = "${dubbo.protocol.id}", application = "${dubbo.application.id}",
        registry = "${dubbo.registry.id}", timeout = 3000)
@Slf4j
public class StockDubboServiceImpl implements StockDubboService {

    @Autowired
    private ITStockService storageService;

    @Override
    public ObjectResponse decreaseStock(CommodityDTO commodityDTO) {
        String xid = RootContext.getXID();
        log.info("全局事务id ：" + RootContext.getXID());
        return storageService.decreaseStock(commodityDTO);
    }

}
