//package com.example.hbl.daggertest.dagger.modules;
//
//import android.app.Activity;
//
//import com.example.hbl.daggertest.MainActivity;
//import com.example.hbl.daggertest.dagger.MyActivityComponent;
//
//import dagger.Binds;
//import dagger.Module;
//import dagger.android.ActivityKey;
//import dagger.android.AndroidInjector;
//import dagger.multibindings.IntoMap;
//
///**
// * Created by hbl on 2017/9/1.
// */
//
//@Module(subcomponents = MyActivityComponent.class)
//public abstract  class MyActivityModule {
//    @Binds
//    @IntoMap
//    @ActivityKey(MainActivity.class)
//    abstract AndroidInjector.Factory<? extends Activity>
//            bindYourActivityInjectorFactory(MyActivityComponent.Builder builder);
//}
