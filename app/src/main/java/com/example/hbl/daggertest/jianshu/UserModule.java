package com.example.hbl.daggertest.jianshu;

import dagger.Module;

/**
 * Created by hbl on 2017/9/1.
 */
@Module
public class UserModule {
    User providesUser(Persion persion){
        return new User();
    }

}
