package com.pinpin.cloud.auth.dao;

import com.pinpin.cloud.auth.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author sorata
 * @date 2019-08-29 15:57
 */
public interface AuthorityDao extends JpaRepository<Authority,Integer> {
}
