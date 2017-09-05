package com.example.hbl.daggertest.jianshu;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hbl on 2017/9/4.
 */
@Module
public class PersionModule {
    @Provides
    Persion providePersion(){
        return new Persion("1111");
    }
}
