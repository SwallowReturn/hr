package cn.hrgp.hr.dao;

import cn.hrgb.hr.domain.UserTable;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserTableDao {

    /**
     * 添加
     * @param userTable
     * @return
     */
    public int insert(UserTable userTable);
    /**
     * 修改
     * @param userTable
     */
    public int update(UserTable userTable);

    /**
     * 删除
     * @param USER_ID
     */
    public int delete(Integer USER_ID);

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    public UserTable selectById(Integer id);

    /**
     * throw Exception
     * 查询所有
     * @return
     */
    @Select("select * from HR_USER_TABLE")
    public List<UserTable> allUser();

    /**
     * 根据歌手名字模糊查询
     */
    public List<UserTable> UserOfName(String USER_NAME);


}
