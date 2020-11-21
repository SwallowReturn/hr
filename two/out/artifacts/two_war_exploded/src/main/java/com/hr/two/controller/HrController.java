package com.hr.two.controller;

import com.hr.two.entity.Power;
import com.hr.two.entity.User;
import com.hr.two.entity.UserResign;
import com.hr.two.entity.UserRoleVo;
import com.hr.two.service.impl.HrServiceImpl;
import oracle.jdbc.OracleTypes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HrController {

    @Resource
    private HrServiceImpl service;

    @RequestMapping("/")
    public String init(){
        return "login";
    }
    //登录，判断工号和密码是否正确，正确则把用户信息以及角色等级存入session
    @RequestMapping("islogin")
    public String islogin(String USERNUM, String USERPWD, HttpServletRequest request){
        HttpSession session=request.getSession();
        if(USERNUM!=null&&USERNUM!=""){
            Map<String,Object> param=new HashMap<String, Object>();
            param.put("vi_USER_NUM",USERNUM);
            param.put("vi_USER_PWD",USERPWD);
            param.put("map",OracleTypes.CURSOR);

            List<UserRoleVo> list=service.selUserByNum(param);
            UserRoleVo userRole=list.get(0);
            System.out.println(userRole.getUR_USERNUM());
            String msg="";
            if(userRole.getUSER_NUM().equals("FNUM")){
                //说明员工号有问题
                msg="工号不存在";
            }else if(userRole.getUSER_NUM().equals("FPWD")){
                //密码不正确
                msg="密码错误!";
            }else{
                //工号密码都正确
                session.setAttribute("UserRole",userRole);
                return "redirect:/index";
            }
            request.setAttribute("msg",msg);
        }
        return "login";
    }
    //登录成功，进入主页面
    @RequestMapping("index")
    public String index(HttpServletRequest request){
        HttpSession session=request.getSession();
        Map<String,Object> param=new HashMap<String, Object>();
        UserRoleVo userRoleVo= (UserRoleVo) session.getAttribute("UserRole");
        param.put("vi_ROLE_NUM",userRoleVo.getUR_ROLENUM());
        param.put("map",OracleTypes.CURSOR);
        List<Power> powerList=service.selPowerByRoleNum(param);
        session.setAttribute("PowerList",powerList);
        return "main";
    }
    //员工功能
    // -----1.查看自己信息
    @RequestMapping("getUser")
    public String getUser(){
        return "user";
    }
    //-----1_2.修改自己信息(只能修改密码)
    @RequestMapping("updateUser")
    public String updateUser(String User_PWD){
        if(User_PWD!=null&&User_PWD!=""){
            service.updateUserByNum(User_PWD);
        }
        return "redirect:/getUser";
    }
    //-----2.打卡,设定为公司九点上班，九点之前可以进行打卡，过了九点视为旷工
    @RequestMapping("clockUpdate")
    public String clockUpdate(String User_Num){
        service.clockUpdateStatus(User_Num);
        return "main";
    }
    //-----3.提交离职申请
    @RequestMapping("gitResign")
    public String gitResign(UserResign userResign){

        return "";
    }



}
