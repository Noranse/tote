package tote.dao;

import java.util.List;

import tote.entity.User;

public interface UserDao extends CrudDao<Long, User> {

    List<User> findAll();

    User getUser(String username);

    // User createUser(User user);
}
