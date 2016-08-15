package com.yoyo.base;

import android.app.Application;

import com.yoyo.common.utils.XUtils;

/**
 * 项目名称：
 * 类描述：Application基类
 * 创建人：yoyo
 * 创建时间：2016/8/11 11:59
 * 修改人：yoyo
 * 修改时间：2016/8/11 11:59
 * 修改备注：
 */
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        XUtils.init(this);
    }
}
