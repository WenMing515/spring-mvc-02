package cn.wm.service.impl;

import cn.wm.bean.User;
import cn.wm.mapper.UserMapper;
import cn.wm.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
