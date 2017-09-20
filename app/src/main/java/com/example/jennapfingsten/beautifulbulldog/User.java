package com.example.jennapfingsten.beautifulbulldog;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by jennapfingsten on 9/18/17.
 */

public class User extends RealmObject implements Serializable{
    @PrimaryKey
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) { this.username = username; }
}
