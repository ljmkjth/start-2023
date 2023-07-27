package com.free.user.ui.viewmodel;

import android.app.Application;
import android.text.TextUtils;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.free.mvvmhabit.base.BaseViewModel;
import com.free.mvvmhabit.binding.command.BindingAction;
import com.free.mvvmhabit.binding.command.BindingCommand;
import com.free.mvvmhabit.bus.RxBus;

public class UserDetailViewModel extends BaseViewModel {
    public ObservableField<String> nameObservable = new ObservableField();

    public UserDetailViewModel(@NonNull Application application) {
        super(application);
    }

    public void setName(String name) {
        nameObservable.set(name);
    }

    //回传参数
    public BindingCommand backOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            if (!TextUtils.isEmpty(nameObservable.get())) {
                //RxBus解耦组件通信
                RxBus.getDefault().post(nameObservable.get());
            }
            finish();
        }
    });
}
