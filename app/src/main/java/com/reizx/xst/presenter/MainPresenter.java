package com.reizx.xst.presenter;

import com.reizx.xst.contract.MainContract;
import com.reizx.xst.model.DataManager;
import com.reizx.xst.presenter.common.BasePresenterImpl;

import javax.inject.Inject;

public class MainPresenter extends BasePresenterImpl<MainContract.View> implements MainContract.Presenter {
    @Inject
    public MainPresenter(DataManager dm) {
        super(dm);
    }
}
