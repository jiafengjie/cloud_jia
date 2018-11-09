package service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Service1Application {
    @Autowired
    protected RedisTemplate redisTemplate;


    @RequestMapping("/service1request")
    public String service(){
        return "eeeee";
    }
    @RequestMapping("/redis")
    @Cacheable(value="user", key="'user'")
    public String redis(){


      return  "m";

    }
    public static void main(String[] args) {
        SpringApplication.run(Service1Application.class, args);
    }
}