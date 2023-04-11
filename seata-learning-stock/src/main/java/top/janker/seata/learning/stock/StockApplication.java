package top.janker.seata.learning.stock;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author janker
 * @date 2023/4/10 00:35
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
@SpringBootApplication(scanBasePackages = "top.janker.seata.learning.stock")
@MapperScan({"top.janker.seata.learning.stock.mapper"})
@EnableDubbo(scanBasePackages = "top.janker.seata.learning.stock")
@EnableDiscoveryClient
@EnableTransactionManagement
public class StockApplication {
    public static void main(String[] args) {
        SpringApplication.run(StockApplication.class, args);
    }

}
