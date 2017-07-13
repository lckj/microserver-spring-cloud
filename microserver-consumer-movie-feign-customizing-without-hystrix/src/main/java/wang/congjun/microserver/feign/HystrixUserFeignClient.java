package wang.congjun.microserver.feign;

import org.springframework.stereotype.Component;
import wang.congjun.microserver.entity.User;

/**
 * Created by wangcongjun on 2017/7/11.
 */
@Component
public class HystrixUserFeignClient implements UserFeignClient {

    @Override
    public User getUserById(Integer id) {
        User user = new User();
        user.setId(0);
        return user ;
    }

}
