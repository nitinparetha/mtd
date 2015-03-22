package com.seimens.plm.tcmfg.client.application.development;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class DevelopmentModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(DevelopmentPagePresenter.class, DevelopmentPagePresenter.MyView.class, DevelopmentPageView.class,
        		DevelopmentPagePresenter.MyProxy.class);
    }
}
