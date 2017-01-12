package com.hzgg.systemnews.adminmanage.vo;

import java.io.Serializable;

/**
 * Created by lsc on 2017/1/12 9:42.
 */
public class Admins implements Serializable{

    private int adminid;
    private String username;
    private String userpwd;
    private String realname;

    public Admins() {
    }

    public Admins(int adminid, String username, String userpwd, String realname) {
        this.adminid = adminid;
        this.username = username;
        this.userpwd = userpwd;
        this.realname = realname;
    }

    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }
}
