package com.gwtplatform.samples.tab.client.application.settings;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsPresenter$MyProxy$_annotation$$none$$(com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter.MyProxy injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsPresenter$_annotation$$none$$(com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection___________(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsView$Binder$_annotation$$none$$(com.gwtplatform.samples.tab.client.application.settings.SettingsView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsView$_annotation$$none$$(com.gwtplatform.samples.tab.client.application.settings.SettingsView injectee) {
    
  }
  
  
  /**
   * Binding for com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:122)
   */
  public com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter.MyView get_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsPresenter$MyView$_annotation$$none$$() {
    com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter.MyView result = get_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsView$_annotation$$none$$();
    return result;
    
  }
  
  private com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter.MyProxy singleton_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsPresenter$MyProxy$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter.MyProxy get_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsPresenter$MyProxy$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsPresenter$MyProxy$_annotation$$none$$ == null) {
    Object created = GWT.create(com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter.MyProxy.class);
    assert created instanceof com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter.MyProxy;
    com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter.MyProxy result = (com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter.MyProxy) created;
    
    memberInject_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsPresenter$MyProxy$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsPresenter$MyProxy$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsPresenter$MyProxy$_annotation$$none$$;
    
  }
  
  private com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter singleton_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsPresenter$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter get_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsPresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsPresenter$_annotation$$none$$ == null) {
    com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter result = com$gwtplatform$samples$tab$client$application$settings$SettingsPresenter_com$gwtplatform$samples$tab$client$application$settings$SettingsPresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsPresenter$MyView$_annotation$$none$$(), get_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsPresenter$MyProxy$_annotation$$none$$(), injector.getFragment_com_gwtplatform_samples_tab_client_security().get_Key$type$com$gwtplatform$samples$tab$client$security$CurrentUser$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsPresenter$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsPresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsPresenter$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter com$gwtplatform$samples$tab$client$application$settings$SettingsPresenter_com$gwtplatform$samples$tab$client$application$settings$SettingsPresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter.MyView _1, com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter.MyProxy _2, com.gwtplatform.samples.tab.client.security.CurrentUser _3) {
    return new com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter(_0, _1, _2, _3);
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter> declared at:
   *   Implicit injection of com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter>
   */
  public com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter> get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$gwtplatform$samples$tab$client$application$settings$SettingsPresenter$$_annotation$$none$$() {
    com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter> result = new com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter>() { 
        public void get(final com.google.gwt.user.client.rpc.AsyncCallback<? super com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter> callback) { 
          com.google.gwt.core.client.GWT.runAsync(com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter.class,new com.google.gwt.core.client.RunAsyncCallback() { 
            public void onSuccess() { 
              callback.onSuccess(get_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsPresenter$_annotation$$none$$());
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
   * Binding for com.gwtplatform.samples.tab.client.application.settings.SettingsView$Binder declared at:
   *   Implicit GWT.create binding for com.gwtplatform.samples.tab.client.application.settings.SettingsView$Binder
   */
  public com.gwtplatform.samples.tab.client.application.settings.SettingsView.Binder get_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsView$Binder$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.samples.tab.client.application.settings.SettingsView.Binder.class);
    assert created instanceof com.gwtplatform.samples.tab.client.application.settings.SettingsView.Binder;
    com.gwtplatform.samples.tab.client.application.settings.SettingsView.Binder result = (com.gwtplatform.samples.tab.client.application.settings.SettingsView.Binder) created;
    
    memberInject_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private com.gwtplatform.samples.tab.client.application.settings.SettingsView singleton_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsView$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.tab.client.application.settings.SettingsView get_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsView$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsView$_annotation$$none$$ == null) {
    com.gwtplatform.samples.tab.client.application.settings.SettingsView result = com$gwtplatform$samples$tab$client$application$settings$SettingsView_com$gwtplatform$samples$tab$client$application$settings$SettingsView_methodInjection(get_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsView$Binder$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsView$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsView$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.samples.tab.client.application.settings.SettingsView com$gwtplatform$samples$tab$client$application$settings$SettingsView_com$gwtplatform$samples$tab$client$application$settings$SettingsView_methodInjection(com.gwtplatform.samples.tab.client.application.settings.SettingsView.Binder _0) {
    return new com.gwtplatform.samples.tab.client.application.settings.SettingsView(_0);
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
    //   Implicit GWT.create binding for com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter$MyProxy
    get_Key$type$com$gwtplatform$samples$tab$client$application$settings$SettingsPresenter$MyProxy$_annotation$$none$$();
    
  }
  
}
