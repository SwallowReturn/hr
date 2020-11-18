package cn.hrgp.hr.controller;

import cn.hrgb.hr.domain.UserTable;
import cn.hrgp.hr.service.UserTableService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/usertable")
public class UserTableController {

    @Autowired

    private UserTableService userTableService;

    @RequestMapping("/allUser.do")
    public ModelAndView allUser(){
        ModelAndView mv = new ModelAndView();
        List<UserTable> userList = userTableService.allUser();
        PageInfo pageInfo=new PageInfo(userList);
        mv.addObject("pageInfo", pageInfo);
        mv.setViewName("user-table");
        return mv;
    }

}
