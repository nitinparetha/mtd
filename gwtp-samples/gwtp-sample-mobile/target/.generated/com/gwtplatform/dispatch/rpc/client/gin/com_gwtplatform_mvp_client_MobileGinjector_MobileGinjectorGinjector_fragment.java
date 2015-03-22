package com.gwtplatform.dispatch.rpc.client.gin;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector;

public class com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector_fragment {
  private com.gwtplatform.dispatch.rpc.shared.DispatchServiceAsync singleton_Key$type$com$gwtplatform$dispatch$rpc$shared$DispatchServiceAsync$_annotation$$none$$ = null;
  
  public com.gwtplatform.dispatch.rpc.shared.DispatchServiceAsync get_Key$type$com$gwtplatform$dispatch$rpc$shared$DispatchServiceAsync$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$dispatch$rpc$shared$DispatchServiceAsync$_annotation$$none$$ == null) {
    com.gwtplatform.dispatch.rpc.shared.DispatchServiceAsync result = com$gwtplatform$dispatch$rpc$client$gin$RpcDispatchAsyncModule_provideDispatchServiceAsync_methodInjection(new com.gwtplatform.dispatch.rpc.client.gin.RpcDispatchAsyncModule());
        singleton_Key$type$com$gwtplatform$dispatch$rpc$shared$DispatchServiceAsync$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$dispatch$rpc$shared$DispatchServiceAsync$_annotation$$none$$;
    
  }
  
  public com.gwtplatform.dispatch.rpc.shared.DispatchServiceAsync com$gwtplatform$dispatch$rpc$client$gin$RpcDispatchAsyncModule_provideDispatchServiceAsync_methodInjection(com.gwtplatform.dispatch.rpc.client.gin.RpcDispatchAsyncModule invokee) {
    return invokee.provideDispatchServiceAsync();
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector injector;
  public com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector_fragment(com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
