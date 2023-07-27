package com.free.home.ui.viewmodel;

import androidx.annotation.NonNull;
import com.free.mvvmhabit.base.ItemViewModel;
import com.free.mvvmhabit.binding.command.BindingAction;
import com.free.mvvmhabit.binding.command.BindingCommand;

public class ViewPagerItemViewModel extends ItemViewModel<HomeViewModel> {
    public String text;

    public ViewPagerItemViewModel(@NonNull HomeViewModel viewModel, String text) {
        super(viewModel);
        this.text = text;
    }

    public BindingCommand onClick = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            //点击之后将逻辑转到adapter中处理
            viewModel.itemClickEvent.setValue(text);
        }
    });
}
