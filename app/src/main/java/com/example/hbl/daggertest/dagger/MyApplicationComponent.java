package com.example.hbl.daggertest.dagger;

import com.example.hbl.daggertest.MyApplication;
import com.example.hbl.daggertest.jianshu.BuilderModule;
import com.example.hbl.daggertest.jianshu.UserModule;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by hbl on 2017/9/1.
 */
@Component(modules = {UserModule.class,BuilderModule.class,AndroidSupportInjectionModule.class})
public interface MyApplicationComponent extends AndroidInjector<MyApplication> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MyApplication> {
    }
}
