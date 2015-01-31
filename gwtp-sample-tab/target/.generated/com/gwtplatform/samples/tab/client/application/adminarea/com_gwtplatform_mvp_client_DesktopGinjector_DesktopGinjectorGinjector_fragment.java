package com.gwtplatform.samples.tab.client.application.adminarea;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaPresenter$MyProxy$_annotation$$none$$(com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter.MyProxy injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaPresenter$_annotation$$none$$(com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection_(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaView$Binder$_annotation$$none$$(com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaView$_annotation$$none$$(com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaView injectee) {
    
  }
  
  
  /**
   * Binding for com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:122)
   */
  public com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter.MyView get_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaPresenter$MyView$_annotation$$none$$() {
    com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter.MyView result = get_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaView$_annotation$$none$$();
    return result;
    
  }
  
  private com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter.MyProxy singleton_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaPresenter$MyProxy$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter.MyProxy get_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaPresenter$MyProxy$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaPresenter$MyProxy$_annotation$$none$$ == null) {
    Object created = GWT.create(com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter.MyProxy.class);
    assert created instanceof com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter.MyProxy;
    com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter.MyProxy result = (com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter.MyProxy) created;
    
    memberInject_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaPresenter$MyProxy$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaPresenter$MyProxy$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaPresenter$MyProxy$_annotation$$none$$;
    
  }
  
  private com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter singleton_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaPresenter$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter get_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaPresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaPresenter$_annotation$$none$$ == null) {
    com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter result = com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaPresenter_com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaPresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaPresenter$MyView$_annotation$$none$$(), get_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaPresenter$MyProxy$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaPresenter$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaPresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaPresenter$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaPresenter_com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaPresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter.MyView _1, com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter.MyProxy _2) {
    return new com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter(_0, _1, _2);
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter> declared at:
   *   Implicit injection of com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter>
   */
  public com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter> get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaPresenter$$_annotation$$none$$() {
    com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter> result = new com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter>() { 
        public void get(final com.google.gwt.user.client.rpc.AsyncCallback<? super com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter> callback) { 
          com.google.gwt.core.client.GWT.runAsync(com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter.class,new com.google.gwt.core.client.RunAsyncCallback() { 
            public void onSuccess() { 
              callback.onSuccess(get_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaPresenter$_annotation$$none$$());
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
   * Binding for com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaView$Binder declared at:
   *   Implicit GWT.create binding for com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaView$Binder
   */
  public com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaView.Binder get_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaView$Binder$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaView.Binder.class);
    assert created instanceof com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaView.Binder;
    com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaView.Binder result = (com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaView.Binder) created;
    
    memberInject_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaView singleton_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaView$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaView get_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaView$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaView$_annotation$$none$$ == null) {
    com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaView result = com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaView_com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaView_methodInjection(get_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaView$Binder$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaView$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaView$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaView com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaView_com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaView_methodInjection(com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaView.Binder _0) {
    return new com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaView(_0);
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
    //   Implicit GWT.create binding for com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter$MyProxy
    get_Key$type$com$gwtplatform$samples$tab$client$application$adminarea$AdminAreaPresenter$MyProxy$_annotation$$none$$();
    
  }
  
}
