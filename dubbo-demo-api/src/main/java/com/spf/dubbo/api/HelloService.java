package com.spf.dubbo.api;

import com.spf.dubbo.dto.UserDto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/*
 * created by shipengfei
 * on 2018/5/18, 13:49
 * description 
 */
@Repository
public interface HelloService {

    String sayHello(String name);

    UserDto getUserById(int id);

    Map<String, UserDto> getUsers();

}
