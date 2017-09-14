package com.example.jennapfingsten.beautifulbulldog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by jennapfingsten on 9/13/17.
 */

public class BulldogActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulldog);

        textView = (TextView) findViewById(R.id.textView2);

        Bulldog bulldog = (Bulldog) getIntent().getSerializableExtra("bulldog");
        textView.setText(bulldog.getName());
    }
}
