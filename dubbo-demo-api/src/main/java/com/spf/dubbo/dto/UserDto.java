package com.spf.dubbo.dto;

import java.io.Serializable;

/*
 * created by shipengfei
 * on 2018/5/18, 13:53
 * description 
 */
public class UserDto implements Serializable {

    private static final long serialVersionUID = 9L;

    private int id;
    private String name;

    public UserDto() {
    }

    public UserDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
