package com.example.hbl.daggertest.jianshu;

import android.util.Log;

/**
 * Created by hbl on 2017/9/4.
 */

public class Persion {
    private String name;
    private String time;

    public Persion(String user) {
        this.name=user;
        Log.d("TAG", "Persion: ");
    }
}
