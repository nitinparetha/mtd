package com.gwtplatform.samples.nested.client.application;

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

public class ApplicationPresenterMyProxyImpl extends com.gwtplatform.mvp.client.proxy.ProxyImpl<ApplicationPresenter> implements com.gwtplatform.samples.nested.client.application.ApplicationPresenter.MyProxy, com.gwtplatform.mvp.client.DelayedBind, com.gwtplatform.mvp.client.proxy.LockInteractionHandler {
  
  private com.gwtplatform.mvp.client.ClientGinjector ginjector;
  
  public ApplicationPresenterMyProxyImpl() {
    DelayedBindRegistry.register(this);
  }
  
  @Override
  public void delayedBind(Ginjector baseGinjector) {
    ginjector = (com.gwtplatform.mvp.client.ClientGinjector)baseGinjector;
    bind(ginjector.getPlaceManager(),
        ginjector.getEventBus());
    presenter = new StandardProvider<ApplicationPresenter>( ginjector.getcomgwtplatformsamplesnestedclientapplicationApplicationPresenter() );
    
    RevealContentHandler<ApplicationPresenter> revealContentHandler = new RevealContentHandler<ApplicationPresenter>( eventBus, this );
    getEventBus().addHandler( ApplicationPresenter.SLOT_SetMainContent, revealContentHandler );
    getEventBus().addHandler( com.gwtplatform.mvp.client.proxy.LockInteractionEvent.getType(), this );
  }
  
  @Override
  public final void onLockInteraction( final com.gwtplatform.mvp.client.proxy.LockInteractionEvent event ) {
    getPresenter( new NotifyingAsyncCallback<ApplicationPresenter>(getEventBus()) {
      @Override
      public void success(final ApplicationPresenter presenter) {
        Scheduler.get().scheduleDeferred( new Command() {
          @Override
          public void execute() {
            presenter.onLockInteraction( event );
          }
        } );
      }
    } );
  }
}
