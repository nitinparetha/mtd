package com.gwtplatform.samples.tab.client.application.homeinfo;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoPresenter$MyProxy$_annotation$$none$$(com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter.MyProxy injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoPresenter$_annotation$$none$$(com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection_______(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoView$Binder$_annotation$$none$$(com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoView$_annotation$$none$$(com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoView injectee) {
    
  }
  
  
  /**
   * Binding for com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:122)
   */
  public com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter.MyView get_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoPresenter$MyView$_annotation$$none$$() {
    com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter.MyView result = get_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoView$_annotation$$none$$();
    return result;
    
  }
  
  private com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter.MyProxy singleton_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoPresenter$MyProxy$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter.MyProxy get_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoPresenter$MyProxy$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoPresenter$MyProxy$_annotation$$none$$ == null) {
    Object created = GWT.create(com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter.MyProxy.class);
    assert created instanceof com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter.MyProxy;
    com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter.MyProxy result = (com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter.MyProxy) created;
    
    memberInject_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoPresenter$MyProxy$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoPresenter$MyProxy$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoPresenter$MyProxy$_annotation$$none$$;
    
  }
  
  private com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter singleton_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoPresenter$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter get_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoPresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoPresenter$_annotation$$none$$ == null) {
    com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter result = com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoPresenter_com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoPresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoPresenter$MyView$_annotation$$none$$(), get_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoPresenter$MyProxy$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoPresenter$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoPresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoPresenter$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoPresenter_com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoPresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter.MyView _1, com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter.MyProxy _2) {
    return new com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter(_0, _1, _2);
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter> declared at:
   *   Implicit injection of com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter>
   */
  public com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter> get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoPresenter$$_annotation$$none$$() {
    com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter> result = new com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter>() { 
        public void get(final com.google.gwt.user.client.rpc.AsyncCallback<? super com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter> callback) { 
          com.google.gwt.core.client.GWT.runAsync(com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter.class,new com.google.gwt.core.client.RunAsyncCallback() { 
            public void onSuccess() { 
              callback.onSuccess(get_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoPresenter$_annotation$$none$$());
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
   * Binding for com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoView$Binder declared at:
   *   Implicit GWT.create binding for com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoView$Binder
   */
  public com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoView.Binder get_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoView$Binder$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoView.Binder.class);
    assert created instanceof com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoView.Binder;
    com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoView.Binder result = (com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoView.Binder) created;
    
    memberInject_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoView singleton_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoView$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoView get_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoView$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoView$_annotation$$none$$ == null) {
    com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoView result = com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoView_com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoView_methodInjection(get_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoView$Binder$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoView$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoView$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoView com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoView_com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoView_methodInjection(com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoView.Binder _0) {
    return new com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoView(_0);
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
    //   Implicit GWT.create binding for com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter$MyProxy
    get_Key$type$com$gwtplatform$samples$tab$client$application$homeinfo$HomeInfoPresenter$MyProxy$_annotation$$none$$();
    
  }
  
}
