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

    /**
     * JPA 的增、删、改、查
     *
     * @return
     */
    @GetMapping("testUserById")
    public void getUser() {
        String id = "12345";
        User user = new User();
        user.setId(id);
        user.setAge(23);
        //新增
        iUserRepository.save(user);

        //查找
        user = iUserRepository.findOne(id);

        //修改
        user.setAge(12);
        iUserRepository.save(user);

        //删除
        iUserRepository.delete(user);

    }
}
