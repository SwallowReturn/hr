package com.hr.two.service.impl;

import com.hr.two.dao.HrDao;
import com.hr.two.entity.Power;
import com.hr.two.entity.User;
import com.hr.two.entity.UserResign;
import com.hr.two.entity.UserRoleVo;
import com.hr.two.service.HrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class HrServiceImpl implements HrService {

    @Resource
    private HrDao dao;


    @Override
    public List<UserRoleVo> selUserByNum(Map<String, Object> map) {
       dao.selUserByNum(map);
       List<UserRoleVo> userRoleVoList=(List<UserRoleVo>)map.get("map");
       return userRoleVoList;
    }

    @Override
    public List<Power> selPowerByRoleNum(Map<String, Object> map) {
        dao.selPowerByRoleNum(map);
        List<Power> powerList=(List<Power>) map.get("map");
        return powerList;
    }

    @Override
    public int updateUserByNum(String USER_PWD) {
        return dao.updateUserByNum(USER_PWD);
    }

    @Override
    public int clockUpdateStatus(String USERNUM) {
        return dao.clockUpdateStatus(USERNUM);
    }

    @Override
    public int addUserResign(UserResign userResign) {
        return 0;
    }
}
