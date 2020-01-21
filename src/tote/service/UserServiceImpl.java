package tote.service;

import java.util.List;
import java.util.Objects;

import tote.dao.RoleDao;
import tote.dao.UserDao;
import tote.entity.Role;
import tote.entity.User;

public class UserServiceImpl implements UserService {

    private RoleDao roleDao;

    private UserDao userDao;

    public void setRoleDao(final RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save(User user) {
        if (user.getId() == null) {
            userDao.create(user);
        } else {
            userDao.update(user);
        }

        roleDao.deleteUsersRoles(user.getId());

        if (Objects.nonNull(user.getRoles())) {
            for (Role role : user.getRoles()) {
                roleDao.addUsersRole(user.getId(), role.getId());
            }
        }
    }

    @Override
    public List<User> getUsers() {
        return userDao.findAll();
    }

    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }

    @Override
    public User getUser(Long id) {
        return userDao.read(id);
    }

    @Override
    public void add(User user) {
        userDao.create(user);
    }

    @Override
    public User getUser(String username) {
        return userDao.getUser(username);
    }
}
