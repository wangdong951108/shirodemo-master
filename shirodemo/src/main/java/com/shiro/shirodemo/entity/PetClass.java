package com.shiro.shirodemo.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author jwy
 * @since 2018-01-11
 */
@TableName("sys_petclass")
public class PetClass extends Model<PetClass> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;
    /**
     * 用户id
     */
    private String cid;

    /**
     * 登录ip
     */
    private String petClassName;
    private String uid ;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getPetClassName() {
        return petClassName;
    }

    public void setPetClassName(String petClassName) {
        this.petClassName = petClassName;
    }

    @Override
    public String toString() {
        return "PetClass{" +
                "id='" + id + '\'' +
                ", cid='" + cid + '\'' +
                ", petClassName='" + petClassName + '\'' +
                ", uid='" + uid + '\'' +
                '}';
    }
}
