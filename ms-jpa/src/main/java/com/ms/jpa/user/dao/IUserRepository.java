package com.ms.jpa.user.dao;

import com.ms.jpa.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: wq
 * @Date: 2017/10/16
 * @Time: 23:00
 * <p>
 * Description:
 * ***
 */
public interface IUserRepository extends JpaRepository<User, String> {

}
