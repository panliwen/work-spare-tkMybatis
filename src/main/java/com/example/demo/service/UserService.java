package com.example.demo.service;

import com.example.demo.entity.*;

import java.util.List;

public interface UserService  {

    void insertUser(User user);

    void testParentId(TestParent testParent);

    void testAuto(TestAuto testAuto);

    void insertUser11(User user);

    /**
     * 条件筛选的内容
     * @param id
     * @param username
     * @return
     */
    List<User> findByKeyIdAndUsername(int id, String username);

    /**
     * 使用key主键查询对应的数据信息
     * @param id
     * @return
     */
    User getKeyUserById(Long id);

    /**
     * 获取所有用户的信息
     * 使用Vo将两个数据库的表使用Vo封装返回给前端页面的数据
     * @return
     */
    UserVo getUseVo();

    /**
     * 获取所有用户信息列表
     * @return  用户集合
     */
    List<User> getUserAll();

    /**
     * 获取所有用户列表
     * @return  用户集合
     */
    List<User11> getUser11All();
}
