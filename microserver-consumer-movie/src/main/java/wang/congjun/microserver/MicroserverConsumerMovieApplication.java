package wang.congjun.microserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 用MyBatis作为数据处理层
 */

@SpringBootApplication
@EnableEurekaClient
public class MicroserverConsumerMovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserverConsumerMovieApplication.class, args);
	}
}
