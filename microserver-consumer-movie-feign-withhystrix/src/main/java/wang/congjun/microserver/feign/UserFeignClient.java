package wang.congjun.microserver.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import wang.congjun.microserver.entity.User;

/**
 * Created by wangcongjun on 2017/6/22.
 */
@FeignClient(name="microserver-producer-user",fallback = UserFeignClient.HystrixClientFallback.class)
public interface UserFeignClient {
    @RequestMapping(value = "/user/get/{id}" ,method = RequestMethod.GET)
     User getUserById(@PathVariable("id") Integer id);
    @RequestMapping(value = "/user/post",method = RequestMethod.POST)
     User getUser(@RequestBody User user);

    @Component
    class HystrixClientFallback implements UserFeignClient {

        @Override
        public User getUserById(Integer id) {
            User user = new User();
            user.setId(0);
            return user;
        }

        @Override
        public User getUser(User user) {
            user = new User();
            user.setId(0);
            return user;
        }
    }
}
