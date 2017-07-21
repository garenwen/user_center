package me.garen.controller.user;

import me.garen.models.User;
import me.garen.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by garen on 2017/7/7.
 */
@Controller
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserServices userServices;

    @RequestMapping(value = "/user" ,method = RequestMethod.POST)
    @ResponseBody
    public long user(@RequestBody User user) {



        long userId = userServices.crateUser(user);


        return userId;

    }
}
