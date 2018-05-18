package com.spf.dubbo.serviceImpl;

import com.spf.dubbo.api.HelloService;
import com.spf.dubbo.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * created by shipengfei
 * on 2018/5/18, 14:55
 * description 
 */
public class HelloServiceImpl implements HelloService {

    @Autowired
    private HelloService helloService;

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

    @Override
    public UserDto getUserById(int id) {
        UserDto userDto = new UserDto();
        userDto.setId(id);
        userDto.setName("ZhangSan");
        return userDto;
    }

    @Override
    public Map<String,UserDto> getUsers() {
        Map<String,UserDto> users = new HashMap<String,UserDto>();
        UserDto user1 = new UserDto(1, "ZhangSan");
        UserDto user2 = new UserDto(2, "LiSi");
        users.put("1", user1);
        users.put("2", user2);
        return users;
    }
}
