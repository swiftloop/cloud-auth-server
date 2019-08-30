package com.pinpin.cloud.auth.config;

import com.pinpin.cloud.auth.entity.User;
import com.pinpin.cloud.auth.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author sorata
 * @date 2019-08-29 15:10
 */
public class WebUserDetailService implements UserDetailsService {

    private UserService userService;

    public WebUserDetailService(UserService userService){
        this.userService = userService;
    }


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        if (s == null) {
            throw new UsernameNotFoundException("用户名不能为空");
        }

        User user = userService.findByUsername(s);
        if (user == null){
            throw new UsernameNotFoundException("未找到用户");
        }

        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(), user.getEnable(),
                true,true,true,userService.authorities(user.getId()));

    }
}
