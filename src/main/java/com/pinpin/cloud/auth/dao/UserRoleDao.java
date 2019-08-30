package com.pinpin.cloud.auth.dao;

import com.pinpin.cloud.auth.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author sorata
 * @date 2019-08-29 15:56
 */
public interface UserRoleDao extends JpaRepository<UserRole,Integer> {

    /**
     * 根据用户的id来查询该用户的角色
     * @param userId 用户的id
     * @return UserRole
     */
    UserRole findByUserId(Integer userId);

}
