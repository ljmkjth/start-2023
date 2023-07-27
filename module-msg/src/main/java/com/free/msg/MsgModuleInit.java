package com.free.msg;

import android.app.Application;

import com.free.base.base.IModuleInit;

import com.free.mvvmhabit.utils.KLog;

public class MsgModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        KLog.e("消息模块初始化 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("消息模块初始化 -- onInitLow");
        return false;
    }
}
