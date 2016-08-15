package com.yoyo.appname.module;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.yoyo.appname.R;
import com.yoyo.appname.databinding.ActivityBaseBinding;
import com.yoyo.appname.entity.BaseInfo;

/**
 * 项目名称：
 * 类描述：activity的基类
 * 创建人：yoyo
 * 创建时间：2016/8/11 13:34
 * 修改人：yoyo
 * 修改时间：2016/8/11 13:34
 * 修改备注：
 */
public abstract class BaseAppCompatActivity extends AppCompatActivity {
    RelativeLayout rlBaseContent;
    View vContent;
    BaseInfo baseInfo;
    LayoutInflater layoutInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBaseBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_base);
        baseInfo = new BaseInfo();
        binding.setBaseInfo(baseInfo);
        layoutInflater = LayoutInflater.from(this);
        onCreateBase(savedInstanceState);
    }

    public void setContentViewBase(@LayoutRes int layoutResID) {
        View decorView = getWindow().getDecorView();
        ViewGroup contentView = (ViewGroup) decorView.findViewById(android.R.id.content);
        rlBaseContent = (RelativeLayout) contentView.getChildAt(0);
        vContent = LayoutInflater.from(this).inflate(layoutResID, null);
        rlBaseContent.addView(vContent);
    }

    public <T extends ViewDataBinding> T inflateDataBinding(@LayoutRes int layoutResID) {
        return DataBindingUtil.inflate(layoutInflater, layoutResID, rlBaseContent, false);
    }

    protected abstract void onCreateBase(Bundle savedInstanceState);
}
