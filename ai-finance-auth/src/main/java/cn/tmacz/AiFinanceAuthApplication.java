package cn.tmacz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDiscoveryClient
@SpringBootApplication
public class AiFinanceAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiFinanceAuthApplication.class, args);
    }

}
