package cn.wm.mapper;

import cn.wm.bean.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {
    User login(User user);

    List<User> findAll();

    int deleteByPrimaryKey(Integer id);

    int insert(User user);

    int insertSelective(User user);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}