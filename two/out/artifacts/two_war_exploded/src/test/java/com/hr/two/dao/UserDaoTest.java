package com.hr.two.dao;

import com.hr.two.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void selectAll() {

        List<User> allUser=userDao.selectAll();
        for (User u:allUser
        ) {
            System.out.println(u.toString());
        }

    }
}