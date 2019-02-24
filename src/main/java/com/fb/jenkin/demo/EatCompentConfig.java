package com.fb.jenkin.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EatCompentConfig {

    @Value("${eat.comfig}")
    int eatConfig;

}
