package com.yoyo.appname.module.welcome.activity;

import android.os.Bundle;

import com.yoyo.appname.R;
import com.yoyo.appname.databinding.ActivityWelcomeBinding;
import com.yoyo.appname.entity.WelcomeInfo;
import com.yoyo.appname.module.BaseAppCompatActivity;

public class WelcomeActivity extends BaseAppCompatActivity {
    WelcomeInfo welcomeInfo;
    @Override
    protected void onCreateBase(Bundle savedInstanceState) {
        setContentViewBase(R.layout.activity_welcome);
        ActivityWelcomeBinding binding = inflateDataBinding(R.layout.activity_welcome);
        welcomeInfo = new WelcomeInfo();
        binding.setWelcomeInfo(welcomeInfo);
    }
}
