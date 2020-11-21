package com.hr.two.service.impl;


import com.hr.two.dao.UserDao;
import com.hr.two.entity.User;
import com.hr.two.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    /**
     * 项目经理查询所有普通员工
     * @return
     */
    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }


}
