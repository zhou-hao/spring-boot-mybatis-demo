package org.hsweb.demo.service;

import org.hsweb.demo.po.User;

import java.util.List;

public interface UserService {
    User selectById(String id);
    User selectByUserName(String username);

    List<User> selectAll();

    String insert(User user);

    boolean update(User user);

    boolean delete(String id);
}
