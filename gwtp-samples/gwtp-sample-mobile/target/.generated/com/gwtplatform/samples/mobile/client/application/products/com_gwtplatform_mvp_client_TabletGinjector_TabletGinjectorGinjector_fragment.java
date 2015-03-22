package com.gwtplatform.samples.mobile.client.application.products;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_TabletGinjector_TabletGinjectorGinjector;

public class com_gwtplatform_mvp_client_TabletGinjector_TabletGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsPresenter$MyProxy$_annotation$$none$$(com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter.MyProxy injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsPresenter$_annotation$$none$$(com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection__(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsTabletView$Binder$_annotation$$none$$(com.gwtplatform.samples.mobile.client.application.products.ProductsTabletView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsTabletView$_annotation$$none$$(com.gwtplatform.samples.mobile.client.application.products.ProductsTabletView injectee) {
    
  }
  
  
  /**
   * Binding for com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:122)
   */
  public com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter.MyView get_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsPresenter$MyView$_annotation$$none$$() {
    com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter.MyView result = get_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsTabletView$_annotation$$none$$();
    return result;
    
  }
  
  private com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter.MyProxy singleton_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsPresenter$MyProxy$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter.MyProxy get_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsPresenter$MyProxy$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsPresenter$MyProxy$_annotation$$none$$ == null) {
    Object created = GWT.create(com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter.MyProxy.class);
    assert created instanceof com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter.MyProxy;
    com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter.MyProxy result = (com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter.MyProxy) created;
    
    memberInject_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsPresenter$MyProxy$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsPresenter$MyProxy$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsPresenter$MyProxy$_annotation$$none$$;
    
  }
  
  private com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter singleton_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsPresenter$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter get_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsPresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsPresenter$_annotation$$none$$ == null) {
    com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter result = com$gwtplatform$samples$mobile$client$application$products$ProductsPresenter_com$gwtplatform$samples$mobile$client$application$products$ProductsPresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsPresenter$MyView$_annotation$$none$$(), get_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsPresenter$MyProxy$_annotation$$none$$(), injector.getFragment_com_gwtplatform_mvp_client_proxy().get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$(), injector.getFragment_com_gwtplatform_dispatch_rpc_shared().get_Key$type$com$gwtplatform$dispatch$rpc$shared$DispatchAsync$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsPresenter$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsPresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsPresenter$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter com$gwtplatform$samples$mobile$client$application$products$ProductsPresenter_com$gwtplatform$samples$mobile$client$application$products$ProductsPresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter.MyView _1, com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter.MyProxy _2, com.gwtplatform.mvp.client.proxy.PlaceManager _3, com.gwtplatform.dispatch.rpc.shared.DispatchAsync _4) {
    return new com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter(_0, _1, _2, _3, _4);
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter> declared at:
   *   Implicit injection of com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter>
   */
  public com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter> get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$gwtplatform$samples$mobile$client$application$products$ProductsPresenter$$_annotation$$none$$() {
    com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter> result = new com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter>() { 
        public void get(final com.google.gwt.user.client.rpc.AsyncCallback<? super com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter> callback) { 
          com.google.gwt.core.client.GWT.runAsync(com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter.class,new com.google.gwt.core.client.RunAsyncCallback() { 
            public void onSuccess() { 
              callback.onSuccess(get_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsPresenter$_annotation$$none$$());
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
   * Binding for com.gwtplatform.samples.mobile.client.application.products.ProductsTabletView$Binder declared at:
   *   Implicit GWT.create binding for com.gwtplatform.samples.mobile.client.application.products.ProductsTabletView$Binder
   */
  public com.gwtplatform.samples.mobile.client.application.products.ProductsTabletView.Binder get_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsTabletView$Binder$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.samples.mobile.client.application.products.ProductsTabletView.Binder.class);
    assert created instanceof com.gwtplatform.samples.mobile.client.application.products.ProductsTabletView.Binder;
    com.gwtplatform.samples.mobile.client.application.products.ProductsTabletView.Binder result = (com.gwtplatform.samples.mobile.client.application.products.ProductsTabletView.Binder) created;
    
    memberInject_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsTabletView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private com.gwtplatform.samples.mobile.client.application.products.ProductsTabletView singleton_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsTabletView$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.mobile.client.application.products.ProductsTabletView get_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsTabletView$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsTabletView$_annotation$$none$$ == null) {
    com.gwtplatform.samples.mobile.client.application.products.ProductsTabletView result = com$gwtplatform$samples$mobile$client$application$products$ProductsTabletView_com$gwtplatform$samples$mobile$client$application$products$ProductsTabletView_methodInjection(get_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsTabletView$Binder$_annotation$$none$$(), injector.getFragment_com_gwtplatform_mvp_client_proxy().get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsTabletView$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsTabletView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsTabletView$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.samples.mobile.client.application.products.ProductsTabletView com$gwtplatform$samples$mobile$client$application$products$ProductsTabletView_com$gwtplatform$samples$mobile$client$application$products$ProductsTabletView_methodInjection(com.gwtplatform.samples.mobile.client.application.products.ProductsTabletView.Binder _0, com.gwtplatform.mvp.client.proxy.PlaceManager _1) {
    return new com.gwtplatform.samples.mobile.client.application.products.ProductsTabletView(_0, _1);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_TabletGinjector_TabletGinjectorGinjector injector;
  public com_gwtplatform_mvp_client_TabletGinjector_TabletGinjectorGinjector_fragment(com_gwtplatform_mvp_client_TabletGinjector_TabletGinjectorGinjector injector) {
    this.injector = injector;
  }
  
  public void initializeEagerSingletons() {
    // Eager singleton bound at:
    //   Implicit GWT.create binding for com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter$MyProxy
    get_Key$type$com$gwtplatform$samples$mobile$client$application$products$ProductsPresenter$MyProxy$_annotation$$none$$();
    
  }
  
}
