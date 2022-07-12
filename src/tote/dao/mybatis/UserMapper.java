package tote.dao.mybatis;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import tote.dao.UserDao;
import tote.entity.User;

public class UserMapper extends SqlSessionDaoSupport implements UserDao {

    @Override
    public void create(User user) {
        getSqlSession().insert("tote.dao.UserDao.create", user);
    }

    @Override
    public User read(Long id) {
        return getSqlSession().selectOne("tote.dao.UserDao.read", id);
    }

    @Override
    public void update(User user) {
        getSqlSession().update("tote.dao.UserDao.update", user);
    }

    @Override
    public void delete(Long id) {
        getSqlSession().delete("tote.dao.UserDao.delete", id);
    }

    @Override
    public List<User> findAll() {
        return getSqlSession().selectList("tote.dao.UserDao.findAll");
    }

    @Override
    public User getUser(String username) {
        return getSqlSession().selectOne("tote.dao.UserDao.getUser", username);
    }

}
