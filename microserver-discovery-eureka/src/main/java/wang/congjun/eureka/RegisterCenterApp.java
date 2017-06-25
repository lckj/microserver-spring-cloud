package wang.congjun.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by wangcongjun on 2017/6/18.
 */
@SpringBootApplication
@EnableEurekaServer
public class RegisterCenterApp {
    public static void main(String[] args) {
        SpringApplication.run(RegisterCenterApp.class,args);
    }
}
