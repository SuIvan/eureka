package cn.com.ivan.product.controller;

import cn.com.ivan.product.model.User;
import cn.com.ivan.product.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("test")
public class TestTemplate {
    @Resource
    private UserService userService;
    @Value("${server.port}")
    private String port;
    @Value("${spring.cloud.client.ip.ip-address")
    private String ip;
    @GetMapping("/all")
    public ResponseEntity<List<User>> listAll(){
        System.out.println("访问地址:" +ip+":"+port);
        return ResponseEntity.ok(userService.findAllUsers());
    }
}
