package com.seimens.plm.tcmfg.client.application.general;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class GeneralModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(GeneralPagePresenter.class, GeneralPagePresenter.MyView.class, GeneralPageView.class,
        		GeneralPagePresenter.MyProxy.class);
    }
}
