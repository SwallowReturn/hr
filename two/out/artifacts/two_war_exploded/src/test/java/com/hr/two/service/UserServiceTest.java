package com.hr.two.service;

import com.hr.two.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {
    @Autowired
   private UserService userService;

    @Test
    public void selectAll() {

        List<User> allUser=userService.selectAll();
        for (User u:allUser
        ) {
            System.out.println(u.toString());
        }

    }
}