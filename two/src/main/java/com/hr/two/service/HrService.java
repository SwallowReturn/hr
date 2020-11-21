package com.hr.two.service;

import com.hr.two.entity.Power;
import com.hr.two.entity.User;
import com.hr.two.entity.UserResign;
import com.hr.two.entity.UserRoleVo;

import java.util.List;
import java.util.Map;

public interface HrService {

    List<UserRoleVo> selUserByNum(Map<String,Object> map);

    List<Power> selPowerByRoleNum(Map<String,Object> map);

    int updateUserByNum(String USER_PWD);

    int clockUpdateStatus(String USERNUM);

    int addUserResign(UserResign userResign);
}
