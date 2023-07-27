package com.free.jie;

import com.free.base.config.ModuleLifecycleConfig;

import com.free.mvvmhabit.base.BaseApplication;
import com.free.mvvmhabit.utils.KLog;

public class AppApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化组件(靠前)
        ModuleLifecycleConfig.getInstance().initModuleAhead(this);
        //....
        //初始化组件(靠后)
        ModuleLifecycleConfig.getInstance().initModuleLow(this);
    }
}
