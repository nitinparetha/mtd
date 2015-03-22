package com.gwtplatform.samples.mobile.client.application;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwtplatform$samples$mobile$client$application$AbstractApplicationPresenter$MyProxy$_annotation$$none$$(com.gwtplatform.samples.mobile.client.application.AbstractApplicationPresenter.MyProxy injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$mobile$client$application$ApplicationDesktopPresenter$_annotation$$none$$(com.gwtplatform.samples.mobile.client.application.ApplicationDesktopPresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection____(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$mobile$client$application$ApplicationDesktopView$Binder$_annotation$$none$$(com.gwtplatform.samples.mobile.client.application.ApplicationDesktopView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$mobile$client$application$ApplicationDesktopView$_annotation$$none$$(com.gwtplatform.samples.mobile.client.application.ApplicationDesktopView injectee) {
    
  }
  
  
  /**
   * Binding for com.gwtplatform.samples.mobile.client.application.AbstractApplicationPresenter$MyView declared at:
   *   com.gwtplatform.samples.mobile.client.application.ApplicationDesktopModule.configure(ApplicationDesktopModule.java:36)
   */
  public com.gwtplatform.samples.mobile.client.application.AbstractApplicationPresenter.MyView get_Key$type$com$gwtplatform$samples$mobile$client$application$AbstractApplicationPresenter$MyView$_annotation$$none$$() {
    com.gwtplatform.samples.mobile.client.application.AbstractApplicationPresenter.MyView result = get_Key$type$com$gwtplatform$samples$mobile$client$application$ApplicationDesktopView$_annotation$$none$$();
    return result;
    
  }
  
  
  /**
   * Binding for com.gwtplatform.samples.mobile.client.application.AbstractApplicationPresenter declared at:
   *   com.gwtplatform.samples.mobile.client.application.ApplicationDesktopModule.configure(ApplicationDesktopModule.java:37)
   */
  public com.gwtplatform.samples.mobile.client.application.AbstractApplicationPresenter get_Key$type$com$gwtplatform$samples$mobile$client$application$AbstractApplicationPresenter$_annotation$$none$$() {
    com.gwtplatform.samples.mobile.client.application.AbstractApplicationPresenter result = get_Key$type$com$gwtplatform$samples$mobile$client$application$ApplicationDesktopPresenter$_annotation$$none$$();
    return result;
    
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.mobile.client.application.AbstractApplicationPresenter> declared at:
   *   Implicit injection of com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.mobile.client.application.AbstractApplicationPresenter>
   */
  public com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.mobile.client.application.AbstractApplicationPresenter> get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$gwtplatform$samples$mobile$client$application$AbstractApplicationPresenter$$_annotation$$none$$() {
    com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.mobile.client.application.AbstractApplicationPresenter> result = new com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.mobile.client.application.AbstractApplicationPresenter>() { 
        public void get(final com.google.gwt.user.client.rpc.AsyncCallback<? super com.gwtplatform.samples.mobile.client.application.AbstractApplicationPresenter> callback) { 
          com.google.gwt.core.client.GWT.runAsync(com.gwtplatform.samples.mobile.client.application.AbstractApplicationPresenter.class,new com.google.gwt.core.client.RunAsyncCallback() { 
            public void onSuccess() { 
              callback.onSuccess(get_Key$type$com$gwtplatform$samples$mobile$client$application$AbstractApplicationPresenter$_annotation$$none$$());
            }
            public void onFailure(Throwable ex) { 
               callback.onFailure(ex); 
            } 
        }); 
        }
     };
    
    return result;
    
  }
  
  private com.gwtplatform.samples.mobile.client.application.AbstractApplicationPresenter.MyProxy singleton_Key$type$com$gwtplatform$samples$mobile$client$application$AbstractApplicationPresenter$MyProxy$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.mobile.client.application.AbstractApplicationPresenter.MyProxy get_Key$type$com$gwtplatform$samples$mobile$client$application$AbstractApplicationPresenter$MyProxy$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$mobile$client$application$AbstractApplicationPresenter$MyProxy$_annotation$$none$$ == null) {
    Object created = GWT.create(com.gwtplatform.samples.mobile.client.application.AbstractApplicationPresenter.MyProxy.class);
    assert created instanceof com.gwtplatform.samples.mobile.client.application.AbstractApplicationPresenter.MyProxy;
    com.gwtplatform.samples.mobile.client.application.AbstractApplicationPresenter.MyProxy result = (com.gwtplatform.samples.mobile.client.application.AbstractApplicationPresenter.MyProxy) created;
    
    memberInject_Key$type$com$gwtplatform$samples$mobile$client$application$AbstractApplicationPresenter$MyProxy$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$mobile$client$application$AbstractApplicationPresenter$MyProxy$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$mobile$client$application$AbstractApplicationPresenter$MyProxy$_annotation$$none$$;
    
  }
  
  private com.gwtplatform.samples.mobile.client.application.ApplicationDesktopPresenter singleton_Key$type$com$gwtplatform$samples$mobile$client$application$ApplicationDesktopPresenter$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.mobile.client.application.ApplicationDesktopPresenter get_Key$type$com$gwtplatform$samples$mobile$client$application$ApplicationDesktopPresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$mobile$client$application$ApplicationDesktopPresenter$_annotation$$none$$ == null) {
    com.gwtplatform.samples.mobile.client.application.ApplicationDesktopPresenter result = com$gwtplatform$samples$mobile$client$application$ApplicationDesktopPresenter_com$gwtplatform$samples$mobile$client$application$ApplicationDesktopPresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$gwtplatform$samples$mobile$client$application$AbstractApplicationPresenter$MyView$_annotation$$none$$(), get_Key$type$com$gwtplatform$samples$mobile$client$application$AbstractApplicationPresenter$MyProxy$_annotation$$none$$(), injector.getFragment_com_gwtplatform_mvp_client_proxy().get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$samples$mobile$client$application$ApplicationDesktopPresenter$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$mobile$client$application$ApplicationDesktopPresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$mobile$client$application$ApplicationDesktopPresenter$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.samples.mobile.client.application.ApplicationDesktopPresenter com$gwtplatform$samples$mobile$client$application$ApplicationDesktopPresenter_com$gwtplatform$samples$mobile$client$application$ApplicationDesktopPresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.gwtplatform.samples.mobile.client.application.AbstractApplicationPresenter.MyView _1, com.gwtplatform.samples.mobile.client.application.AbstractApplicationPresenter.MyProxy _2, com.gwtplatform.mvp.client.proxy.PlaceManager _3) {
    return new com.gwtplatform.samples.mobile.client.application.ApplicationDesktopPresenter(_0, _1, _2, _3);
  }
  
  
  /**
   * Binding for com.gwtplatform.samples.mobile.client.application.ApplicationDesktopView$Binder declared at:
   *   Implicit GWT.create binding for com.gwtplatform.samples.mobile.client.application.ApplicationDesktopView$Binder
   */
  public com.gwtplatform.samples.mobile.client.application.ApplicationDesktopView.Binder get_Key$type$com$gwtplatform$samples$mobile$client$application$ApplicationDesktopView$Binder$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.samples.mobile.client.application.ApplicationDesktopView.Binder.class);
    assert created instanceof com.gwtplatform.samples.mobile.client.application.ApplicationDesktopView.Binder;
    com.gwtplatform.samples.mobile.client.application.ApplicationDesktopView.Binder result = (com.gwtplatform.samples.mobile.client.application.ApplicationDesktopView.Binder) created;
    
    memberInject_Key$type$com$gwtplatform$samples$mobile$client$application$ApplicationDesktopView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private com.gwtplatform.samples.mobile.client.application.ApplicationDesktopView singleton_Key$type$com$gwtplatform$samples$mobile$client$application$ApplicationDesktopView$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.mobile.client.application.ApplicationDesktopView get_Key$type$com$gwtplatform$samples$mobile$client$application$ApplicationDesktopView$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$mobile$client$application$ApplicationDesktopView$_annotation$$none$$ == null) {
    com.gwtplatform.samples.mobile.client.application.ApplicationDesktopView result = com$gwtplatform$samples$mobile$client$application$ApplicationDesktopView_com$gwtplatform$samples$mobile$client$application$ApplicationDesktopView_methodInjection(get_Key$type$com$gwtplatform$samples$mobile$client$application$ApplicationDesktopView$Binder$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$samples$mobile$client$application$ApplicationDesktopView$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$mobile$client$application$ApplicationDesktopView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$mobile$client$application$ApplicationDesktopView$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.samples.mobile.client.application.ApplicationDesktopView com$gwtplatform$samples$mobile$client$application$ApplicationDesktopView_com$gwtplatform$samples$mobile$client$application$ApplicationDesktopView_methodInjection(com.gwtplatform.samples.mobile.client.application.ApplicationDesktopView.Binder _0) {
    return new com.gwtplatform.samples.mobile.client.application.ApplicationDesktopView(_0);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector;
  public com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment(com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector) {
    this.injector = injector;
  }
  
  public void initializeEagerSingletons() {
    // Eager singleton bound at:
    //   Implicit GWT.create binding for com.gwtplatform.samples.mobile.client.application.AbstractApplicationPresenter$MyProxy
    get_Key$type$com$gwtplatform$samples$mobile$client$application$AbstractApplicationPresenter$MyProxy$_annotation$$none$$();
    
  }
  
}
