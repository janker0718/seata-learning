package top.janker.seata.learning.order;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author janker
 * @date 2023/4/10 00:04
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */

@SpringBootApplication(scanBasePackages = "top.janker.seata.learning.order")
@EnableDiscoveryClient
@EnableTransactionManagement
@MapperScan({"top.janker.seata.learning.order.mapper"})
@EnableDubbo(scanBasePackages = "top.janker.seata.learning.order")
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}