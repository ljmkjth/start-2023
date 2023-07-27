package com.free.user.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.free.base.router.RouterFragmentPath;
import com.free.user.R;
import com.free.user.BR;
import com.free.user.databinding.FragmentMeBinding;
import com.free.user.ui.viewmodel.MeViewModel;

import androidx.annotation.Nullable;
import com.free.mvvmhabit.base.BaseFragment;

@Route(path = RouterFragmentPath.User.PAGER_ME)
public class MeFragment extends BaseFragment<FragmentMeBinding, MeViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_me;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
        super.initData();
    }
}
