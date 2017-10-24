package com.ms.jpa.user.controller;

import com.ms.jpa.user.dao.IUserRepository;
import com.ms.jpa.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: WWW.MINIITS.COM
 * @Date: 2017/10/24
 * @Time: 20:48
 * <p>
 * Description:
 * ***
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserRepository iUserRepository;

    @GetMapping("findUserById/{id}")
    public User getUser(@PathVariable(name = "id") String id) {
       return iUserRepository.findOne(id);
    }
}
