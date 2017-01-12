package com.hzgg.systemnews.newsmanage.vo;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created by lsc on 2017/1/12 10:05.
 */
public class News implements Serializable{


    private int newsid;
    private String title;
    private String content;
    private String author;
    private String keyword;
    private Date createdate;
    private Date lastmodifydate;
    private int typeid;

    public News() {
    }

    public News(int newsid, String title, String content, String author, String keyword, Date createdate, Date lastmodifydate, int typeid) {
        this.newsid = newsid;
        this.title = title;
        this.content = content;
        this.author = author;
        this.keyword = keyword;
        this.createdate = createdate;
        this.lastmodifydate = lastmodifydate;
        this.typeid = typeid;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public Date getLastmodifydate() {
        return lastmodifydate;
    }

    public void setLastmodifydate(Date lastmodifydate) {
        this.lastmodifydate = lastmodifydate;
    }
}
