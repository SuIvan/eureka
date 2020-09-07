package cn.com.ivan.orderservice.controller;

import cn.com.ivan.orderservice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/revoke")
public class TestRestController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;
    /**
     * 使用ribbon的形式调用远程微服务
     * 1.使用@loadBalandce声明Resttemplate
     * 2.使用服务名称替换ip
     * @return
     */
    @RequestMapping("test")
    public ResponseEntity<Object> listAll() {
        List<User> users = restTemplate.getForObject("http://PRODUCT/test/all", List.class);
        return ResponseEntity.ok(users);
    }

    /**
     * 使用instance创建调取服务
     */
//    @RequestMapping("test")
//    public ResponseEntity<Object> listAll() {
//        List<ServiceInstance> instanceList = discoveryClient.getInstances("PRODUCT");
//        for (ServiceInstance instance : instanceList){
//            System.out.println(instance);
//        }
//        List<User> users = restTemplate.getForObject("http://localhost:9001/test/all", List.class);
//        return ResponseEntity.ok(users);
//    }
}
