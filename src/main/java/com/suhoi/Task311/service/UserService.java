package com.suhoi.Task311.service;



import com.suhoi.Task311.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> listUsers();
    void delete(User user);
    User getUserById(Long id);
}
