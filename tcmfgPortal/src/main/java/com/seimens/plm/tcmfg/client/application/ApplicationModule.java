package com.seimens.plm.tcmfg.client.application;

import com.seimens.plm.tcmfg.client.application.adminarea.AdminAreaPresenter;
import com.seimens.plm.tcmfg.client.application.adminarea.AdminAreaView;
import com.seimens.plm.tcmfg.client.application.development.DevelopmentPagePresenter;
import com.seimens.plm.tcmfg.client.application.development.DevelopmentPageView;
import com.seimens.plm.tcmfg.client.application.devsource.DevsourcePagePresenter;
import com.seimens.plm.tcmfg.client.application.devsource.DevsourcePageView;
import com.seimens.plm.tcmfg.client.application.devtools.DevtoolsPagePresenter;
import com.seimens.plm.tcmfg.client.application.devtools.DevtoolsPageView;
import com.seimens.plm.tcmfg.client.application.general.GeneralPagePresenter;
import com.seimens.plm.tcmfg.client.application.general.GeneralPageView;
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
        bindPresenter(DevelopmentPagePresenter.class, DevelopmentPagePresenter.MyView.class, DevelopmentPageView.class,
        		DevelopmentPagePresenter.MyProxy.class);
        bindPresenter(GeneralPagePresenter.class, GeneralPagePresenter.MyView.class, GeneralPageView.class,
        		GeneralPagePresenter.MyProxy.class);
        bindPresenter(DevsourcePagePresenter.class, DevsourcePagePresenter.MyView.class, DevsourcePageView.class,
        		DevsourcePagePresenter.MyProxy.class);
        bindPresenter(DevtoolsPagePresenter.class, DevtoolsPagePresenter.MyView.class, DevtoolsPageView.class,
        		DevtoolsPagePresenter.MyProxy.class);
        
    }
}

