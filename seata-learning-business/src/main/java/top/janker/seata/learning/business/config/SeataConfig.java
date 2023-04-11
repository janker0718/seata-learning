package top.janker.seata.learning.business.config;

import io.seata.spring.annotation.GlobalTransactionScanner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author janker
 * @date 2023/4/9 23:53
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
@Configuration
public class SeataConfig {
    @Bean
    public GlobalTransactionScanner globalTransactionScanner() {
        return new GlobalTransactionScanner("dubbo-demo-app", "my_test_tx_group");
    }


}
