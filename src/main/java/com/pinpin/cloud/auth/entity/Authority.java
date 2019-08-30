package com.pinpin.cloud.auth.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

/**
 * @author sorata
 * @date 2019-08-29 15:15
 *
 * 权限表
 */
@Table(name = "sys_authority")
@Entity
@Data
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String authority;

    private Boolean enable;

    private Instant created;

}
