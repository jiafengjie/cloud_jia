package service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Service1Application {
    @RequestMapping("/service1request")
    public String service(){
        return "service1bak";
    }

    public static void main(String[] args) {
        SpringApplication.run(Service1Application.class, args);
    }
}