package com.example.hbl.daggertest;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.hbl.daggertest.jianshu.Persion;
import com.example.hbl.daggertest.jianshu.User;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {
    @Inject
    User user;
    @Inject
    Persion persion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textcontent);
        textView.setText(user.getName());
        if(user==MyApplication.application.getUser()){
            Log.d("TAG", "onCreate: ");
            textView.setText("true");
        }


    }
}