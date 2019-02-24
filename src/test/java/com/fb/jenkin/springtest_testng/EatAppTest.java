package com.fb.jenkin.springtest_testng;

import com.fb.jenkin.JenkinApplication;
import com.fb.jenkin.demo.PeopleEatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@SpringBootTest(classes = { JenkinApplication.class })
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public class EatAppTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private PeopleEatService peopleEatServiceImpl;

    @Test(groups = "eatOne")
    public void test1(){
        int i = peopleEatServiceImpl.eatService();
        System.out.println(i * 1);
    }

    @Test(groups = "eatTen")
    public void test2(){
        int i = peopleEatServiceImpl.eatService();
        System.out.println(i*10);
    }

    @Parameters({"a","b"})
    @Test(groups = "eatTenAB")
    public void test3(int a , int b){
        int i = peopleEatServiceImpl.eatService();
        System.out.println(i*10);
        System.out.println(a+b);
    }
}