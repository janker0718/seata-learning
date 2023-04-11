package top.janker.seata.learning.account.service;

import com.baomidou.mybatisplus.service.IService;
import top.janker.seata.learning.account.entity.TAccount;
import top.janker.seata.learning.common.dto.AccountDTO;
import top.janker.seata.learning.common.response.ObjectResponse;

/**
 * @author janker
 * @date 2023/4/9 19:45
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public interface ITAccountService extends IService<TAccount> {

    /**
     * 扣用户钱
     */
    ObjectResponse decreaseAccount(AccountDTO accountDTO);

    void testGlobalLock();
}