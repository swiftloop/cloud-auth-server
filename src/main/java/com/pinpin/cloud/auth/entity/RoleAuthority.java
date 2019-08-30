package com.pinpin.cloud.auth.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

/**
 * @author sorata
 * @date 2019-08-29 15:24
 *
 *
 * 角色授权表
 */
@Table(name = "sys_role_authority",indexes = {@Index(name = "idx_role_auth",columnList = "role_id,auth_id",unique = true)})
@Entity
@Data
public class RoleAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 权限id
     */
    private Integer authId;

    /**
     * 是否启用
     */
    private Boolean enable;


    private Instant created;


}
