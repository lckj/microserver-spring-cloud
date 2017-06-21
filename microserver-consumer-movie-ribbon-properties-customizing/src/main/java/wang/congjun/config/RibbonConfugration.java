package wang.congjun.config;

import com.netflix.client.config.DefaultClientConfigImpl;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wangcongjun on 2017/6/20.
 */
@Configuration
public class RibbonConfugration {

    @Bean
    public IRule ribbonRule(IClientConfig config) {

        return new RandomRule();
    }
}
