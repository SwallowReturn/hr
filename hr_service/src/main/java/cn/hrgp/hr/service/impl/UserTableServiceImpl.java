package cn.hrgp.hr.service.impl;

import cn.hrgb.hr.domain.UserTable;
import cn.hrgp.hr.dao.UserTableDao;
import cn.hrgp.hr.service.UserTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("usertable")
@Transactional
public class UserTableServiceImpl implements UserTableService {

    @Autowired
    private UserTableDao userTableDao;



    @Override
    public int insert(UserTable userTable) {
        return 0;
    }

    @Override
    public int update(UserTable userTable) {
        return 0;
    }

    @Override
    public int delete(Integer USER_ID) {
        return 0;
    }

    @Override
    public UserTable selectById(Integer id) {
        return null;
    }

    @Override
    public List<UserTable> allUser() {
        return userTableDao.allUser();
    }

    @Override
    public List<UserTable> UserOfName(String USER_NAME) {
        return null;
    }
}
