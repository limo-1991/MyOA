package com.myoa.entity;

import java.io.Serializable;
import java.util.List;

public class Department implements Serializable {
    private Long did;
    private String dname;
    private String description;

    private List<User> users;

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Department{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", description='" + description + '\'' +
                ", users=" + users +
                '}';
    }
}
