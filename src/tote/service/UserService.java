package tote.service;

import java.util.List;

import tote.entity.User;

public interface UserService {

    void save(User user);

    void add(User user);

    User getUser(Long id);

    User getUser(String username);

    List<User> getUsers();

    void delete(Long id);

}
