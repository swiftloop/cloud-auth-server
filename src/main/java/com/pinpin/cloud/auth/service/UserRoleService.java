package com.pinpin.cloud.auth.service;

import com.pinpin.cloud.auth.dao.UserRoleDao;
import com.pinpin.cloud.auth.entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sorata
 * @date 2019-08-29 15:59
 */
@Service
public class UserRoleService {

    private final UserRoleDao userRoleDao;

    public UserRoleService(UserRoleDao userRoleDao) {
        this.userRoleDao = userRoleDao;
    }


    public UserRole findByUserId(Integer userId){
        return userRoleDao.findByUserId(userId);
    }

}
