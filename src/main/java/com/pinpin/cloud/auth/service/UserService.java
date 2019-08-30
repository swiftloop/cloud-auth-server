package com.pinpin.cloud.auth.service;

import com.pinpin.cloud.auth.dao.UserDao;
import com.pinpin.cloud.auth.entity.Authority;
import com.pinpin.cloud.auth.entity.RoleAuthority;
import com.pinpin.cloud.auth.entity.User;
import com.pinpin.cloud.auth.entity.UserRole;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sorata
 * @date 2019-08-29 15:45
 */
@Service
public class UserService {

    private final UserDao userDao;
    private final UserRoleService userRoleService;
    private final RoleAuthorityService roleAuthorityService;
    private final AuthorityService authorityService;

    public UserService(UserDao userDao, UserRoleService userRoleService, RoleAuthorityService roleAuthorityService, AuthorityService authorityService) {
        this.userDao = userDao;
        this.userRoleService = userRoleService;
        this.roleAuthorityService = roleAuthorityService;
        this.authorityService = authorityService;
    }

    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }


    public List<GrantedAuthority> authorities(Integer userId) {
        if (userId == null) {
            return new ArrayList<>();
        }
        ArrayList<GrantedAuthority> authorities = new ArrayList<>();
        UserRole userRole = userRoleService.findByUserId(userId);
        if (userRole == null) {
            return new ArrayList<>();
        }
        List<RoleAuthority> authorityList = roleAuthorityService.findByRoleId(userRole.getRoleId());
        authorityList.forEach(x -> {
            Authority authority = authorityService.findById(x.getAuthId());
            if (authority != null) {
                authorities.add(new SimpleGrantedAuthority(authority.getAuthority()));
            }
        });

        return authorities;
    }


}
