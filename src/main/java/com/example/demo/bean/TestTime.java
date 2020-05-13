package com.example.demo.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @author GoffyGUO
 */
public class TestTime implements Serializable {
    private Integer id;

    private String name;

    private Date birthTime;

    private Date createTime;

    private Date updateTime;

    private Date warkUpTime;

    private String yearTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getBirthTime() {
        return birthTime;
    }

    public void setBirthTime(Date birthTime) {
        this.birthTime = birthTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getWarkUpTime() {
        return warkUpTime;
    }

    public void setWarkUpTime(Date warkUpTime) {
        this.warkUpTime = warkUpTime;
    }

    public String getYearTime() {
        return yearTime;
    }

    public void setYearTime(String yearTime) {
        this.yearTime = yearTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", birthTime=").append(birthTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", warkUpTime=").append(warkUpTime);
        sb.append(", yearTime=").append(yearTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}