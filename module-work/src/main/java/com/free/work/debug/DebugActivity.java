package com.free.work.debug;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.free.work.ui.fragment.WorkFragment;

import androidx.annotation.Nullable;
import com.free.mvvmhabit.base.ContainerActivity;

/**
 * 组件单独运行时的调试界面，不会被编译进release里
 */

public class DebugActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, ContainerActivity.class);
        intent.putExtra("fragment", WorkFragment.class.getCanonicalName());
        this.startActivity(intent);
        finish();
    }
}
