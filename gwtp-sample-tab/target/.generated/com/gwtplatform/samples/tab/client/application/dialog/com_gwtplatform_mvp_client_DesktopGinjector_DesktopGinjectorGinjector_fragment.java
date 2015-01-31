package com.gwtplatform.samples.tab.client.application.dialog;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSamplePresenter$MyProxy$_annotation$$none$$(com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter.MyProxy injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSamplePresenter$_annotation$$none$$(com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection__(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSampleView$Binder$_annotation$$none$$(com.gwtplatform.samples.tab.client.application.dialog.DialogSampleView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSampleView$_annotation$$none$$(com.gwtplatform.samples.tab.client.application.dialog.DialogSampleView injectee) {
    
  }
  
  
  /**
   * Binding for com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:122)
   */
  public com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter.MyView get_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSamplePresenter$MyView$_annotation$$none$$() {
    com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter.MyView result = get_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSampleView$_annotation$$none$$();
    return result;
    
  }
  
  private com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter.MyProxy singleton_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSamplePresenter$MyProxy$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter.MyProxy get_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSamplePresenter$MyProxy$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSamplePresenter$MyProxy$_annotation$$none$$ == null) {
    Object created = GWT.create(com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter.MyProxy.class);
    assert created instanceof com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter.MyProxy;
    com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter.MyProxy result = (com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter.MyProxy) created;
    
    memberInject_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSamplePresenter$MyProxy$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSamplePresenter$MyProxy$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSamplePresenter$MyProxy$_annotation$$none$$;
    
  }
  
  private com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter singleton_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSamplePresenter$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter get_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSamplePresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSamplePresenter$_annotation$$none$$ == null) {
    com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter result = com$gwtplatform$samples$tab$client$application$dialog$DialogSamplePresenter_com$gwtplatform$samples$tab$client$application$dialog$DialogSamplePresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSamplePresenter$MyView$_annotation$$none$$(), get_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSamplePresenter$MyProxy$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSamplePresenter$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSamplePresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSamplePresenter$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter com$gwtplatform$samples$tab$client$application$dialog$DialogSamplePresenter_com$gwtplatform$samples$tab$client$application$dialog$DialogSamplePresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter.MyView _1, com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter.MyProxy _2) {
    return new com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter(_0, _1, _2);
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter> declared at:
   *   Implicit injection of com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter>
   */
  public com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter> get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$gwtplatform$samples$tab$client$application$dialog$DialogSamplePresenter$$_annotation$$none$$() {
    com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter> result = new com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter>() { 
        public void get(final com.google.gwt.user.client.rpc.AsyncCallback<? super com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter> callback) { 
          com.google.gwt.core.client.GWT.runAsync(com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter.class,new com.google.gwt.core.client.RunAsyncCallback() { 
            public void onSuccess() { 
              callback.onSuccess(get_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSamplePresenter$_annotation$$none$$());
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
   * Binding for com.gwtplatform.samples.tab.client.application.dialog.DialogSampleView$Binder declared at:
   *   Implicit GWT.create binding for com.gwtplatform.samples.tab.client.application.dialog.DialogSampleView$Binder
   */
  public com.gwtplatform.samples.tab.client.application.dialog.DialogSampleView.Binder get_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSampleView$Binder$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.samples.tab.client.application.dialog.DialogSampleView.Binder.class);
    assert created instanceof com.gwtplatform.samples.tab.client.application.dialog.DialogSampleView.Binder;
    com.gwtplatform.samples.tab.client.application.dialog.DialogSampleView.Binder result = (com.gwtplatform.samples.tab.client.application.dialog.DialogSampleView.Binder) created;
    
    memberInject_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSampleView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private com.gwtplatform.samples.tab.client.application.dialog.DialogSampleView singleton_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSampleView$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.tab.client.application.dialog.DialogSampleView get_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSampleView$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSampleView$_annotation$$none$$ == null) {
    com.gwtplatform.samples.tab.client.application.dialog.DialogSampleView result = com$gwtplatform$samples$tab$client$application$dialog$DialogSampleView_com$gwtplatform$samples$tab$client$application$dialog$DialogSampleView_methodInjection(get_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSampleView$Binder$_annotation$$none$$(), injector.getFragment_com_gwtplatform_samples_tab_client_application_ui_tabs().get_Key$type$com$gwtplatform$samples$tab$client$application$ui$tabs$SimpleTabPanel$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSampleView$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSampleView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSampleView$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.samples.tab.client.application.dialog.DialogSampleView com$gwtplatform$samples$tab$client$application$dialog$DialogSampleView_com$gwtplatform$samples$tab$client$application$dialog$DialogSampleView_methodInjection(com.gwtplatform.samples.tab.client.application.dialog.DialogSampleView.Binder _0, com.gwtplatform.samples.tab.client.application.ui.tabs.SimpleTabPanel _1) {
    return new com.gwtplatform.samples.tab.client.application.dialog.DialogSampleView(_0, _1);
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
    //   Implicit GWT.create binding for com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter$MyProxy
    get_Key$type$com$gwtplatform$samples$tab$client$application$dialog$DialogSamplePresenter$MyProxy$_annotation$$none$$();
    
  }
  
}
