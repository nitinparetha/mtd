package com.gwtplatform.samples.tab.client.security;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwtplatform$samples$tab$client$security$CurrentUser$_annotation$$none$$(com.gwtplatform.samples.tab.client.security.CurrentUser injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$samples$tab$client$security$IsAdminGatekeeper$_annotation$$none$$(com.gwtplatform.samples.tab.client.security.IsAdminGatekeeper injectee) {
    
  }
  
  private com.gwtplatform.samples.tab.client.security.CurrentUser singleton_Key$type$com$gwtplatform$samples$tab$client$security$CurrentUser$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.tab.client.security.CurrentUser get_Key$type$com$gwtplatform$samples$tab$client$security$CurrentUser$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$tab$client$security$CurrentUser$_annotation$$none$$ == null) {
    com.gwtplatform.samples.tab.client.security.CurrentUser result = com$gwtplatform$samples$tab$client$security$CurrentUser_com$gwtplatform$samples$tab$client$security$CurrentUser_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$samples$tab$client$security$CurrentUser$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$tab$client$security$CurrentUser$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$tab$client$security$CurrentUser$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.samples.tab.client.security.CurrentUser com$gwtplatform$samples$tab$client$security$CurrentUser_com$gwtplatform$samples$tab$client$security$CurrentUser_methodInjection(com.google.web.bindery.event.shared.EventBus _0) {
    return new com.gwtplatform.samples.tab.client.security.CurrentUser(_0);
  }
  
  private com.gwtplatform.samples.tab.client.security.IsAdminGatekeeper singleton_Key$type$com$gwtplatform$samples$tab$client$security$IsAdminGatekeeper$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.tab.client.security.IsAdminGatekeeper get_Key$type$com$gwtplatform$samples$tab$client$security$IsAdminGatekeeper$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$tab$client$security$IsAdminGatekeeper$_annotation$$none$$ == null) {
    com.gwtplatform.samples.tab.client.security.IsAdminGatekeeper result = com$gwtplatform$samples$tab$client$security$IsAdminGatekeeper_com$gwtplatform$samples$tab$client$security$IsAdminGatekeeper_methodInjection(get_Key$type$com$gwtplatform$samples$tab$client$security$CurrentUser$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$samples$tab$client$security$IsAdminGatekeeper$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$tab$client$security$IsAdminGatekeeper$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$tab$client$security$IsAdminGatekeeper$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.samples.tab.client.security.IsAdminGatekeeper com$gwtplatform$samples$tab$client$security$IsAdminGatekeeper_com$gwtplatform$samples$tab$client$security$IsAdminGatekeeper_methodInjection(com.gwtplatform.samples.tab.client.security.CurrentUser _0) {
    return new com.gwtplatform.samples.tab.client.security.IsAdminGatekeeper(_0);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector;
  public com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment(com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
