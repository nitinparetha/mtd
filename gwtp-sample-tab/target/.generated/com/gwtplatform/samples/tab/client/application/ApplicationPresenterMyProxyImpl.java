package com.gwtplatform.samples.tab.client.application;

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

public class ApplicationPresenterMyProxyImpl extends com.gwtplatform.mvp.client.proxy.ProxyImpl<ApplicationPresenter> implements com.gwtplatform.samples.tab.client.application.ApplicationPresenter.MyProxy, com.gwtplatform.mvp.client.DelayedBind, com.gwtplatform.samples.tab.client.security.CurrentUserChangedHandler, com.gwtplatform.mvp.client.proxy.AsyncCallStartHandler, com.gwtplatform.mvp.client.proxy.AsyncCallFailHandler, com.gwtplatform.mvp.client.proxy.AsyncCallSucceedHandler {
  
  private com.gwtplatform.mvp.client.ClientGinjector ginjector;
  
  public ApplicationPresenterMyProxyImpl() {
    DelayedBindRegistry.register(this);
  }
  
  @Override
  public void delayedBind(Ginjector baseGinjector) {
    ginjector = (com.gwtplatform.mvp.client.ClientGinjector)baseGinjector;
    bind(ginjector.getPlaceManager(),
        ginjector.getEventBus());
    presenter = new StandardProvider<ApplicationPresenter>( ginjector.getcomgwtplatformsamplestabclientapplicationApplicationPresenter() );
    
    RevealContentHandler<ApplicationPresenter> revealContentHandler = new RevealContentHandler<ApplicationPresenter>( eventBus, this );
    getEventBus().addHandler( ApplicationPresenter.SLOT_SetTabContent, revealContentHandler );
    getEventBus().addHandler( com.gwtplatform.samples.tab.client.security.CurrentUserChangedEvent.getType(), this );
    getEventBus().addHandler( com.gwtplatform.mvp.client.proxy.AsyncCallStartEvent.getType(), this );
    getEventBus().addHandler( com.gwtplatform.mvp.client.proxy.AsyncCallFailEvent.getType(), this );
    getEventBus().addHandler( com.gwtplatform.mvp.client.proxy.AsyncCallSucceedEvent.getType(), this );
  }
  
  @Override
  public final void onCurrentUserChanged( final com.gwtplatform.samples.tab.client.security.CurrentUserChangedEvent event ) {
    getPresenter( new NotifyingAsyncCallback<ApplicationPresenter>(getEventBus()) {
      @Override
      public void success(final ApplicationPresenter presenter) {
        Scheduler.get().scheduleDeferred( new Command() {
          @Override
          public void execute() {
            presenter.onCurrentUserChanged( event );
          }
        } );
      }
    } );
  }
  
  @Override
  public final void onAsyncCallStart( final com.gwtplatform.mvp.client.proxy.AsyncCallStartEvent event ) {
    getPresenter( new NotifyingAsyncCallback<ApplicationPresenter>(getEventBus()) {
      @Override
      public void success(final ApplicationPresenter presenter) {
        Scheduler.get().scheduleDeferred( new Command() {
          @Override
          public void execute() {
            presenter.onAsyncCallStart( event );
          }
        } );
      }
    } );
  }
  
  @Override
  public final void onAsyncCallFail( final com.gwtplatform.mvp.client.proxy.AsyncCallFailEvent event ) {
    getPresenter( new NotifyingAsyncCallback<ApplicationPresenter>(getEventBus()) {
      @Override
      public void success(final ApplicationPresenter presenter) {
        Scheduler.get().scheduleDeferred( new Command() {
          @Override
          public void execute() {
            presenter.onAsyncCallFail( event );
          }
        } );
      }
    } );
  }
  
  @Override
  public final void onAsyncCallSucceed( final com.gwtplatform.mvp.client.proxy.AsyncCallSucceedEvent event ) {
    getPresenter( new NotifyingAsyncCallback<ApplicationPresenter>(getEventBus()) {
      @Override
      public void success(final ApplicationPresenter presenter) {
        Scheduler.get().scheduleDeferred( new Command() {
          @Override
          public void execute() {
            presenter.onAsyncCallSucceed( event );
          }
        } );
      }
    } );
  }
}
