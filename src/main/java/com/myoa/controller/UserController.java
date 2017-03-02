package com.myoa.controller;

import com.myoa.entity.User;
import com.myoa.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping(value = "/user")
    public String showUser(Model model,@ModelAttribute User user) throws Exception {

        if (user == null){
            model.addAttribute("user", new User());
        }
        List<User> userList = userService.getAll();
        model.addAttribute("userList",userList);
        return "login";
    }

    @RequestMapping(value = "/userSave")
    public String saveUser(@ModelAttribute User user) throws Exception {
        userService.save(user);
        return "redirect:/user";
    }

    @RequestMapping(value = "/user/{uid}.html")
    public String deleteUser(@PathVariable Long uid) throws Exception {
        userService.delete(uid);
        return "redirect:/user";
    }
}
