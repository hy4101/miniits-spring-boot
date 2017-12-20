package com.ms.jpa.user.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * Entity - 基类
 * @author: Tod.xie
 * @Date: 2016/12/12
 * @Time: 14:58
 * <p>
 * Description: 公共基础的对象属性，每个对象均要继承BaseEntity
 */
@MappedSuperclass
@JsonIgnoreProperties(value ={"hibernateLazyInitializer", "handler"})
public abstract class BaseEntity implements Serializable{

    /**
	 * 序列号
	 */
	protected static final long serialVersionUID = 1L;

	/** 创建日期 */
    protected Date createDate;

    /** 创建人 */
    protected String createUser;

    /** 修改日期 */
    protected Date modifyDate;

    /** 修改人 */
    protected String modifyUser;

    /** 登陆令牌号 */
    protected String token;

    /** 描述 */
    protected String description;
    
	@Column(name = "create_date")
    public Date getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Column(name = "create_user",length = 32)
    public String getCreateUser() {
        return createUser;
    }
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Column(name = "modify_date")
    public Date getModifyDate() {
        return modifyDate;
    }
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Column(name = "modify_user",length = 32)
    public String getModifyUser() {
        return modifyUser;
    }
    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }

    @Column(name = "token",length = 50)
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }

    @Column(name = "description",length = 500)
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
