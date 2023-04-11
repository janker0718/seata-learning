package top.janker.seata.learning.account.api;

import com.alibaba.dubbo.config.annotation.Service;
import io.seata.core.context.RootContext;
import org.springframework.beans.factory.annotation.Autowired;
import top.janker.seata.learning.account.service.ITAccountService;
import top.janker.seata.learning.common.api.AccountDubboService;
import top.janker.seata.learning.common.dto.AccountDTO;
import top.janker.seata.learning.common.response.ObjectResponse;

/**
 * @author janker
 * @date 2023/4/9 19:44
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
@Service(version = "1.0.0", protocol = "${dubbo.protocol.id}", application = "${dubbo.application.id}",
        registry = "${dubbo.registry.id}", timeout = 3000)
public class AccountDubboServiceImpl implements AccountDubboService {

    @Autowired
    private ITAccountService accountService;

    @Override
    public ObjectResponse decreaseAccount(AccountDTO accountDTO) {
        System.out.println("全局事务id ：" + RootContext.getXID());
        return accountService.decreaseAccount(accountDTO);
    }
}
