package com.pinpin.cloud.auth.dao;

import com.pinpin.cloud.auth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author sorata
 * @date 2019-08-29 15:44
 */

public interface UserDao extends JpaRepository<User,Integer> {
    /**
     * 根据用户名查询用户
     * @param username username
     * @return User
     */
    User findByUsername(String username);
}
