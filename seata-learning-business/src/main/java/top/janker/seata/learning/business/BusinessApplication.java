package top.janker.seata.learning.business;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import top.janker.seata.learning.business.service.BusinessService;
import top.janker.seata.learning.common.dto.BusinessDTO;

import java.math.BigDecimal;

/**
 * @author janker
 * @date 2023/4/9 23:55
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
@SpringBootApplication(scanBasePackages = "top.janker.seata.learning.business",exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@EnableDubbo(scanBasePackages = "top.janker.seata.learning.business")
public class BusinessApplication implements ApplicationRunner {

    @Autowired
    private BusinessService businessService;
    public static void main(String[] args) {
        SpringApplication.run(BusinessApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        BusinessDTO businessDTO = new BusinessDTO();
        businessDTO.setUserId("1");
        businessDTO.setAmount(new BigDecimal("1000"));
        businessDTO.setName("水杯");
        businessDTO.setCommodityCode("C201901140001");
        businessDTO.setCount(1);
        businessService.handleBusiness(businessDTO);
    }
}
