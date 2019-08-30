package com.pinpin.cloud.auth.service;

import com.pinpin.cloud.auth.dao.AuthorityDao;
import com.pinpin.cloud.auth.entity.Authority;
import org.springframework.stereotype.Service;

/**
 * @author sorata
 * @date 2019-08-29 16:11
 */
@Service
public class AuthorityService {

    private final AuthorityDao authorityDao;

    public AuthorityService(AuthorityDao authorityDao) {
        this.authorityDao = authorityDao;
    }


    public Authority findById(Integer id) {
        return authorityDao.findById(id).orElse(null);
    }

}
