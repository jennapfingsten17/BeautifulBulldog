package com.example.jennapfingsten.beautifulbulldog;

import io.realm.RealmObject;

/**
 * Created by jennapfingsten on 9/18/17.
 */

public class Vote extends RealmObject {
    private User owner;
    private int rating;

    public User getOwner() {
        return owner;
    }

    public int getRating() {
        return rating;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
