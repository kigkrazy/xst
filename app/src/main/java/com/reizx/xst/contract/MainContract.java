package com.reizx.xst.contract;

import com.reizx.xst.presenter.common.IBasePresenter;
import com.reizx.xst.view.common.BaseView;

public class MainContract {
    public interface View extends BaseView {

    }

    public interface Presenter extends IBasePresenter<View> {

    }
}
