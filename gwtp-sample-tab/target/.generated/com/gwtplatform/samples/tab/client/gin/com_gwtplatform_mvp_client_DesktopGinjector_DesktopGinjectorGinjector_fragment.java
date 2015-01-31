package com.gwtplatform.samples.tab.client.gin;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwtplatform$samples$tab$client$gin$ResourceLoader$_annotation$$none$$(com.gwtplatform.samples.tab.client.gin.ResourceLoader injectee) {
    
  }
  
  private com.gwtplatform.samples.tab.client.gin.ResourceLoader singleton_Key$type$com$gwtplatform$samples$tab$client$gin$ResourceLoader$_annotation$$none$$ = null;
  
  public com.gwtplatform.samples.tab.client.gin.ResourceLoader get_Key$type$com$gwtplatform$samples$tab$client$gin$ResourceLoader$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$samples$tab$client$gin$ResourceLoader$_annotation$$none$$ == null) {
    com.gwtplatform.samples.tab.client.gin.ResourceLoader result = com$gwtplatform$samples$tab$client$gin$ResourceLoader_com$gwtplatform$samples$tab$client$gin$ResourceLoader_methodInjection(injector.getFragment_com_gwtplatform_samples_tab_client_resources().get_Key$type$com$gwtplatform$samples$tab$client$resources$AppResources$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$samples$tab$client$gin$ResourceLoader$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwtplatform$samples$tab$client$gin$ResourceLoader$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$samples$tab$client$gin$ResourceLoader$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.samples.tab.client.gin.ResourceLoader com$gwtplatform$samples$tab$client$gin$ResourceLoader_com$gwtplatform$samples$tab$client$gin$ResourceLoader_methodInjection(com.gwtplatform.samples.tab.client.resources.AppResources _0) {
    return new com.gwtplatform.samples.tab.client.gin.ResourceLoader(_0);
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
    //   Implicit binding for com.gwtplatform.samples.tab.client.gin.ResourceLoader
    get_Key$type$com$gwtplatform$samples$tab$client$gin$ResourceLoader$_annotation$$none$$();
    
  }
  
}
