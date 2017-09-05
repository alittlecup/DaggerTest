package com.example.hbl.daggertest;

import com.example.hbl.daggertest.dagger.DaggerMyApplicationComponent;
import com.example.hbl.daggertest.jianshu.User;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by hbl on 2017/9/1.
 */

public class MyApplication extends DaggerApplication {

    @Inject
    User user;

    public User getUser() {
        return user;
    }

    public static MyApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;

    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerMyApplicationComponent.builder().create(this);
    }


}
