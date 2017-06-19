package wang.congjun.microserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import wang.congjun.microserver.entity.MovieInfo;
import wang.congjun.microserver.repository.MovieRepository;

/**
 * Created by wangcongjun on 2017/6/18.
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/movie/user/{id}")
    public String getUser(@PathVariable("id")Integer id){
       return  restTemplate.getForObject("http://microserver-producer-user/user/get/"+id,String.class);
    }
}
