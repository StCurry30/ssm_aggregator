package cn.itcast.mapper;

import cn.itcast.domain.MyUser;

import java.util.List;

/**
 * @author love
 * @version v1.0
 * @project itcast-parent
 * @package cn.itcast.mapper
 * @date 2019/6/7 20:48
 * @description TODO
 **/
public interface UserMapper {
    /**
     * 查询所有用户
     * @return
     */
    List<MyUser> findAllUsers();

    /**
     * 保存用户
     * @param user
     */
    void saveUser(MyUser user);
}
