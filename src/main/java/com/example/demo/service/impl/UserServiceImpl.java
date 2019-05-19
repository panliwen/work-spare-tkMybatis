package com.example.demo.service.impl;


import com.example.demo.dao.UserDao;
import com.example.demo.entity.TestAuto;
import com.example.demo.entity.TestParent;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserDao userDao;


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



    @Override
    public List<User> findByKeyIdAndUsername(int id, String username) {

        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id",id);
        criteria.andEqualTo("username",username);

        List<User> users = userDao.selectByExample(example);

        return users;
    }

    @Override
    public List<User> getAllUser() {
        List<User> userList = userDao.selectAll();
        return userList;
    }
}
