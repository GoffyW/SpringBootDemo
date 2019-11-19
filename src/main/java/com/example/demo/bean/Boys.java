package com.example.demo.bean;

import java.io.Serializable;

public class Boys implements Serializable {
    private Integer uId;

    private String boyname;

    private Integer usercp;

    private static final long serialVersionUID = 1L;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getBoyname() {
        return boyname;
    }

    public void setBoyname(String boyname) {
        this.boyname = boyname == null ? null : boyname.trim();
    }

    public Integer getUsercp() {
        return usercp;
    }

    public void setUsercp(Integer usercp) {
        this.usercp = usercp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uId=").append(uId);
        sb.append(", boyname=").append(boyname);
        sb.append(", usercp=").append(usercp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}