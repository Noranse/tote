package tote.dao.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import tote.dao.RoleDao;
import tote.entity.Role;

public class RoleMapper extends SqlSessionDaoSupport implements RoleDao {
    @Override
    public List<Role> findAll() {
        return getSqlSession().selectList("tote.dao.RoleDao.findAll");
    }

    @Override
    public void deleteUsersRoles(Long uid) {
        getSqlSession().delete("tote.dao.RoleDao.deleteUsersRoles", uid);
    }

    @Override
    public Role getRole(String name) {
        return getSqlSession().selectOne("tote.dao.RoleDao.getRole", name);
    }

    @Override
    public void addUsersRole(Long uid, Long rid) {
        Map<String, Long> map = new HashMap<String, Long>();
        map.put("uid", uid);
        map.put("rid", rid);
        getSqlSession().insert("tote.dao.RoleDao.addUsersRole", map);
    }

}
