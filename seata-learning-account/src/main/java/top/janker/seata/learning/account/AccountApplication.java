package top.janker.seata.learning.account;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author janker
 * @date 2023/4/9 19:32
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
@SpringBootApplication(scanBasePackages = "top.janker.seata.learning.account")
@EnableDiscoveryClient
@EnableTransactionManagement
@MapperScan({"top.janker.seata.learning.account.mapper"})
@EnableDubbo(scanBasePackages = "top.janker.seata.learning.account")
public class AccountApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }
}

