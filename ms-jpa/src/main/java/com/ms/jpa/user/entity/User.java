package com.ms.jpa.user.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author: wq
 * @Date: 2017/10/16
 * @Time: 22:48
 * <p>
 * Description:
 * ***
 */

@Entity
@Table(name = "user")
public class User {

    private String id;
    private String classes;
    private Integer number;
    private String name;
    private Integer age;

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id", unique = true, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "classes", length = 10)
    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Column(name = "number", length = 3)
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Column(name = "name", length = 9)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "age", length = 2)
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
