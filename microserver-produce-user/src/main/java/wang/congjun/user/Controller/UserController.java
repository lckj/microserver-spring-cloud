package wang.congjun.user.Controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wang.congjun.user.entity.User;
import wang.congjun.user.repository.UserRepository;

/**
 * Created by wangcongjun on 2017/6/18.
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    @Qualifier("eurekaClient")
    private EurekaClient discoveryClient;

    @RequestMapping("/eureka/instance")
    public String serviceUrl() {
        InstanceInfo instance = discoveryClient.getNextServerFromEureka("MICROSERVER-PRODUCER-USER", false);
        return instance.getHomePageUrl();
    }


    @RequestMapping("/user/save")
    public void saveUser(@RequestParam("data") String data){
        User user = new User();
        String[] strings = data.split(",");
        user.setName(strings[0]);
        user.setAddr(strings[1]);
        userRepository.save(user);
    }

    @RequestMapping("/user/get/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        return userRepository.findOne(id);
    }
}
