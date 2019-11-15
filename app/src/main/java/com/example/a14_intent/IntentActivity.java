package com.example.a14_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class IntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText("这是一个隐式启动的活动");
    }
}
