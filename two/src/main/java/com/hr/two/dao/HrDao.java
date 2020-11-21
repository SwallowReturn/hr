package com.hr.two.dao;

import com.hr.two.entity.Power;
import com.hr.two.entity.User;
import com.hr.two.entity.UserResign;
import com.hr.two.entity.UserRoleVo;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


public interface HrDao {
    //根据员工工号查找用户信息以及角色级别
    List<UserRoleVo> selUserByNum(Map<String,Object> map);
    //根据角色级别查找功能
    List<Power> selPowerByRoleNum(Map<String,Object> map);

    //上班打卡
    int clockUpdateStatus(String USERNUM);
    //查看个人信息
    //修改密码
    int updateUserByNum(String USER_PWD);
    //辞职申请
    int addUserResign(UserResign userResign);
}
