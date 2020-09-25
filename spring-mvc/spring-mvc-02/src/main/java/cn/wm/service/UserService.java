package cn.wm.service;

import cn.wm.bean.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {

    User login(User user);

    List<User> findAll();

}
