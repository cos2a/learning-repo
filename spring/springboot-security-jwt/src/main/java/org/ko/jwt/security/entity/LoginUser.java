package org.ko.jwt.security.entity;

import lombok.Data;


/**
 * @author shuang.kou
 */
@Data
public class LoginUser {

    private String username;
    private String password;
    private Boolean rememberMe;

}
