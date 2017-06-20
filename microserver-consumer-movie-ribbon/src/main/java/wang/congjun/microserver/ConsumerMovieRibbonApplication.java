package wang.congjun.microserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;
import wang.congjun.config.RibbonConfugration;

/**
 * 用MyBatis作为数据处理层
 */

@SpringBootApplication
@EnableEurekaClient
//自定义ribbonclient的配置 配置的信息在RibbonConfugration这个类中（这个类不能在Spring扫描的范围内）
@RibbonClient(name = "microserver-producer-user" , configuration = RibbonConfugration.class)
//配置自定义Spring扫描包
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type= FilterType.ANNOTATION ,value = ExcludeScan.class)})
public class ConsumerMovieRibbonApplication {

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}


	public static void main(String[] args) {
		SpringApplication.run(ConsumerMovieRibbonApplication.class, args);
	}
}
