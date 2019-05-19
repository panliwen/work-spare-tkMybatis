package com.example.demo.dao;

import com.example.demo.entity.TestAuto;
import com.example.demo.entity.TestParent;
import com.example.demo.entity.User;
import tk.mybatis.mapper.common.Mapper;


@org.apache.ibatis.annotations.Mapper
public interface UserDao extends Mapper<User> {

    void insertA(TestAuto testAuto);

    void insertP(TestParent testParent);

    void insertUser11(User user);


}