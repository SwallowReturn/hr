package com.hr.two.service;



import com.hr.two.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    /**
     * throw Exception
     * 项目经理查询所有普通员工
     * @return
     */
    List<User> selectAll();



}
