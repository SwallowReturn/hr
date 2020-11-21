package com.hr.two.controller;

import com.hr.two.entity.User;
import com.hr.two.entity.UserRoleVo;
import com.hr.two.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller("userController")
@RequestMapping("/user")
public class UserController {



    @Autowired
    private UserService userService;


    //项目经理查询所有普通员工
    @RequestMapping(value = "/alluser")
   public String allUser(Map<String,Object> map){
        map.put("list",userService.selectAll());
        return "right";


    }



}
