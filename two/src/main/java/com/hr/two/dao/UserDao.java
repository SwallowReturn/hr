package com.hr.two.dao;

import com.hr.two.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {
    /**
     * throw Exception
     * 项目经理查询所有的普通员工
     * @return
     */
     List<User> selectAll();


}
