package cn.tmacz;

import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@GlobalTransactional
@EnableDiscoveryClient
@SpringBootApplication
public class AiFinanceAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiFinanceAccountApplication.class, args);
    }

}
