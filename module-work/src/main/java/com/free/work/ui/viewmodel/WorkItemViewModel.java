package com.free.work.ui.viewmodel;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.free.mvvmhabit.base.BaseViewModel;
import com.free.mvvmhabit.base.ItemViewModel;

public class WorkItemViewModel extends ItemViewModel {
    public ObservableField<String> text = new ObservableField<>();

    public WorkItemViewModel(@NonNull BaseViewModel viewModel, String text) {
        super(viewModel);
        this.text.set(text);
    }
}
