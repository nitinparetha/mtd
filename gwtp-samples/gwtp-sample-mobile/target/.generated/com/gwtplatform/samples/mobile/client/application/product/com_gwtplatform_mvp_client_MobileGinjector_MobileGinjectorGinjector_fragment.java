package com.gwtplatform.samples.mobile.client.application.product;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector;

public class com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductPresenter$MyProxy$_annotation$$none$$(com.gwtplatform.samples.mobile.client.application.product.ProductPresenter.MyProxy injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductPresenter$_annotation$$none$$(com.gwtplatform.samples.mobile.client.application.product.ProductPresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection_(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductMobileView$Binder$_annotation$$none$$(com.gwtplatform.samples.mobile.client.application.product.ProductMobileView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductMobileView$_annotation$$none$$(com.gwtplatform.samples.mobile.client.application.product.ProductMobileView injectee) {
    
  }
  
  
  /**
   * Binding for com.gwtplatform.samples.mobile.client.application.product.ProductPresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:122)
   */
  public com.gwtplatform.samples.mobile.client.application.product.ProductPresenter.MyView get_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductPresenter$MyView$_annotation$$none$$() {
    com.gwtplatform.samples.mobile.client.application.product.ProductPresenter.MyView result = get_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductMobileView$_annotation$$none$$();
    return result;
    
  }
  
  private com.gwtplatform.samples.mobile.client.application.product.ProductPresenter.MyProxy singleton_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductPresenter$MyProxy$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.mobile.client.application.product.ProductPresenter.MyProxy get_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductPresenter$MyProxy$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductPresenter$MyProxy$_annotation$$none$$ == null) {
    Object created = GWT.create(com.gwtplatform.samples.mobile.client.application.product.ProductPresenter.MyProxy.class);
    assert created instanceof com.gwtplatform.samples.mobile.client.application.product.ProductPresenter.MyProxy;
    com.gwtplatform.samples.mobile.client.application.product.ProductPresenter.MyProxy result = (com.gwtplatform.samples.mobile.client.application.product.ProductPresenter.MyProxy) created;
    
    memberInject_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductPresenter$MyProxy$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductPresenter$MyProxy$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductPresenter$MyProxy$_annotation$$none$$;
    
  }
  
  private com.gwtplatform.samples.mobile.client.application.product.ProductPresenter singleton_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductPresenter$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.mobile.client.application.product.ProductPresenter get_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductPresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductPresenter$_annotation$$none$$ == null) {
    com.gwtplatform.samples.mobile.client.application.product.ProductPresenter result = com$gwtplatform$samples$mobile$client$application$product$ProductPresenter_com$gwtplatform$samples$mobile$client$application$product$ProductPresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductPresenter$MyView$_annotation$$none$$(), get_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductPresenter$MyProxy$_annotation$$none$$(), injector.getFragment_com_gwtplatform_mvp_client_proxy().get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$(), injector.getFragment_com_gwtplatform_dispatch_rpc_shared().get_Key$type$com$gwtplatform$dispatch$rpc$shared$DispatchAsync$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductPresenter$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductPresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductPresenter$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.samples.mobile.client.application.product.ProductPresenter com$gwtplatform$samples$mobile$client$application$product$ProductPresenter_com$gwtplatform$samples$mobile$client$application$product$ProductPresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.gwtplatform.samples.mobile.client.application.product.ProductPresenter.MyView _1, com.gwtplatform.samples.mobile.client.application.product.ProductPresenter.MyProxy _2, com.gwtplatform.mvp.client.proxy.PlaceManager _3, com.gwtplatform.dispatch.rpc.shared.DispatchAsync _4) {
    return new com.gwtplatform.samples.mobile.client.application.product.ProductPresenter(_0, _1, _2, _3, _4);
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.mobile.client.application.product.ProductPresenter> declared at:
   *   Implicit injection of com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.mobile.client.application.product.ProductPresenter>
   */
  public com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.mobile.client.application.product.ProductPresenter> get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$gwtplatform$samples$mobile$client$application$product$ProductPresenter$$_annotation$$none$$() {
    com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.mobile.client.application.product.ProductPresenter> result = new com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.mobile.client.application.product.ProductPresenter>() { 
        public void get(final com.google.gwt.user.client.rpc.AsyncCallback<? super com.gwtplatform.samples.mobile.client.application.product.ProductPresenter> callback) { 
          com.google.gwt.core.client.GWT.runAsync(com.gwtplatform.samples.mobile.client.application.product.ProductPresenter.class,new com.google.gwt.core.client.RunAsyncCallback() { 
            public void onSuccess() { 
              callback.onSuccess(get_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductPresenter$_annotation$$none$$());
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
   * Binding for com.gwtplatform.samples.mobile.client.application.product.ProductMobileView$Binder declared at:
   *   Implicit GWT.create binding for com.gwtplatform.samples.mobile.client.application.product.ProductMobileView$Binder
   */
  public com.gwtplatform.samples.mobile.client.application.product.ProductMobileView.Binder get_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductMobileView$Binder$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.samples.mobile.client.application.product.ProductMobileView.Binder.class);
    assert created instanceof com.gwtplatform.samples.mobile.client.application.product.ProductMobileView.Binder;
    com.gwtplatform.samples.mobile.client.application.product.ProductMobileView.Binder result = (com.gwtplatform.samples.mobile.client.application.product.ProductMobileView.Binder) created;
    
    memberInject_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductMobileView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private com.gwtplatform.samples.mobile.client.application.product.ProductMobileView singleton_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductMobileView$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.mobile.client.application.product.ProductMobileView get_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductMobileView$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductMobileView$_annotation$$none$$ == null) {
    com.gwtplatform.samples.mobile.client.application.product.ProductMobileView result = com$gwtplatform$samples$mobile$client$application$product$ProductMobileView_com$gwtplatform$samples$mobile$client$application$product$ProductMobileView_methodInjection(get_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductMobileView$Binder$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductMobileView$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductMobileView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductMobileView$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.samples.mobile.client.application.product.ProductMobileView com$gwtplatform$samples$mobile$client$application$product$ProductMobileView_com$gwtplatform$samples$mobile$client$application$product$ProductMobileView_methodInjection(com.gwtplatform.samples.mobile.client.application.product.ProductMobileView.Binder _0) {
    return new com.gwtplatform.samples.mobile.client.application.product.ProductMobileView(_0);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector injector;
  public com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector_fragment(com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector injector) {
    this.injector = injector;
  }
  
  public void initializeEagerSingletons() {
    // Eager singleton bound at:
    //   Implicit GWT.create binding for com.gwtplatform.samples.mobile.client.application.product.ProductPresenter$MyProxy
    get_Key$type$com$gwtplatform$samples$mobile$client$application$product$ProductPresenter$MyProxy$_annotation$$none$$();
    
  }
  
}
