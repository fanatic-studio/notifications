package vd.android.vdNotifications.entry;

import android.content.Context;

import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;

import app.vd.framework.extend.annotation.ModuleEntry;
import vd.android.vdNotifications.module.vdNotificationsAppModule;

@ModuleEntry
public class vdNotificationsEntry {

    /**
     * APP启动会运行此函数方法
     * @param content Application
     */
    public void init(Context content) {

        //注册weex模块
        try {
            WXSDKEngine.registerModule("vdNotifications", vdNotificationsAppModule.class);
        } catch (WXException e) {
            e.printStackTrace();
        }
    }
}
