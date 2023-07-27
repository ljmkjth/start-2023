package com.free.home.ui.adapter;

import android.view.ViewGroup;

import com.free.home.databinding.ItemViewpagerBinding;
import com.free.home.ui.viewmodel.ViewPagerItemViewModel;

import androidx.databinding.ViewDataBinding;
import me.tatarka.bindingcollectionadapter2.BindingViewPagerAdapter;

public class ViewPagerBindingAdapter extends BindingViewPagerAdapter<ViewPagerItemViewModel> {
    @Override
    public void onBindBinding(final ViewDataBinding binding, int variableId, int layoutRes, int position, ViewPagerItemViewModel item) {
        super.onBindBinding(binding, variableId, layoutRes, position, item);
        //这里可以强转成ViewPagerItemViewModel对应的ViewDataBinding，
        ItemViewpagerBinding _binding = (ItemViewpagerBinding) binding;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }
}
