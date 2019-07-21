package com.example.demo.bean;

public class Boys {
    private int u_id;
    private  String boyName;
    private  int userCP;

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getBoyName() {
        return boyName;
    }

    public void setBoyName(String boyName) {
        this.boyName = boyName;
    }

    public int getUserCP() {
        return userCP;
    }

    public void setUserCP(int userCP) {
        this.userCP = userCP;
    }

    @Override
    public String toString() {
        return "Boys{" +
                "u_id=" + u_id +
                ", boyName='" + boyName + '\'' +
                ", userCP=" + userCP +
                '}';
    }
}
