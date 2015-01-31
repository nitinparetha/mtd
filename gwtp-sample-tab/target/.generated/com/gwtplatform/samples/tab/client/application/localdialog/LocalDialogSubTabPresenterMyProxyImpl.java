package com.gwtplatform.samples.tab.client.application.localdialog;

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

public class LocalDialogSubTabPresenterMyProxyImpl extends com.gwtplatform.mvp.client.proxy.TabContentProxyPlaceImpl<LocalDialogSubTabPresenter> implements com.gwtplatform.samples.tab.client.application.localdialog.LocalDialogSubTabPresenter.MyProxy, com.gwtplatform.mvp.client.DelayedBind {
  
  private com.gwtplatform.mvp.client.ClientGinjector ginjector;
  
  public static class WrappedProxy
  extends com.gwtplatform.mvp.client.proxy.NonLeafTabContentProxyImpl<LocalDialogSubTabPresenter> implements com.gwtplatform.mvp.client.DelayedBind {
    
    private com.gwtplatform.mvp.client.ClientGinjector ginjector;
    
    public WrappedProxy() {
    }
    
    @Override
    public void delayedBind(Ginjector baseGinjector) {
      ginjector = (com.gwtplatform.mvp.client.ClientGinjector)baseGinjector;
      bind(ginjector.getPlaceManager(),
          ginjector.getEventBus());
      requestTabsEventType = com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter.SLOT_RequestTabs;
      tabData = getTabDataInternal(ginjector);
      targetHistoryToken = "!localDialogPage";
      addRequestTabsHandler();
      presenter = new CodeSplitProvider<LocalDialogSubTabPresenter>( ginjector.getcomgwtplatformsamplestabclientapplicationlocaldialogLocalDialogSubTabPresenter() );
    }
    
    protected TabData getTabDataInternal(com.gwtplatform.mvp.client.ClientGinjector ginjector) {
      return new TabDataBasic("Local", 5);
    }
  }
  
  public LocalDialogSubTabPresenterMyProxyImpl() {
    DelayedBindRegistry.register(this);
  }
  
  @Override
  public void delayedBind(Ginjector baseGinjector) {
    ginjector = (com.gwtplatform.mvp.client.ClientGinjector)baseGinjector;
    bind(ginjector.getPlaceManager(),
        ginjector.getEventBus());
    WrappedProxy wrappedProxy = GWT.create(WrappedProxy.class);
    wrappedProxy.delayedBind( ginjector ); 
    setProxy(wrappedProxy); 
    String[] nameToken = {"!localDialogPage"}; 
    String[] gatekeeperParams = null;
    setPlace(new com.gwtplatform.mvp.client.proxy.PlaceImpl( nameToken ));
  }
}
