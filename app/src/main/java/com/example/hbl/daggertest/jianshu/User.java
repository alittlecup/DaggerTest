package com.example.hbl.daggertest.jianshu;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by hbl on 2017/9/1.
 */

public class User {
    private String name;
    private int age;
    @Inject
    public User() {
        this.name = "111";
        this.age = 122;
        Log.d("TAG", "User: ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
