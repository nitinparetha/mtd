package com.seimens.plm.tcmfg.client.application;

import com.seimens.plm.tcmfg.client.application.adminarea.AdminAreaPresenter;
import com.seimens.plm.tcmfg.client.application.adminarea.AdminAreaView;
import com.seimens.plm.tcmfg.client.application.home.HomeModule;
import com.seimens.plm.tcmfg.client.application.home.HomePagePresenter;
import com.seimens.plm.tcmfg.client.application.home.HomePageView;
import com.seimens.plm.tcmfg.client.application.ui.UiModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new UiModule());

        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                ApplicationPresenter.MyProxy.class);
        bindPresenter(AdminAreaPresenter.class, AdminAreaPresenter.MyView.class, AdminAreaView.class,
                com.seimens.plm.tcmfg.client.application.adminarea.AdminAreaPresenter.MyProxy.class);
        bindPresenter(HomePagePresenter.class, HomePagePresenter.MyView.class, HomePageView.class,
        		HomePagePresenter.MyProxy.class);
    }
}

