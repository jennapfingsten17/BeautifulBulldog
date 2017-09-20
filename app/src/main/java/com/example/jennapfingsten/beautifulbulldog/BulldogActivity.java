package com.example.jennapfingsten.beautifulbulldog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import io.realm.Realm;

/**
 * Created by jennapfingsten on 9/13/17.
 */

public class BulldogActivity extends AppCompatActivity {

    private TextView textView;
    private Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_bulldog);

        textView = (TextView) findViewById(R.id.textView2);
        realm = Realm.getDefaultInstance();

        String id = (String) getIntent().getStringExtra("bulldog");
        Bulldog bulldog = realm.where(Bulldog.class).equalTo("id", id).findFirst();

        //Bulldog bulldog = (Bulldog) getIntent().getSerializableExtra("bulldog");
        textView.setText(bulldog.getName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Close the Realm instance.
        realm.close();
    }

}
