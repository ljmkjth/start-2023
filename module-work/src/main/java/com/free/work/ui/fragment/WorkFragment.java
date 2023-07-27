package com.free.work.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;


import com.alibaba.android.arouter.facade.annotation.Route;
import com.free.base.router.RouterFragmentPath;
import com.free.work.R;
import com.free.work.BR;
import com.free.work.databinding.FragmentWorkBinding;
import com.free.work.ui.viewmodel.WorkViewModel;

import androidx.annotation.Nullable;
import com.free.mvvmhabit.base.BaseFragment;

@Route(path = RouterFragmentPath.Work.PAGER_WORK)
public class WorkFragment extends BaseFragment<FragmentWorkBinding, WorkViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_work;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
    }
}
