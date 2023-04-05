package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> findAll();
    User findOne(int id);
    void update(int id, User updatedUser);
    void delete(int id);
}
