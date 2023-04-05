package ru.dexason.pp_3_2_1_springboot.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.dexason.pp_3_2_1_springboot.model.User;
import ru.dexason.pp_3_2_1_springboot.repositories.UserRepositories;


import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {
    private final UserRepositories userRepositories;

    public UserServiceImp(UserRepositories userRepositories) {
        this.userRepositories = userRepositories;
    }

    @Transactional
    @Override
    public void save(User user) {
        userRepositories.save(user);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> findAll() {
        return userRepositories.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public User findOne(int id) {
        Optional<User> foundUser = userRepositories.findById(id);
        return foundUser.orElse(null);
    }

    @Transactional
    @Override
    public void update(int id, User updatedUser) {
        updatedUser.setId(id);
        userRepositories.save(updatedUser);
    }

    @Transactional
    @Override
    public void delete(int id) {
        userRepositories.deleteById(id);
    }
}
