package com.example.demo.service;

import com.example.demo.entity.TestAuto;
import com.example.demo.entity.TestParent;
import com.example.demo.entity.User;

import java.util.List;

public interface UserService  {

    void insertUser(User user);

    void testParentId(TestParent testParent);

    void testAuto(TestAuto testAuto);

    void insertUser11(User user);


    List<User> findByKeyIdAndUsername(int id, String username);

    List<User> getAllUser();
}
