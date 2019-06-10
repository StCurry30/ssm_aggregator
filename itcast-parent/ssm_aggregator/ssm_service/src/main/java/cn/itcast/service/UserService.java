package cn.itcast.service;

import cn.itcast.domain.MyUser;

import java.util.List;

/**
 * @author love
 * @version v1.0
 * @project itcast-parent
 * @package cn.itcast.service
 * @date 2019/6/8 14:37
 * @description TODO
 **/
public interface UserService {

    /**
     * 查找所有用户
     * @return
     */
    List<MyUser> findAllUsers();

    /**
     * 保存用户
     * @param user
     */
    void saveUser(MyUser user);
}
