package wang.congjun.microserver.feign;


import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import wang.congjun.feignconfig.FooFeignConfig2;
import wang.congjun.microserver.entity.User;

/**
 * Created by wangcongjun on 2017/6/22.
 */
@FeignClient(value = "microserver-producer-user1",configuration = FooFeignConfig2.class,fallback = HystrixUserFeignClient2.class)
public interface UserFeignClient2 {
    @RequestLine(value = "POST /user/post")
    User getUser(@Param("user") User user);
}
