//package com.example.demo.service.impl;
//
//
//import com.ufi.springboottest.dao.TestAutoMapper;
//import com.ufi.springboottest.entity.TestAuto;
//import com.ufi.springboottest.entity.TestParent;
//import com.ufi.springboottest.service.TestAutoService;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.Resource;
//import java.util.List;
//
//
//@Service
//public class TestAutoServiceImpl implements TestAutoService  {
//        @Resource
//        TestAutoMapper testAutoMapper;
//
//
//    @Override
//    public List<TestAuto> getAllUser() {
//        return testAutoMapper.getAllUser();
//    }
//
//    @Override
//    public void testParentId(TestParent testParent) {
//        testAutoMapper.insertP(testParent);
//    }
//
//    @Override
//    public void testAuto(TestAuto testAuto) {
//        testAutoMapper.insertA(testAuto);
//    }
//
//    @Override
//    public void selectAll() {
//        System.out.println("测试");
//    }
//
//}
