package com.tmfhome.service;

import com.tmfhome.pojo.Users;

import java.util.List;

public interface UserService {
    //增加一个用户
    int addUser(Users users);

    //删除一个用户
    int deleteUser(int userNum);

    //更新一个用户
    int updateUser(Users users);

    //查询一个用户
    Users queryUserByUserNum(int userNum);

    //查询全部用户
    List<Users> queryAllUser();
}
