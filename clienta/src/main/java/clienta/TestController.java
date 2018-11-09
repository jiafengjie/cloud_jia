package clienta;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hi4")
    @HystrixCommand(fallbackMethod = "listUsersByRibbonFallback")
    public String hi(){
       return restTemplate.getForObject("http://service1/service1request", String.class);
    }
    public String listUsersByRibbonFallback(){
        return "listUsersByRibbon异常，端口：";
    }
}