package com.gwtplatform.samples.nested.client.application.home;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwtplatform$samples$nested$client$application$home$HomePresenter$MyProxy$_annotation$$none$$(com.gwtplatform.samples.nested.client.application.home.HomePresenter.MyProxy injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$nested$client$application$home$HomePresenter$_annotation$$none$$(com.gwtplatform.samples.nested.client.application.home.HomePresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection___(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$nested$client$application$home$HomeView$Binder$_annotation$$none$$(com.gwtplatform.samples.nested.client.application.home.HomeView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$nested$client$application$home$HomeView$_annotation$$none$$(com.gwtplatform.samples.nested.client.application.home.HomeView injectee) {
    
  }
  
  
  /**
   * Binding for com.gwtplatform.samples.nested.client.application.home.HomePresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:122)
   */
  public com.gwtplatform.samples.nested.client.application.home.HomePresenter.MyView get_Key$type$com$gwtplatform$samples$nested$client$application$home$HomePresenter$MyView$_annotation$$none$$() {
    com.gwtplatform.samples.nested.client.application.home.HomePresenter.MyView result = get_Key$type$com$gwtplatform$samples$nested$client$application$home$HomeView$_annotation$$none$$();
    return result;
    
  }
  
  private com.gwtplatform.samples.nested.client.application.home.HomePresenter.MyProxy singleton_Key$type$com$gwtplatform$samples$nested$client$application$home$HomePresenter$MyProxy$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.nested.client.application.home.HomePresenter.MyProxy get_Key$type$com$gwtplatform$samples$nested$client$application$home$HomePresenter$MyProxy$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$nested$client$application$home$HomePresenter$MyProxy$_annotation$$none$$ == null) {
    Object created = GWT.create(com.gwtplatform.samples.nested.client.application.home.HomePresenter.MyProxy.class);
    assert created instanceof com.gwtplatform.samples.nested.client.application.home.HomePresenter.MyProxy;
    com.gwtplatform.samples.nested.client.application.home.HomePresenter.MyProxy result = (com.gwtplatform.samples.nested.client.application.home.HomePresenter.MyProxy) created;
    
    memberInject_Key$type$com$gwtplatform$samples$nested$client$application$home$HomePresenter$MyProxy$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$nested$client$application$home$HomePresenter$MyProxy$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$nested$client$application$home$HomePresenter$MyProxy$_annotation$$none$$;
    
  }
  
  private com.gwtplatform.samples.nested.client.application.home.HomePresenter singleton_Key$type$com$gwtplatform$samples$nested$client$application$home$HomePresenter$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.nested.client.application.home.HomePresenter get_Key$type$com$gwtplatform$samples$nested$client$application$home$HomePresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$nested$client$application$home$HomePresenter$_annotation$$none$$ == null) {
    com.gwtplatform.samples.nested.client.application.home.HomePresenter result = com$gwtplatform$samples$nested$client$application$home$HomePresenter_com$gwtplatform$samples$nested$client$application$home$HomePresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$gwtplatform$samples$nested$client$application$home$HomePresenter$MyView$_annotation$$none$$(), get_Key$type$com$gwtplatform$samples$nested$client$application$home$HomePresenter$MyProxy$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$samples$nested$client$application$home$HomePresenter$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$nested$client$application$home$HomePresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$nested$client$application$home$HomePresenter$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.samples.nested.client.application.home.HomePresenter com$gwtplatform$samples$nested$client$application$home$HomePresenter_com$gwtplatform$samples$nested$client$application$home$HomePresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.gwtplatform.samples.nested.client.application.home.HomePresenter.MyView _1, com.gwtplatform.samples.nested.client.application.home.HomePresenter.MyProxy _2) {
    return new com.gwtplatform.samples.nested.client.application.home.HomePresenter(_0, _1, _2);
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.nested.client.application.home.HomePresenter> declared at:
   *   Implicit injection of com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.nested.client.application.home.HomePresenter>
   */
  public com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.nested.client.application.home.HomePresenter> get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$gwtplatform$samples$nested$client$application$home$HomePresenter$$_annotation$$none$$() {
    com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.nested.client.application.home.HomePresenter> result = new com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.nested.client.application.home.HomePresenter>() { 
        public void get(final com.google.gwt.user.client.rpc.AsyncCallback<? super com.gwtplatform.samples.nested.client.application.home.HomePresenter> callback) { 
          com.google.gwt.core.client.GWT.runAsync(com.gwtplatform.samples.nested.client.application.home.HomePresenter.class,new com.google.gwt.core.client.RunAsyncCallback() { 
            public void onSuccess() { 
              callback.onSuccess(get_Key$type$com$gwtplatform$samples$nested$client$application$home$HomePresenter$_annotation$$none$$());
            }
            public void onFailure(Throwable ex) { 
               callback.onFailure(ex); 
            } 
        }); 
        }
     };
    
    return result;
    
  }
  
  
  /**
   * Binding for com.gwtplatform.samples.nested.client.application.home.HomeView$Binder declared at:
   *   Implicit GWT.create binding for com.gwtplatform.samples.nested.client.application.home.HomeView$Binder
   */
  public com.gwtplatform.samples.nested.client.application.home.HomeView.Binder get_Key$type$com$gwtplatform$samples$nested$client$application$home$HomeView$Binder$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.samples.nested.client.application.home.HomeView.Binder.class);
    assert created instanceof com.gwtplatform.samples.nested.client.application.home.HomeView.Binder;
    com.gwtplatform.samples.nested.client.application.home.HomeView.Binder result = (com.gwtplatform.samples.nested.client.application.home.HomeView.Binder) created;
    
    memberInject_Key$type$com$gwtplatform$samples$nested$client$application$home$HomeView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private com.gwtplatform.samples.nested.client.application.home.HomeView singleton_Key$type$com$gwtplatform$samples$nested$client$application$home$HomeView$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.nested.client.application.home.HomeView get_Key$type$com$gwtplatform$samples$nested$client$application$home$HomeView$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$nested$client$application$home$HomeView$_annotation$$none$$ == null) {
    com.gwtplatform.samples.nested.client.application.home.HomeView result = com$gwtplatform$samples$nested$client$application$home$HomeView_com$gwtplatform$samples$nested$client$application$home$HomeView_methodInjection(get_Key$type$com$gwtplatform$samples$nested$client$application$home$HomeView$Binder$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$samples$nested$client$application$home$HomeView$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$nested$client$application$home$HomeView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$nested$client$application$home$HomeView$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.samples.nested.client.application.home.HomeView com$gwtplatform$samples$nested$client$application$home$HomeView_com$gwtplatform$samples$nested$client$application$home$HomeView_methodInjection(com.gwtplatform.samples.nested.client.application.home.HomeView.Binder _0) {
    return new com.gwtplatform.samples.nested.client.application.home.HomeView(_0);
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
    //   Implicit GWT.create binding for com.gwtplatform.samples.nested.client.application.home.HomePresenter$MyProxy
    get_Key$type$com$gwtplatform$samples$nested$client$application$home$HomePresenter$MyProxy$_annotation$$none$$();
    
  }
  
}
