package top.janker.seata.learning.common.api;

import top.janker.seata.learning.common.dto.AccountDTO;
import top.janker.seata.learning.common.response.ObjectResponse;

/**
 * 账户服务接口
 * @author janker
 * @date 2023/4/9 18:56
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public interface AccountDubboService {
    /**
     * 从账户扣钱
     */
    ObjectResponse decreaseAccount(AccountDTO accountDTO);
}
