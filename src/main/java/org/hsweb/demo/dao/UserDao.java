package org.hsweb.demo.dao;

import org.hsweb.demo.po.User;

import java.util.List;

public interface UserDao {
    User selectById(String id);

    List<User> selectAll();

    User selectByUserName(String username);

    void insert(User user);

    int update(User user);

    int deleteById(String id);
}
