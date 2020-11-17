package cn.hrgp.hr.service.impl;

import cn.hrgp.hr.dao.UserTableDao;
import cn.hrgp.hr.entity.UserTable;
import cn.hrgp.hr.service.UserTableService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserTableServiceImpl implements UserTableService {

    @Autowired
    private UserTableDao userTableDao;
    public int insert(UserTable userTable) {
        return 0;
    }

    public int update(UserTable userTable) {
        return 0;
    }

    public int delete(Integer USER_ID) {
        return 0;
    }

    public UserTable selectById(Integer id) {
        return null;
    }

    public List<UserTable> allUser() {
        return userTableDao.allUser();
    }

    public List<UserTable> UserOfName(String USER_NAME) {
        return null;

    }
}
