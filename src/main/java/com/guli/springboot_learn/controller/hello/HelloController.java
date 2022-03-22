package com.guli.springboot_learn.controller.hello;

import com.guli.springboot_learn.bean.Person1;
import com.guli.springboot_learn.bean.Person2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    private Person1 person1;
    @Autowired
    private Person2 person2;

    @ResponseBody
    @RequestMapping("/hello/person1")
    public Person1 helloPerson1() {
        return person1;
    }

    @ResponseBody
    @RequestMapping("/hello/person2")
    public Person2 helloPerson2() {
        return person2;
    }

}
