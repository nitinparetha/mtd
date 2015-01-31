package com.gwtplatform.samples.tab.client.application.homenews;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsPresenter$MyProxy$_annotation$$none$$(com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter.MyProxy injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsPresenter$_annotation$$none$$(com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection________(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsView$Binder$_annotation$$none$$(com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsView$_annotation$$none$$(com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView injectee) {
    
  }
  
  
  /**
   * Binding for com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:122)
   */
  public com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter.MyView get_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsPresenter$MyView$_annotation$$none$$() {
    com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter.MyView result = get_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsView$_annotation$$none$$();
    return result;
    
  }
  
  private com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter.MyProxy singleton_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsPresenter$MyProxy$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter.MyProxy get_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsPresenter$MyProxy$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsPresenter$MyProxy$_annotation$$none$$ == null) {
    Object created = GWT.create(com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter.MyProxy.class);
    assert created instanceof com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter.MyProxy;
    com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter.MyProxy result = (com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter.MyProxy) created;
    
    memberInject_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsPresenter$MyProxy$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsPresenter$MyProxy$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsPresenter$MyProxy$_annotation$$none$$;
    
  }
  
  private com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter singleton_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsPresenter$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter get_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsPresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsPresenter$_annotation$$none$$ == null) {
    com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter result = com$gwtplatform$samples$tab$client$application$homenews$HomeNewsPresenter_com$gwtplatform$samples$tab$client$application$homenews$HomeNewsPresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsPresenter$MyView$_annotation$$none$$(), get_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsPresenter$MyProxy$_annotation$$none$$(), injector.getFragment_com_gwtplatform_mvp_client_proxy().get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsPresenter$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsPresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsPresenter$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter com$gwtplatform$samples$tab$client$application$homenews$HomeNewsPresenter_com$gwtplatform$samples$tab$client$application$homenews$HomeNewsPresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter.MyView _1, com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter.MyProxy _2, com.gwtplatform.mvp.client.proxy.PlaceManager _3) {
    return new com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter(_0, _1, _2, _3);
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter> declared at:
   *   Implicit injection of com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter>
   */
  public com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter> get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsPresenter$$_annotation$$none$$() {
    com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter> result = new com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter>() { 
        public void get(final com.google.gwt.user.client.rpc.AsyncCallback<? super com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter> callback) { 
          com.google.gwt.core.client.GWT.runAsync(com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter.class,new com.google.gwt.core.client.RunAsyncCallback() { 
            public void onSuccess() { 
              callback.onSuccess(get_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsPresenter$_annotation$$none$$());
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
   * Binding for com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView$Binder declared at:
   *   Implicit GWT.create binding for com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView$Binder
   */
  public com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView.Binder get_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsView$Binder$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView.Binder.class);
    assert created instanceof com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView.Binder;
    com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView.Binder result = (com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView.Binder) created;
    
    memberInject_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView singleton_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsView$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView get_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsView$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsView$_annotation$$none$$ == null) {
    com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView result = com$gwtplatform$samples$tab$client$application$homenews$HomeNewsView_com$gwtplatform$samples$tab$client$application$homenews$HomeNewsView_methodInjection(get_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsView$Binder$_annotation$$none$$(), injector.getFragment_com_gwtplatform_samples_tab_client_resources().get_Key$type$com$gwtplatform$samples$tab$client$resources$AppResources$_annotation$$none$$(), injector.getFragment_com_gwtplatform_samples_tab_client_resources().get_Key$type$com$gwtplatform$samples$tab$client$resources$AppConstants$_annotation$$none$$(), injector.getFragment_com_gwtplatform_samples_tab_client_resources().get_Key$type$com$gwtplatform$samples$tab$client$resources$AppMessages$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsView$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsView$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView com$gwtplatform$samples$tab$client$application$homenews$HomeNewsView_com$gwtplatform$samples$tab$client$application$homenews$HomeNewsView_methodInjection(com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView.Binder _0, com.gwtplatform.samples.tab.client.resources.AppResources _1, com.gwtplatform.samples.tab.client.resources.AppConstants _2, com.gwtplatform.samples.tab.client.resources.AppMessages _3) {
    return new com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView(_0, _1, _2, _3);
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
    //   Implicit GWT.create binding for com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter$MyProxy
    get_Key$type$com$gwtplatform$samples$tab$client$application$homenews$HomeNewsPresenter$MyProxy$_annotation$$none$$();
    
  }
  
}
