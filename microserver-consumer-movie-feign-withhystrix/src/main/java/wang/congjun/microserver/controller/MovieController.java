package wang.congjun.microserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wang.congjun.microserver.entity.MovieInfo;
import wang.congjun.microserver.entity.User;
import wang.congjun.microserver.feign.UserFeignClient;
import wang.congjun.microserver.repository.MovieRepository;

/**
 * Created by wangcongjun on 2017/6/18.
 */
@RestController
public class MovieController {
    @Autowired
    private UserFeignClient userFeignClient;

    @RequestMapping("/movie/user/{id}")
    public User saveMovie(@PathVariable("id") Integer id){
        return userFeignClient.getUserById(id);
    }

    @GetMapping("/movie/user/get")
    public User getUser(User user){
        return userFeignClient.getUser(user);
    }
}
