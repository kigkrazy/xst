package com.reizx.xst.contract;

import com.reizx.xst.presenter.common.IBasePresenter;
import com.reizx.xst.view.common.BaseView;

public class SettingContract {
    public interface View extends BaseView {
        void showIpStatus(String msg);
    }

    public interface  Presenter extends IBasePresenter<View> {
    }
}
