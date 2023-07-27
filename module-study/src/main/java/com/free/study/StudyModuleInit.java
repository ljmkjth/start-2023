package com.free.study;

import android.app.Application;

import com.free.base.base.IModuleInit;
import com.free.mvvmhabit.utils.KLog;

public class StudyModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        KLog.e("学习模块初始化 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("学习模块初始化 -- onInitLow");
        return false;
    }
}
