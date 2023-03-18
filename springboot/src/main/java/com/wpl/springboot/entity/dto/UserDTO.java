package com.wpl.springboot.entity.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wpl.springboot.entity.Menu;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

/**
 * 接受前端登录请求的参数
 */
@Data
public class UserDTO {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private String identityNum;
    private String birthday;
    private String email;
    private String avatarUrl;
    private String token;
    private String role;
    private List<Menu> menus;
}