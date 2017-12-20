package com.ms.jpa.user.controller;

import com.ms.jpa.user.dao.IUserRepository;
import com.ms.jpa.user.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserRepository iUserRepository;

    /**
     * Repository实现：
     * JPA 的增、删、改、查
     *
     * @return
     */
    @GetMapping("user")
    public void getUser() {
        User user = new User();
        user.setAge(23);
        user.setName("user_name");
        //新增
        user = iUserRepository.save(user);
        logger.info("新增" + user.toString());
        //查找 1
        user = iUserRepository.findOne(user.getId());
        logger.info("查找 1" + user.toString());

        //查找 2
        user = iUserRepository.selectByQuery(user.getId());
        logger.info("查找 2" + user.toString());

        //查找 3
        user = iUserRepository.selectByNativeQuery(user.getId());
        logger.info("查找 3" + user.toString());

        //查找 4
        user = iUserRepository.findById(user.getId());
        logger.info("查找 4" + user.toString());

        //查找 5
        user = iUserRepository.findByIdAndAge(user.getId(), user.getAge());
        logger.info("查找 5" + user.toString());

        //查找 6
        List<User> users = iUserRepository.findByNameLike(user.getName());
        logger.info("查找 6" + users.toString());

        //修改 1
        user.setAge(12);
        iUserRepository.save(user);
        logger.info("修改 1" + user.toString());

        //修改 2
        // iUserRepository.modify(user.getId(), 5, "classes");
        //logger.info("修改 2" + user.toString());

        //删除 1
        iUserRepository.delete(user);

        //删除 2
//        iUserRepository.del(user);

        //删除 3
//        iUserRepository.deleteById(user);

    }
}
