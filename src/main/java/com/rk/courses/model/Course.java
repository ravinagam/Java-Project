package com.rk.courses.model;

import org.springframework.stereotype.Component;

/**
 * Created by j1007652 on 8/20/2018.
 */

@Component
public class Course {

    private int id;
    private String name;
    private int fee;

    public Course()
    {

    }

    public Course(int id, String name, int fee)
    {
        this.id = id;
        this.name = name;
        this.fee = fee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}
