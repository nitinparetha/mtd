package com.gwtplatform.samples.tab.client.application.home;

import com.google.gwt.core.client.GWT;
import javax.inject.Inject;
import javax.inject.Provider;
import com.gwtplatform.mvp.client.proxy.NotifyingAsyncCallback;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.common.client.StandardProvider;
import com.gwtplatform.common.client.CodeSplitProvider;
import com.gwtplatform.common.client.CodeSplitBundleProvider;
import com.gwtplatform.mvp.client.proxy.ProxyImpl;
import com.gwtplatform.mvp.client.proxy.ProxyPlaceImpl;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.gwtplatform.mvp.client.DelayedBind;
import com.gwtplatform.mvp.client.proxy.TabContentProxyPlaceImpl;
import com.gwtplatform.mvp.client.DelayedBindRegistry;
import com.google.gwt.inject.client.Ginjector;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.gwtplatform.mvp.client.TabData;
import com.gwtplatform.mvp.client.TabDataBasic;

public class HomePresenterMyProxyImpl extends com.gwtplatform.mvp.client.proxy.NonLeafTabContentProxyImpl<HomePresenter> implements com.gwtplatform.samples.tab.client.application.home.HomePresenter.MyProxy, com.gwtplatform.mvp.client.DelayedBind {
  
  private com.gwtplatform.mvp.client.ClientGinjector ginjector;
  
  public HomePresenterMyProxyImpl() {
    DelayedBindRegistry.register(this);
  }
  
  @Override
  public void delayedBind(Ginjector baseGinjector) {
    ginjector = (com.gwtplatform.mvp.client.ClientGinjector)baseGinjector;
    bind(ginjector.getPlaceManager(),
        ginjector.getEventBus());
    requestTabsEventType = com.gwtplatform.samples.tab.client.application.ApplicationPresenter.SLOT_RequestTabs;
    changeTabEventType = com.gwtplatform.samples.tab.client.application.ApplicationPresenter.SLOT_ChangeTab;
    tabData = getTabDataInternal(ginjector);
    targetHistoryToken = "!homeNewsPage";
    addRequestTabsHandler();
    presenter = new CodeSplitProvider<HomePresenter>( ginjector.getcomgwtplatformsamplestabclientapplicationhomeHomePresenter() );
    
    RevealContentHandler<HomePresenter> revealContentHandler = new RevealContentHandler<HomePresenter>( eventBus, this );
    getEventBus().addHandler( HomePresenter.SLOT_SetTabContent, revealContentHandler );
  }
  
  protected TabData getTabDataInternal(com.gwtplatform.mvp.client.ClientGinjector ginjector) {
    return new TabDataBasic(HomePresenter.getTabLabel(ginjector.getAppConstants()), 0);
  }
}
