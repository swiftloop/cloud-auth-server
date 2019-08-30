package com.pinpin.cloud.auth.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

/**
 * @author sorata
 * @date 2019-08-29 15:19
 *
 * 角色表
 */
@Table(name = "sys_role")
@Entity
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String role;

    private Boolean enable;

    private Instant created;

}
