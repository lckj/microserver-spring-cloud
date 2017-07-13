package wang.congjun.feignconfig;


import feign.Contract;
import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by wangcongjun on 2017/6/25.
 */
@Configuration
public class FooFeignConfig2 {
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("root", "890610");
    }
    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }
    //禁用使用此配置的feignClient的Hystrix
    @Bean
    @Scope("prototype")
    public Feign.Builder feignBuilder() {
        return Feign.builder();
    }
}
