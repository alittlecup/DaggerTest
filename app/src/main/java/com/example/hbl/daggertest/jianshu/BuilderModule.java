package com.example.hbl.daggertest.jianshu;

import com.example.hbl.daggertest.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by hbl on 2017/9/4.
 */
@Module
public abstract class BuilderModule {
    @ContributesAndroidInjector(modules = PersionModule.class)
    abstract MainActivity mainActivtyInjector();
}
