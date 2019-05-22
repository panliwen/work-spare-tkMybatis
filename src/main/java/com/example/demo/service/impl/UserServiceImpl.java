package com.example.demo.service.impl;


import com.example.demo.dao.User11Dao;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.*;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private User11Dao user11Dao;


    @Override
    public void insertUser(User user) {
        userDao.insert(user);
        System.out.println(user.getId()+"+++++++++++++++++++");
    }

    @Override
    public void testParentId(TestParent testParent) {
        userDao.insertP(testParent);
    }

    @Override
    public void testAuto(TestAuto testAuto) {
        userDao.insertA(testAuto);
    }

    /**
     * 这个是测试使用返回主键id值的数据信息User
     * @param user
     */
    @Override
    public void insertUser11(User user) {
        userDao.insertUser11(user);
    }


    /**
     * 条件筛选的内容
     * @param id
     * @param username
     * @return
     */
    @Override
    public List<User> findByKeyIdAndUsername(int id, String username) {

        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id",id);
        criteria.andEqualTo("username",username);

        List<User> users = userDao.selectByExample(example);

        return users;
    }
    /**
     * 获取所有用户的信息
     * 使用Vo将两个数据库的表使用Vo封装返回给前端页面的数据
     * @return
     */
    @Override
    public UserVo getUseVo() {

        UserVo userVo= new UserVo();

        List<User> userList = userDao.selectAll();
        List<User11> user11s = user11Dao.selectAll();

        userVo.setUserList(userList);
        userVo.setUser11List(user11s);


        return userVo;
    }

    /**
     * 使用key主键查询对应的数据信息
     * @param id
     * @return
     */
    public User getKeyUserById(Long id) {
        return userDao.selectByPrimaryKey(id);
    }

    /**
     * 获取所有用户信息列表
     *
     * @return 用户集合
     */
    @Override
    public List<User> getUserAll() {
        return userDao.selectAll();
    }

    /**
     * 获取所有用户列表
     *
     * @return 用户集合
     */
    @Override
    public List<User11> getUser11All() {
        return user11Dao.selectAll();
    }
}
