package com.ilovesshan.yunservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: ilovesshan
 * @date: 2022/12/1
 * @description:
 */

@RestController
public class IndexController {

    @GetMapping
    public String index() {
        return "hello IndexController...";
    }
}
