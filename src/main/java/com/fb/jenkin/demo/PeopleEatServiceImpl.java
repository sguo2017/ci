package com.fb.jenkin.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleEatServiceImpl implements PeopleEatService {

    @Autowired
    private EatCompentConfig eatCompentConfig;

    @Override
    public int eatService() {
        System.out.println("eatService 执行");
        return eatCompentConfig.eatConfig;
    }
}