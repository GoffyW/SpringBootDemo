package com.example.demo.pojo;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.util.List;

/**
 * @Author:Goffy
 */
public class Team {
    private Integer id;
    private String teamName;
    private List<String> honors;
    /**
     * 小组成员
     */
    private List<User> teamMembers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeanName() {
        return teamName;
    }

    public void setTeanName(String teanName) {
        this.teamName = teanName;
    }

    public List<String> getHonors() {
        return honors;
    }

    public void setHonors(List<String> honors) {
        this.honors = honors;
    }

    public List<User> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(List<User> teamMembers) {
        this.teamMembers = teamMembers;
    }

    @Override
    public String toString() {
        //遍历小组所获荣誉
        StringBuffer sbHonors = new StringBuffer("荣耀start---\n");
        for (String honor : honors){
            sbHonors.append(honor);
            sbHonors.append("\n");
        }
        sbHonors.append("荣耀end---\n");
        //遍历出小组成员
        StringBuffer sbMember = new StringBuffer("成员start---start\n");
        for (User user : teamMembers){
            sbMember.append(user.toString());
            sbMember.append("\n");
        }
        sbMember.append("成员end---\n");
        return "小组:"+id+"\n"+"小组名字:"+teamName+"\n"+"小组所获荣誉"+sbHonors+"\n"+"小组成员"+sbMember;
    }
}
