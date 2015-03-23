package com.seimens.plm.tcmfg.client.application.home;

import javax.inject.Inject;

import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.TabData;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.TabInfo;
import com.gwtplatform.mvp.client.annotations.UseGatekeeper;
import com.gwtplatform.mvp.client.proxy.TabContentProxyPlace;
import com.seimens.plm.tcmfg.client.application.ApplicationPresenter;
import com.seimens.plm.tcmfg.client.application.adminarea.AdminAreaPresenter;
import com.seimens.plm.tcmfg.client.application.adminarea.TabDataExt;
import com.seimens.plm.tcmfg.client.place.NameTokens;
import com.seimens.plm.tcmfg.client.security.IsAdminGatekeeper;

public class HomePagePresenter extends Presenter<HomePagePresenter.MyView, HomePagePresenter.MyProxy> {
    public interface MyView extends View {
    }

    /**
     * {@link AdminAreaPresenter}'s proxy.
     */
    @ProxyCodeSplit
    @NameToken(NameTokens.home)
    @UseGatekeeper(IsAdminGatekeeper.class)
    public interface MyProxy extends TabContentProxyPlace<HomePagePresenter> {
    }

    @TabInfo(container = ApplicationPresenter.class)
    static TabData getTabLabel(IsAdminGatekeeper adminGatekeeper) {
        // Priority = 1000, means it will be the right-most tab in the home tab
        return new TabDataExt("Home", 0, adminGatekeeper);
    }
    
    @Inject
    HomePagePresenter(EventBus eventBus,
            MyView view,
            MyProxy proxy) {
	super(eventBus, view, proxy, ApplicationPresenter.SLOT_SetTabContent);
	}
}
