package com.example.jennapfingsten.beautifulbulldog;

import java.io.Serializable;

/**
 * Created by jennapfingsten on 9/13/17.
 */

public class Bulldog implements Serializable {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
