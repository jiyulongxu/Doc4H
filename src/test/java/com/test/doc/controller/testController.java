package com.test.doc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/test")
public class testController {

    /**
     * @title 方法一
     * @param a
     * @param b
     * @return a+b
     */
    @RequestMapping(value="/sssaaa")
    public String mian(String a,String b){

        return a+b;
    }

}
