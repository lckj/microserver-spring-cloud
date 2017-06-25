package wang.congjun.microserver.feign;

import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;
import wang.congjun.feignconfig.FooFeignConfig;
import wang.congjun.microserver.entity.User;

/**
 * Created by wangcongjun on 2017/6/22.
 */
@FeignClient(value = "microserver-producer-user",configuration = FooFeignConfig.class)
public interface UserFeignClient {
    @RequestLine("GET /user/get/{id}")
     User getUserById(@Param ("id") Integer id);
    @RequestLine(value = "POST /user/post")
     User getUser(@Param("user") User user);
}
