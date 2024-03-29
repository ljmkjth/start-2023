package com.free.user.ui.viewmodel;

import android.app.Application;
import android.text.TextUtils;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.free.base.contract._Login;
import com.free.base.global.SPKeyGlobal;
import com.free.base.router.RouterActivityPath;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import com.free.mvvmhabit.base.BaseViewModel;
import com.free.mvvmhabit.binding.command.BindingAction;
import com.free.mvvmhabit.binding.command.BindingCommand;
import com.free.mvvmhabit.bus.RxBus;
import com.free.mvvmhabit.bus.RxSubscriptions;
import com.free.mvvmhabit.utils.SPUtils;

public class MeViewModel extends BaseViewModel {
    public ObservableInt loginBtnVisible = new ObservableInt();
    public ObservableField<String> userInfoObservable = new ObservableField();
    private Disposable subscribe;

    public MeViewModel(@NonNull Application application) {
        super(application);
    }

    @Override
    public void onCreate() {
        initData();
    }

    public void initData() {
        String userInfo = SPUtils.getInstance().getString(SPKeyGlobal.USER_INFO);
        if (!TextUtils.isEmpty(userInfo)) {
            userInfoObservable.set(userInfo);
            loginBtnVisible.set(View.GONE);
        } else {
            loginBtnVisible.set(View.VISIBLE);
        }
    }

    //登录按钮点击事件
    public BindingCommand startLoginOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            //采用ARouter+RxBus实现组件间通信
            ARouter.getInstance().build(RouterActivityPath.Sign.PAGER_LOGIN).navigation();
            subscribe = RxBus.getDefault().toObservable(_Login.class)
                    .subscribe(new Consumer<_Login>() {
                        @Override
                        public void accept(_Login l) throws Exception {
                            //登录成功后重新刷新数据
                            initData();
                            //解除注册
                            RxSubscriptions.remove(subscribe);
                        }
                    });
            RxSubscriptions.add(subscribe);
        }
    });
    //退出登录按钮点击事件
    public BindingCommand outLoginOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            SPUtils.getInstance().put(SPKeyGlobal.USER_INFO, "");
            initData();
        }
    });
}
