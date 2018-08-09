package com.reizx.xst.di.module;

import android.app.Service;


import com.reizx.xst.di.scope.ServiceScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kigkrazy on 18-5-12.
 */

@Module
public class ServiceModule {
    private Service service;

    public ServiceModule(Service service) {
        this.service= service;
    }

    @Provides
    @ServiceScope
    public Service provideService() {
        return service;
    }
}