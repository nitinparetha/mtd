package com.seimens.plm.tcmfg.client.application;

import com.seimens.plm.tcmfg.client.application.home.HomeModule;
import com.seimens.plm.tcmfg.client.application.ui.UiModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new UiModule());
        install(new HomeModule());

        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                ApplicationPresenter.MyProxy.class);
    }
}
