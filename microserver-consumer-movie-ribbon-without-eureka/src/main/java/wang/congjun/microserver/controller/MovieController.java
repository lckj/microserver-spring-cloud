package wang.congjun.microserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
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

    @Autowired
    private LoadBalancerClient loadBalancerClient ;

    @RequestMapping("/movie/user/{id}")
    public String getUser(@PathVariable("id")Integer id){
       return  restTemplate.getForObject("http://microserver-producer-user/user/get/"+id,String.class);
    }

    //自助选择
    @RequestMapping("/test")
    public String choseRibbon(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("microserver-producer-user");
        System.out.println("====="+serviceInstance.getHost()+":"+serviceInstance.getPort());
        ServiceInstance serviceInstance2 = loadBalancerClient.choose("microserver-producer-user2");
        System.out.println("*****"+serviceInstance2.getHost()+":"+serviceInstance2.getPort());
        return "1";
    }
}
