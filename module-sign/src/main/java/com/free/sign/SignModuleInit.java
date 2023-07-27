package com.free.sign;

import android.app.Application;

import com.free.base.base.IModuleInit;

import com.free.mvvmhabit.utils.KLog;

public class SignModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        KLog.e("登录模块初始化 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("登录模块初始化 -- onInitLow");
        return false;
    }
}
