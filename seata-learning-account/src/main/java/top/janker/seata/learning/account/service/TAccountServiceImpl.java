package top.janker.seata.learning.account.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.seata.spring.annotation.GlobalLock;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.janker.seata.learning.account.entity.TAccount;
import top.janker.seata.learning.account.mapper.TAccountMapper;
import top.janker.seata.learning.common.dto.AccountDTO;
import top.janker.seata.learning.common.enums.RspStatusEnum;
import top.janker.seata.learning.common.response.ObjectResponse;

/**
 * @author janker
 * @date 2023/4/9 19:46
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
@Service
public class TAccountServiceImpl extends ServiceImpl<TAccountMapper, TAccount> implements ITAccountService {

    @Override
    public ObjectResponse decreaseAccount(AccountDTO accountDTO) {
        int account = baseMapper.decreaseAccount(accountDTO.getUserId(), accountDTO.getAmount().doubleValue());
        ObjectResponse<Object> response = new ObjectResponse<>();
        if (account > 0) {
            response.setStatus(RspStatusEnum.SUCCESS.getCode());
            response.setMessage(RspStatusEnum.SUCCESS.getMessage());
            return response;
        }

        response.setStatus(RspStatusEnum.FAIL.getCode());
        response.setMessage(RspStatusEnum.FAIL.getMessage());
        return response;
    }

    @Override
    @GlobalLock
    @Transactional(rollbackFor = {Throwable.class})
    public void testGlobalLock() {
        baseMapper.testGlobalLock("1");
        System.out.println("Hi, i got lock, i will do some thing with holding this lock.");
    }
}
