package com.reizx.xst.di.component;

import android.app.Activity;

import com.reizx.xst.di.module.FragmentModule;
import com.reizx.xst.di.scope.FragmentScope;
import com.reizx.xst.view.fragment.HomeFragment;
import com.reizx.xst.view.fragment.MainFragment;
import com.reizx.xst.view.fragment.SettingFragment;

import dagger.Component;

/**
 * Created by kigkrazy on 18-5-12.
 */

@FragmentScope
@Component(dependencies = AppComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {
    Activity getActivity();

    void Inject(HomeFragment homeFragment);

    void Inject(SettingFragment settingFragment);

    void Inject(MainFragment settingFragment);
}
