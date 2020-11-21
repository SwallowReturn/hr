package com.hr.two.controller;

import com.hr.two.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RequestMapping("/user")
@RestController
public class UserController {

    @Resource
    private UserService userService;



    //项目经理查询所有普通员工
    @RequestMapping("/alluser")
   public Object allUser(HttpServletRequest request){
        return userService.selectAll();
    }



}
