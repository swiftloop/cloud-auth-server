package com.pinpin.cloud.auth.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

/**
 * @author sorata
 * @date 2019-08-29 15:40
 */
@Table(name = "sys_user_role")
@Entity
@Data
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户的id 每个账户只能拥有一种角色
     */
    @Column(unique = true)
    private Integer userId;

    /**
     * 角色id Role表
     */
    private Integer roleId;


    private Boolean enable;

    private Instant created;

}
