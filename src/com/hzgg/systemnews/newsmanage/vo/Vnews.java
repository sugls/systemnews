package com.hzgg.systemnews.newsmanage.vo;

import java.sql.Date;

/**
 * Created by lsc on 2017/1/13 13:49.
 */
public class Vnews {

    private  int newsid;
    private String title;
    private String author;
    private Date createdate;
    private String typename;

    public Vnews(int newsid, String title, String author, Date createdate, String typename) {
        this.newsid = newsid;
        this.title = title;
        this.author = author;
        this.createdate = createdate;
        this.typename = typename;
    }

    public Vnews() {
    }


    public int getNewsid() {
        return newsid;
    }

    public void setNewsid(int newsid) {
        this.newsid = newsid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }



}
