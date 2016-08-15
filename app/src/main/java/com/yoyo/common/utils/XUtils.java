package com.yoyo.common.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import org.xutils.x;

/**
 * 项目名称：AppName
 * 类描述：
 * 创建人：yoyo
 * 创建时间：2016/8/11 15:49
 * 修改人：yoyo
 * 修改时间：2016/8/11 15:49
 * 修改备注：
 */
public class XUtils {
    public static void init(Application application) {
        x.Ext.init(application);
    }

    public static void viewInit(Activity activity) {
        x.view().inject(activity);
    }
}
