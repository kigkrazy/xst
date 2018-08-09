package com.reizx.xst.di.component;

import com.reizx.xst.app.App;
import com.reizx.xst.di.module.AppModule;
import com.reizx.xst.di.module.HttpModule;
import com.reizx.xst.model.DataManager;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by kigkrazy on 18-5-12.
 */

@Singleton
@Component(modules = {AppModule.class, HttpModule.class})
public interface AppComponent {
    App getContext();  // 提供App的Context

    DataManager getDataManager();//数据管理实例
}
