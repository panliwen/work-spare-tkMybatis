package com.example.demo.rest;

import com.example.demo.entity.*;
import com.example.demo.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestUser {

    @Autowired
    private UserService userService;


    @GetMapping( "/getUseVo")
    public UserVo getUseVo() {

        UserVo userVo = userService.getUseVo();
        return userVo;
    }

    @GetMapping( "/getUserAll")
    public List<User> getUserAll() {

        List<User> userList = userService.getUserAll();
        return userList;
    }

    @GetMapping( "/getUser11All")
    public List<User11> getUser11All() {

        List<User11> user11List = userService.getUser11All();
        return user11List;
    }



    @PostMapping("/insert")
    public String insert(
            @Param("username") String username,
            @Param("age") String age,
            @Param("sex") String sex) {
        User user = new User();
        user.setUsername(username);
        user.setAge(age);
        user.setSex(sex);

        userService.insertUser11(user);
        System.out.println(user.getId()+"--------------------");
        return "插入成功";
    }
    @GetMapping("/getkeyId")
    public String getkeyId(@Param("id") Long id) {

        User user = userService.getKeyUserById(id);
        return user.getUsername();
    }

    @PostMapping("/insert22")
    public String insert22(
            @Param("id") Long id,
            @Param("username") String username,
            @Param("age") String age,
            @Param("sex") String sex) {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setAge(age);
        user.setSex(sex);
        userService.insertUser(user);

        System.out.println(user.getId()+"--------------------");
        return "插入成功";
    }

    @PostMapping("/haha")
    public String selehndj(@Param("name")String name,@Param("age") int age) {

        TestAuto testAuto = new TestAuto();
        testAuto.setName(name);
        testAuto.setAge(age);

        userService.testAuto(testAuto);

        TestParent testParent= new TestParent();
        testParent.setParentId(testAuto.getId());

        userService.testParentId(testParent);

        System.out.println(testAuto.getId()+"+++++++++++++++++++");
        return "成功怼入数据建库";
    }

    /**
     * 测试使用主键key的方式进行使用条件查询语句
     */
    @GetMapping("/example")
    public List<User> getExampleByKeyName(@Param("id") int id,@Param("username") String username){
        List<User> listUser=userService.findByKeyIdAndUsername(id,username);
        return listUser;
    }

}