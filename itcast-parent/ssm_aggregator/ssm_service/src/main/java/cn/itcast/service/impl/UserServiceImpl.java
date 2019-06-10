package cn.itcast.service.impl;

import cn.itcast.domain.MyUser;
import cn.itcast.mapper.UserMapper;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author love
 * @version v1.0
 * @project itcast-parent
 * @package cn.itcast.service.impl
 * @date 2019/6/8 14:38
 * @description TODO
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    /**
     * 查找所有用户
     *
     * @return
     */
    @Override
    public List<MyUser> findAllUsers() {
        List<MyUser> userList = userMapper.findAllUsers();
        return userList;
    }

    /**
     * 保存用户
     *
     * @param user
     */

    @Override
    public void saveUser(MyUser user) {

        userMapper.saveUser(user);
    }
}
