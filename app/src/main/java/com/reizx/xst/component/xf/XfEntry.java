package com.reizx.xst.component.xf;

import com.reizx.xst.util.AsfLog;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class XfEntry implements IXposedHookLoadPackage {
    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
        AsfLog.initLog("xst-tag");
        //XposedHelpers.findAndHookMethod()
    }
}
