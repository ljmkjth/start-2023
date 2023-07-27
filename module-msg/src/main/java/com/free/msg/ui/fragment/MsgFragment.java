package com.free.msg.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.free.base.router.RouterFragmentPath;
import com.free.msg.R;
import com.free.msg.BR;
import com.free.msg.databinding.FragmentMsgBinding;
import com.free.msg.ui.viewmodel.MsgViewModel;

import androidx.annotation.Nullable;
import com.free.mvvmhabit.base.BaseFragment;

@Route(path = RouterFragmentPath.Msg.PAGER_MSG)
public class MsgFragment extends BaseFragment<FragmentMsgBinding, MsgViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_msg;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
    }
}
