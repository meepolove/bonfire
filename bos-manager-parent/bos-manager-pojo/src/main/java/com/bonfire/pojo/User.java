package com.bonfire.pojo;

import java.util.Date;

/**
 * Created by Administrator on 2018/8/6.
 */
public class User {
    private int id;
    private String truename;
    private String password;
    private String nickname;
    private String email;
    private String mobile;
    private Date createtime;
    private Date lastlogintime;
    private String src;
    public User() {
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public User(int id, String truename, String password, String nickname, String email, String mobile, Date createtime, Date lastlogintime, String src) {
        this.id = id;
        this.truename = truename;
        this.password = password;
        this.nickname = nickname;
        this.email = email;
        this.mobile = mobile;
        this.createtime = createtime;
        this.lastlogintime = lastlogintime;
        this.src = src;
    }
}
