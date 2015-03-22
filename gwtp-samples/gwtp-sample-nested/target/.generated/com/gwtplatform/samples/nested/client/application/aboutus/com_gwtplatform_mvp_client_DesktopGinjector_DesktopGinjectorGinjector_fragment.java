package com.gwtplatform.samples.nested.client.application.aboutus;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsPresenter$MyProxy$_annotation$$none$$(com.gwtplatform.samples.nested.client.application.aboutus.AboutUsPresenter.MyProxy injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsPresenter$_annotation$$none$$(com.gwtplatform.samples.nested.client.application.aboutus.AboutUsPresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection_(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsView$Binder$_annotation$$none$$(com.gwtplatform.samples.nested.client.application.aboutus.AboutUsView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsView$_annotation$$none$$(com.gwtplatform.samples.nested.client.application.aboutus.AboutUsView injectee) {
    
  }
  
  
  /**
   * Binding for com.gwtplatform.samples.nested.client.application.aboutus.AboutUsPresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:122)
   */
  public com.gwtplatform.samples.nested.client.application.aboutus.AboutUsPresenter.MyView get_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsPresenter$MyView$_annotation$$none$$() {
    com.gwtplatform.samples.nested.client.application.aboutus.AboutUsPresenter.MyView result = get_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsView$_annotation$$none$$();
    return result;
    
  }
  
  private com.gwtplatform.samples.nested.client.application.aboutus.AboutUsPresenter.MyProxy singleton_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsPresenter$MyProxy$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.nested.client.application.aboutus.AboutUsPresenter.MyProxy get_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsPresenter$MyProxy$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsPresenter$MyProxy$_annotation$$none$$ == null) {
    Object created = GWT.create(com.gwtplatform.samples.nested.client.application.aboutus.AboutUsPresenter.MyProxy.class);
    assert created instanceof com.gwtplatform.samples.nested.client.application.aboutus.AboutUsPresenter.MyProxy;
    com.gwtplatform.samples.nested.client.application.aboutus.AboutUsPresenter.MyProxy result = (com.gwtplatform.samples.nested.client.application.aboutus.AboutUsPresenter.MyProxy) created;
    
    memberInject_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsPresenter$MyProxy$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsPresenter$MyProxy$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsPresenter$MyProxy$_annotation$$none$$;
    
  }
  
  private com.gwtplatform.samples.nested.client.application.aboutus.AboutUsPresenter singleton_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsPresenter$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.nested.client.application.aboutus.AboutUsPresenter get_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsPresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsPresenter$_annotation$$none$$ == null) {
    com.gwtplatform.samples.nested.client.application.aboutus.AboutUsPresenter result = com$gwtplatform$samples$nested$client$application$aboutus$AboutUsPresenter_com$gwtplatform$samples$nested$client$application$aboutus$AboutUsPresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsPresenter$MyView$_annotation$$none$$(), get_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsPresenter$MyProxy$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsPresenter$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsPresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsPresenter$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.samples.nested.client.application.aboutus.AboutUsPresenter com$gwtplatform$samples$nested$client$application$aboutus$AboutUsPresenter_com$gwtplatform$samples$nested$client$application$aboutus$AboutUsPresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.gwtplatform.samples.nested.client.application.aboutus.AboutUsPresenter.MyView _1, com.gwtplatform.samples.nested.client.application.aboutus.AboutUsPresenter.MyProxy _2) {
    return new com.gwtplatform.samples.nested.client.application.aboutus.AboutUsPresenter(_0, _1, _2);
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.nested.client.application.aboutus.AboutUsPresenter> declared at:
   *   Implicit injection of com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.nested.client.application.aboutus.AboutUsPresenter>
   */
  public com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.nested.client.application.aboutus.AboutUsPresenter> get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsPresenter$$_annotation$$none$$() {
    com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.nested.client.application.aboutus.AboutUsPresenter> result = new com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.nested.client.application.aboutus.AboutUsPresenter>() { 
        public void get(final com.google.gwt.user.client.rpc.AsyncCallback<? super com.gwtplatform.samples.nested.client.application.aboutus.AboutUsPresenter> callback) { 
          com.google.gwt.core.client.GWT.runAsync(com.gwtplatform.samples.nested.client.application.aboutus.AboutUsPresenter.class,new com.google.gwt.core.client.RunAsyncCallback() { 
            public void onSuccess() { 
              callback.onSuccess(get_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsPresenter$_annotation$$none$$());
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
   * Binding for com.gwtplatform.samples.nested.client.application.aboutus.AboutUsView$Binder declared at:
   *   Implicit GWT.create binding for com.gwtplatform.samples.nested.client.application.aboutus.AboutUsView$Binder
   */
  public com.gwtplatform.samples.nested.client.application.aboutus.AboutUsView.Binder get_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsView$Binder$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.samples.nested.client.application.aboutus.AboutUsView.Binder.class);
    assert created instanceof com.gwtplatform.samples.nested.client.application.aboutus.AboutUsView.Binder;
    com.gwtplatform.samples.nested.client.application.aboutus.AboutUsView.Binder result = (com.gwtplatform.samples.nested.client.application.aboutus.AboutUsView.Binder) created;
    
    memberInject_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private com.gwtplatform.samples.nested.client.application.aboutus.AboutUsView singleton_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsView$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.nested.client.application.aboutus.AboutUsView get_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsView$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsView$_annotation$$none$$ == null) {
    com.gwtplatform.samples.nested.client.application.aboutus.AboutUsView result = com$gwtplatform$samples$nested$client$application$aboutus$AboutUsView_com$gwtplatform$samples$nested$client$application$aboutus$AboutUsView_methodInjection(get_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsView$Binder$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsView$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsView$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.samples.nested.client.application.aboutus.AboutUsView com$gwtplatform$samples$nested$client$application$aboutus$AboutUsView_com$gwtplatform$samples$nested$client$application$aboutus$AboutUsView_methodInjection(com.gwtplatform.samples.nested.client.application.aboutus.AboutUsView.Binder _0) {
    return new com.gwtplatform.samples.nested.client.application.aboutus.AboutUsView(_0);
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
    //   Implicit GWT.create binding for com.gwtplatform.samples.nested.client.application.aboutus.AboutUsPresenter$MyProxy
    get_Key$type$com$gwtplatform$samples$nested$client$application$aboutus$AboutUsPresenter$MyProxy$_annotation$$none$$();
    
  }
  
}
