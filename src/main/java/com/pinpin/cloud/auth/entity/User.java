package com.pinpin.cloud.auth.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

/**
 * @author sorata
 * @date 2019-08-29 15:11
 */
@Table(name = "sys_user")
@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 36)
    private String username;

    @Column
    private String password;

    /**
     * 用户名
     */
    private String alias;

    private Boolean enable;
    /**
     * 登录时间
     */
    private String loginTime;
    /**
     * 登录时的ip
     */
    private String loginIp;
    /**
     * 上次登录时的ip
     */
    private String lastIp;
    /**
     * 退出时间
     */
    private String logoutTime;
    /**
     * 上次登录时间
     */
    private String lastLoginTime;

    private Instant created;

}
