package com.lyccccc.aop;

import org.springframework.stereotype.Component;

/**
 * Created by Lenovo on 2017/07/06.
 */
@Component
public class Actor implements Perform {
    public void perform(String name) {
        System.out.println("performing!");
        System.out.println("name : " + name);
//        int i = 1/0;
    }
}
