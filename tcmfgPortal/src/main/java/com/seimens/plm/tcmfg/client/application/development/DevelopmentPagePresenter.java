package com.seimens.plm.tcmfg.client.application.development;

import javax.inject.Inject;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.RequestTabsHandler;
import com.gwtplatform.mvp.client.TabView;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.RequestTabs;
import com.gwtplatform.mvp.client.annotations.TabInfo;
import com.gwtplatform.mvp.client.proxy.NonLeafTabContentProxy;
import com.seimens.plm.tcmfg.client.application.ApplicationPresenter;
import com.seimens.plm.tcmfg.client.application.adminarea.AdminAreaPresenter;
import com.seimens.plm.tcmfg.client.place.NameTokens;
import com.seimens.plm.tcmfg.client.resources.TcmfgConstants;

public class DevelopmentPagePresenter extends DevelopmentPagePresenterBase<DevelopmentPagePresenter.MyView, DevelopmentPagePresenter.MyProxy> {
    public interface MyView extends TabView {
    }

    /**
     * {@link AdminAreaPresenter}'s proxy.
     */
    @ProxyCodeSplit
    public interface MyProxy extends NonLeafTabContentProxy<DevelopmentPagePresenter> {
    }

    
    /**
     * This will be the event sent to our "unknown" child presenters, in order for them to register their tabs.
     */
    @RequestTabs
    public static final Type<RequestTabsHandler> SLOT_RequestTabs = new Type<>();
    
    
    @TabInfo(container = ApplicationPresenter.class, priority = 2, // The first tab in the main page
            nameToken = NameTokens.devTools)
   // Go to HomeNewsPresenter when clicked
   static String getTabLabel(TcmfgConstants constants) {
       return constants.dev();
   }
    
    @Inject
    DevelopmentPagePresenter(EventBus eventBus,
            MyView view,
            MyProxy proxy) {
	super(eventBus, view, proxy, SLOT_RequestTabs, ApplicationPresenter.SLOT_SetTabContent);
	}
}
