package com.fb.jenkin.springtest_testng;

import com.fb.jenkin.demo.EatCompentConfig;
import com.fb.jenkin.demo.PeopleEatService;
import com.fb.jenkin.demo.PeopleEatServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest(classes = { PeopleEatServiceImpl.class , EatCompentConfig.class })
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public class EatServiceTest extends AbstractTestNGSpringContextTests {

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
}