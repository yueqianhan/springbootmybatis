package com.bjsxt.springbootmybatis.controller;

import com.bjsxt.springbootmybatis.pojo.User;
import com.bjsxt.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author hanyueqian
 * @date 2020/1/5 0005-下午 20:43
 */
@Controller
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserService userService;
    /**
     * 添加用户
     * @return
     */
    @PostMapping("/addUser")
    public String addUser(User user)
    {
        try
        {
            this.userService.addUser(user);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "redirect:/ok";
    }

    @RequestMapping("/showUser")
    public String showUser(Model model)
    {
        try{
            List<User>  user= this.userService.showUser();
            model.addAttribute("user", user);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "showUsers";
    }

    @GetMapping("/preUpdateUser")
    public String preUpdateUser(String id,Model model)
    {
        try{
            User user =this.userService.preUpdate(id);
            model.addAttribute("user",user);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "updateUser";
    }

    @PostMapping("/updateUser")
    public String updateUser(User user)
    {
        try
        {
            this.userService.modifyUser(user);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "redirect:/ok";
    }

    @GetMapping("/deleteUser")
    public String deleteUser(String id)
    {
        try
        {
            this.userService.deleteUser(id);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "redirect:/ok";
    }
}
