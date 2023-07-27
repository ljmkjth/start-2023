package com.free.base.config;

/**
 * 组件生命周期反射类名管理，在这里注册需要初始化的组件，通过反射动态调用各个组件的初始化方法
 * 注意：以下模块中初始化的Module类不能被混淆
 */

public class ModuleLifecycleReflexs {
    private static final String BaseInit = "com.free.base.base.BaseModuleInit";
    //主业务模块
    private static final String MainInit = "com.free.main.MainModuleInit";
    //登录验证模块
    private static final String SignInit = "com.free.sign.SignModuleInit";
    //首页业务模块
    private static final String HomeInit = "com.free.home.HomeModuleInit";
    //工作业务模块
    private static final String WorkInit = "com.free.work.WorkModuleInit";
    //消息业务模块
    private static final String MsgInit = "com.free.msg.MsgModuleInit";
    //用户业务模块
    private static final String UserInit = "com.free.user.UserModuleInit";
    //学习模块
    private static final String StudyInit = "com.free.user.StudyModuleInit";

    public static String[] initModuleNames = {BaseInit, MainInit,SignInit, HomeInit, WorkInit, MsgInit,UserInit,StudyInit};
}
