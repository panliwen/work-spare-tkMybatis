package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
   private UserServiceImpl userService;

    @Test
    public void contextLoads() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");


        Date date= dateFormat.parse("2019-5-23");

        User user = new User();
        user.setDate(date);

        List<User> userDate = userService.getUserDateEquels(user);
        for (User suser : userDate) {
            System.out.println(suser.toString());
            System.out.println(dateFormat.format(suser.getDate())+"====2222222222");
        }

        System.out.println(userDate.toString());

    }
    @Test
    public void testInsert() throws ParseException {
        userService.getUserDate();

    }
    @Test
    public void test6() throws ParseException {
        userService.getUserDateEquels(new User());

    }

}
