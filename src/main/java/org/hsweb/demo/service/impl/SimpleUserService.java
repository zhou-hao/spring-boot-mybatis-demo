package org.hsweb.demo.service.impl;

import org.hsweb.demo.dao.UserDao;
import org.hsweb.demo.po.User;
import org.hsweb.demo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service("userService")
@Transactional(rollbackFor = Throwable.class)
public class SimpleUserService implements UserService {


    @Resource
    private UserDao userDao;

    @Override
    @Transactional(readOnly = true)
    public User selectById(String id) {
        return userDao.selectById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public User selectByUserName(String username) {
        return userDao.selectByUserName(username);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> selectAll() {
        return userDao.selectAll();
    }

    @Override
    public String insert(User user) {
        user.setId(UUID.randomUUID().toString());
        userDao.insert(user);
        return user.getId();
    }

    @Override
    public boolean update(User user) {
        return userDao.update(user) == 1;
    }

    @Override
    public boolean delete(String id) {
        return userDao.deleteById(id) == 1;
    }
}
