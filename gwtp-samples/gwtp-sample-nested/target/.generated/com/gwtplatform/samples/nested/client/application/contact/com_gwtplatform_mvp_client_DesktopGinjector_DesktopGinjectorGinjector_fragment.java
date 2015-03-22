package com.gwtplatform.samples.nested.client.application.contact;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactPresenter$MyProxy$_annotation$$none$$(com.gwtplatform.samples.nested.client.application.contact.ContactPresenter.MyProxy injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactPresenter$_annotation$$none$$(com.gwtplatform.samples.nested.client.application.contact.ContactPresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection__(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactView$Binder$_annotation$$none$$(com.gwtplatform.samples.nested.client.application.contact.ContactView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactView$_annotation$$none$$(com.gwtplatform.samples.nested.client.application.contact.ContactView injectee) {
    
  }
  
  
  /**
   * Binding for com.gwtplatform.samples.nested.client.application.contact.ContactPresenterBase$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:122)
   */
  public com.gwtplatform.samples.nested.client.application.contact.ContactPresenterBase.MyView get_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactPresenterBase$MyView$_annotation$$none$$() {
    com.gwtplatform.samples.nested.client.application.contact.ContactPresenterBase.MyView result = get_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactView$_annotation$$none$$();
    return result;
    
  }
  
  private com.gwtplatform.samples.nested.client.application.contact.ContactPresenter.MyProxy singleton_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactPresenter$MyProxy$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.nested.client.application.contact.ContactPresenter.MyProxy get_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactPresenter$MyProxy$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactPresenter$MyProxy$_annotation$$none$$ == null) {
    Object created = GWT.create(com.gwtplatform.samples.nested.client.application.contact.ContactPresenter.MyProxy.class);
    assert created instanceof com.gwtplatform.samples.nested.client.application.contact.ContactPresenter.MyProxy;
    com.gwtplatform.samples.nested.client.application.contact.ContactPresenter.MyProxy result = (com.gwtplatform.samples.nested.client.application.contact.ContactPresenter.MyProxy) created;
    
    memberInject_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactPresenter$MyProxy$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactPresenter$MyProxy$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactPresenter$MyProxy$_annotation$$none$$;
    
  }
  
  private com.gwtplatform.samples.nested.client.application.contact.ContactPresenter singleton_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactPresenter$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.nested.client.application.contact.ContactPresenter get_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactPresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactPresenter$_annotation$$none$$ == null) {
    com.gwtplatform.samples.nested.client.application.contact.ContactPresenter result = com$gwtplatform$samples$nested$client$application$contact$ContactPresenter_com$gwtplatform$samples$nested$client$application$contact$ContactPresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactPresenterBase$MyView$_annotation$$none$$(), get_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactPresenter$MyProxy$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactPresenter$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactPresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactPresenter$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.samples.nested.client.application.contact.ContactPresenter com$gwtplatform$samples$nested$client$application$contact$ContactPresenter_com$gwtplatform$samples$nested$client$application$contact$ContactPresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.gwtplatform.samples.nested.client.application.contact.ContactPresenterBase.MyView _1, com.gwtplatform.samples.nested.client.application.contact.ContactPresenter.MyProxy _2) {
    return new com.gwtplatform.samples.nested.client.application.contact.ContactPresenter(_0, _1, _2);
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.nested.client.application.contact.ContactPresenter> declared at:
   *   Implicit injection of com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.nested.client.application.contact.ContactPresenter>
   */
  public com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.nested.client.application.contact.ContactPresenter> get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$gwtplatform$samples$nested$client$application$contact$ContactPresenter$$_annotation$$none$$() {
    com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.nested.client.application.contact.ContactPresenter> result = new com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.nested.client.application.contact.ContactPresenter>() { 
        public void get(final com.google.gwt.user.client.rpc.AsyncCallback<? super com.gwtplatform.samples.nested.client.application.contact.ContactPresenter> callback) { 
          com.google.gwt.core.client.GWT.runAsync(com.gwtplatform.samples.nested.client.application.contact.ContactPresenter.class,new com.google.gwt.core.client.RunAsyncCallback() { 
            public void onSuccess() { 
              callback.onSuccess(get_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactPresenter$_annotation$$none$$());
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
   * Binding for com.gwtplatform.samples.nested.client.application.contact.ContactView$Binder declared at:
   *   Implicit GWT.create binding for com.gwtplatform.samples.nested.client.application.contact.ContactView$Binder
   */
  public com.gwtplatform.samples.nested.client.application.contact.ContactView.Binder get_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactView$Binder$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.samples.nested.client.application.contact.ContactView.Binder.class);
    assert created instanceof com.gwtplatform.samples.nested.client.application.contact.ContactView.Binder;
    com.gwtplatform.samples.nested.client.application.contact.ContactView.Binder result = (com.gwtplatform.samples.nested.client.application.contact.ContactView.Binder) created;
    
    memberInject_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private com.gwtplatform.samples.nested.client.application.contact.ContactView singleton_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactView$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.nested.client.application.contact.ContactView get_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactView$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactView$_annotation$$none$$ == null) {
    com.gwtplatform.samples.nested.client.application.contact.ContactView result = com$gwtplatform$samples$nested$client$application$contact$ContactView_com$gwtplatform$samples$nested$client$application$contact$ContactView_methodInjection(get_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactView$Binder$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactView$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactView$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.samples.nested.client.application.contact.ContactView com$gwtplatform$samples$nested$client$application$contact$ContactView_com$gwtplatform$samples$nested$client$application$contact$ContactView_methodInjection(com.gwtplatform.samples.nested.client.application.contact.ContactView.Binder _0) {
    return new com.gwtplatform.samples.nested.client.application.contact.ContactView(_0);
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
    //   Implicit GWT.create binding for com.gwtplatform.samples.nested.client.application.contact.ContactPresenter$MyProxy
    get_Key$type$com$gwtplatform$samples$nested$client$application$contact$ContactPresenter$MyProxy$_annotation$$none$$();
    
  }
  
}
