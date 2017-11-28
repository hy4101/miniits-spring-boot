package com.ms.jpa.user.dao;

import com.ms.jpa.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author: wq
 * @Date: 2017/10/16
 * @Time: 23:00
 * <p>
 * Description:
 * ***
 */
public interface IUserRepository extends JpaRepository<User, String> {

    /**
     * 使用jpa的查询语法
     *
     * @param id
     * @return
     */
    @Query("select u from User u where u.id =:id")
    User selectByQuery(@Param("id") String id);

    /**
     * 使用 原生SQL 的查询语法
     * 将 nativeQuery 属性设置成 true 即可
     *
     * @param id
     * @return
     */
    @Query(value = "select * from User  where id =?", nativeQuery = true)
    User selectByNativeQuery(String id);

    /**
     * 修改
     * 需要添加 @Modifying 注解
     *
     * @param id
     * @return
     */
    @Modifying
    @Query("update User u set u.age =:age,u.classes =:classes where u.id =:id")
    void modify(@Param("id") String id, @Param("age") Integer age, @Param("classes") String classes);

    /**
     * 删除
     * 需要添加 @Modifying 注解
     *
     * @param id
     * @return
     */
    @Modifying
    @Query("delete from User where id =:id")
    void del(@Param("id") String id);

    /**
     * JPA 关键字语法
     * 这边简单介绍几种根据 jpa 关键字查询的方法
     * 完整的介绍：
     * http://www.miniits.com/article/springDataJPA/queryMethods.html
     * ------------------------------------------------------------------------------------------
     */

    /**
     * 单个条件查询
     *
     * @param id
     * @return
     */
    User findById(String id);

    /**
     * 多个条件查询
     *
     * @param id
     * @param age
     * @return
     */
    User findByIdAndAge(String id, Integer age);

    /**
     * 模糊查询 & 排序
     *
     * @param name
     * @return
     */
    User findByNameLike(String name);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    User deleteById(String id);

}
