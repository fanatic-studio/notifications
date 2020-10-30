package eco.android.ecoNotifications.entry;

import android.content.Context;

import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;

import app.eco.framework.extend.annotation.ModuleEntry;
import eco.android.ecoNotifications.module.ecoNotificationsAppModule;

@ModuleEntry
public class ecoNotificationsEntry {

    /**
     * APP启动会运行此函数方法
     * @param content Application
     */
    public void init(Context content) {

        //注册weex模块
        try {
            WXSDKEngine.registerModule("ecoNotifications", ecoNotificationsAppModule.class);
        } catch (WXException e) {
            e.printStackTrace();
        }
    }
}
