package com.free.user;

import android.app.Application;

import com.free.base.base.IModuleInit;

import com.free.mvvmhabit.utils.KLog;

public class UserModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        KLog.e("用户模块初始化 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("用户模块初始化 -- onInitLow");
        return false;
    }
}
