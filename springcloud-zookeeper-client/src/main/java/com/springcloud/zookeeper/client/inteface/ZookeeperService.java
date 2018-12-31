package com.springcloud.zookeeper.client.inteface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.cloud.openfeign.FeignClient;
@Configuration
@EnableFeignClients
@EnableDiscoveryClient
public class ZookeeperService{
    @Autowired
    private TheClient theClient;
    @FeignClient(name="zookeeper-registry")
    interface TheClient {
        @RequestMapping(path = "/getUser", method = RequestMethod.GET)
        @ResponseBody
        String getUser();
    }

    public String getUser() {
        return theClient.getUser();
    }
}

