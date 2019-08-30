package com.pinpin.cloud.auth.service;

import com.pinpin.cloud.auth.dao.RoleAuthorityDao;
import com.pinpin.cloud.auth.entity.RoleAuthority;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sorata
 * @date 2019-08-29 16:07
 */
@Service
public class RoleAuthorityService {

    private final RoleAuthorityDao roleAuthorityDao;

    public RoleAuthorityService(RoleAuthorityDao roleAuthorityDao) {
        this.roleAuthorityDao = roleAuthorityDao;
    }


    public List<RoleAuthority> findByRoleId(Integer roleId){
        return roleAuthorityDao.findByRoleId(roleId);
    }

}
