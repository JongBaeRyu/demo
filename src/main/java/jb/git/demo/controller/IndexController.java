package jb.git.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/")
    public String home() {
        return "Hi.";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello.";
    }
}
