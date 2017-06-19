package wang.congjun.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 数据连接用的是JPA
 * Created by wangcongjun on 2017/6/18.
 */
@SpringBootApplication
@EnableEurekaClient
public class ProduceUserApp {

    public static void main(String[] args) {
        SpringApplication.run(ProduceUserApp.class,args);
    }
}
