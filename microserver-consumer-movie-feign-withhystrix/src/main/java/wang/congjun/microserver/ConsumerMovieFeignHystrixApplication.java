package wang.congjun.microserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 用MyBatis作为数据处理层
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ConsumerMovieFeignHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerMovieFeignHystrixApplication.class, args);
	}
}
