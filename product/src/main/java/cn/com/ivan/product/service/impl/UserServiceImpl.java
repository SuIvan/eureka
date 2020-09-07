package cn.com.ivan.product.service.impl;

import cn.com.ivan.product.dao.UserDao;
import cn.com.ivan.product.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public List<User> findAllUsers() {
        return userDao.findAll();
    }
}
