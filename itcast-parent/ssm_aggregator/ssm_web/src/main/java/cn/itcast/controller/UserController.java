package cn.itcast.controller;

import cn.itcast.domain.MyUser;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author love
 * @version v1.0
 * @project itcast-parent
 * @package cn.itcast.controller
 * @date 2019/6/7 18:02
 * @description TODO
 **/
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询所有用户
     * @return
     */

    @RequestMapping("list")
    public String list(Model model){
        List<MyUser> userList = userService.findAllUsers();
        model.addAttribute("users",userList);
        return "users";
    }


    @RequestMapping("toAdd")
    public String toAdd(){
        return "userAdd";
    }

    @RequestMapping("save")
    public String save(MyUser user){
        userService.saveUser(user);
        return "redirect:/user/list";
    }

}
