package com.wpl.springboot.entity.dto;

import lombok.Data;

/**
 * @date 2022/4/8
 */

@Data
public class UserPasswordDTO {
    private String username;
    private String password;
    private String newPassword;
}
