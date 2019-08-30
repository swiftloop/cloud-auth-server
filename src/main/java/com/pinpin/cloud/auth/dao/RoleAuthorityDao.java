package com.pinpin.cloud.auth.dao;

import com.pinpin.cloud.auth.entity.RoleAuthority;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author sorata
 * @date 2019-08-29 15:58
 */
public interface RoleAuthorityDao extends JpaRepository<RoleAuthority,Integer> {

    /**
     * 查询该角色下所以的权限
     * @param roleId 角色id
     * @return 该角色拥有的全部权限
     */
    List<RoleAuthority> findByRoleId(Integer roleId);
}
