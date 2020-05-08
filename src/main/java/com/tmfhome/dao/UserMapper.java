package com.tmfhome.dao;

import com.tmfhome.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    //增加一个用户
    int addUser(Users users);

    //删除一个用户
    int deleteUser(@Param("bookNum") int Num);

    //更新一个用户
    int updateUser(Users users);

    //查询一个用户
    Users queryUserByID(int id);

    //查询全部用户
    List<Users> queryAllUser();
}


