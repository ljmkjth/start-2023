package com.free.work.ui.viewmodel;

import android.app.Application;

import com.free.work.R;
import com.free.work.BR;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;
import com.free.mvvmhabit.base.BaseViewModel;
import me.tatarka.bindingcollectionadapter2.ItemBinding;

public class WorkViewModel extends BaseViewModel {
    public WorkViewModel(@NonNull Application application) {
        super(application);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        for (int i = 0; i < 10; i++) {
            observableList.add(new com.free.work.ui.viewmodel.WorkItemViewModel(this, "条目" + i));
        }
    }
    //给RecyclerView添加ObservableList
    public ObservableList<com.free.work.ui.viewmodel.WorkItemViewModel> observableList = new ObservableArrayList<>();
    //给RecyclerView添加ItemBinding
    public ItemBinding<com.free.work.ui.viewmodel.WorkItemViewModel> itemBinding = ItemBinding.of(BR.viewModel, R.layout.grid_work);
}
