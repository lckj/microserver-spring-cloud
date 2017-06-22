package wang.congjun.microserver.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;
import wang.congjun.microserver.entity.User;

/**
 * Created by wangcongjun on 2017/6/22.
 */
@FeignClient("microserver-producer-user")
public interface UserFeignClient {
    @RequestMapping(value = "/user/get/{id}" ,method = RequestMethod.GET)
     User getUserById(@PathVariable("id") Integer id);
    @RequestMapping(value = "/user/post",method = RequestMethod.POST)
     User getUser(@RequestBody User user);
}
