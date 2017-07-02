package me.garen.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wenmx on 2017/7/2.
 */
@Controller
@EnableAutoConfiguration
public class BaseController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";

    }
}
