package com.hzgg.systemnews.typemanage.vo;

import java.io.Serializable;

/**
 * 新闻类别
 * Created by lsc on 2017/1/12 10:02.
 */
public class NewsTypes implements Serializable{

    private int typeid;
    private String typename;

    public NewsTypes() {
    }

    public NewsTypes(int typeid, String typename) {
        this.typeid = typeid;
        this.typename = typename;
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    @Override
    public String toString() {
        return "NewsTypes{" +
                "typeid=" + typeid +
                ", typename='" + typename + '\'' +
                '}';
    }
}
