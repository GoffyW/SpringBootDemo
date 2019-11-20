package com.example.demo.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel("男生实体")
public class Boys implements Serializable {
    @ApiModelProperty("用户id")
    private Integer uId;

    @ApiModelProperty("男生姓名")
    private String boyname;

    @ApiModelProperty("关联cp")
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
