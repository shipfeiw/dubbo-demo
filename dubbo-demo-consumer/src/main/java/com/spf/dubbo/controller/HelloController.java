package com.spf.dubbo.controller;

import com.spf.dubbo.api.HelloService;
import com.spf.dubbo.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/*
 * created by shipengfei
 * on 2018/5/18, 15:14
 * description 
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam(value="name", required=true, defaultValue="lala") String name){
        return helloService.sayHello(name);
    }

    @RequestMapping("/showUserById")
    public UserDto showUserById(@RequestParam(value="id", required=true, defaultValue="1") int id){
        return helloService.getUserById(id);
    }

    @RequestMapping("/showUsers")
    public Map<String,UserDto> showUsers(){
        return helloService.getUsers();
    }

}
