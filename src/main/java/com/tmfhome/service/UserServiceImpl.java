package com.tmfhome.service;

import com.tmfhome.dao.UserMapper;
import com.tmfhome.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    //service 调 dao
    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public int addUser(Users users) {
        return userMapper.addUser(users);
    }

    @Override
    public int deleteUser(int userNum) {
        return userMapper.deleteUser(userNum);
    }

    @Override
    public int updateUser(Users users) {
        return userMapper.updateUser(users);
    }

    @Override
    public Users queryUserByUserNum(int userNum) {
        return userMapper.queryUserByUserNum(userNum);
    }

    @Override
    public List<Users> queryAllUser() {
        return userMapper.queryAllUser();
    }
}
