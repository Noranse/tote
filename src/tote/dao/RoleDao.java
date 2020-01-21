package tote.dao;

import java.util.List;

import tote.entity.Role;

public interface RoleDao extends Dao<Role> {

    List<Role> findAll();

    void deleteUsersRoles(Long uid);

    Role getRole(String name);

    void addUsersRole(Long uid, Long rid);
}
