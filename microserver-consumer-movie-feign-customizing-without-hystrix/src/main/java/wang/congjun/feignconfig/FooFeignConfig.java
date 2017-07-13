package wang.congjun.feignconfig;


import feign.Contract;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wangcongjun on 2017/6/25.
 */
@Configuration
public class FooFeignConfig {
    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("root", "890610");
    }
}
