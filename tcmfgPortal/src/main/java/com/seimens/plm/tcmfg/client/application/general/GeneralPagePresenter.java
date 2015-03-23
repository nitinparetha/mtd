package com.seimens.plm.tcmfg.client.application.general;

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

public class GeneralPagePresenter extends Presenter<GeneralPagePresenter.MyView, GeneralPagePresenter.MyProxy> {
    public interface MyView extends View {
    }

    /**
     * {@link AdminAreaPresenter}'s proxy.
     */
    @ProxyCodeSplit
    @NameToken(NameTokens.general)
    @UseGatekeeper(IsAdminGatekeeper.class)
    public interface MyProxy extends TabContentProxyPlace<GeneralPagePresenter> {
    }

    @TabInfo(container = ApplicationPresenter.class)
    static TabData getTabLabel(IsAdminGatekeeper adminGatekeeper) {
        // Priority = 1000, means it will be the right-most tab in the home tab
        return new TabDataExt("General", 1, adminGatekeeper);
    }
    
    @Inject
    GeneralPagePresenter(EventBus eventBus,
            MyView view,
            MyProxy proxy) {
	super(eventBus, view, proxy, ApplicationPresenter.SLOT_SetTabContent);
	}
}
