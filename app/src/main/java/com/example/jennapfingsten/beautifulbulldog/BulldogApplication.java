package com.example.jennapfingsten.beautifulbulldog;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by jennapfingsten on 9/18/17.
 */

public class BulldogApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);
    }
}
