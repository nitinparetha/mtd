package com.gwtplatform.dispatch.rpc.shared;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector;

public class com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector_fragment {
  private com.gwtplatform.dispatch.rpc.shared.DispatchAsync singleton_Key$type$com$gwtplatform$dispatch$rpc$shared$DispatchAsync$_annotation$$none$$ = null;
  
  public com.gwtplatform.dispatch.rpc.shared.DispatchAsync get_Key$type$com$gwtplatform$dispatch$rpc$shared$DispatchAsync$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$dispatch$rpc$shared$DispatchAsync$_annotation$$none$$ == null) {
    com.gwtplatform.dispatch.rpc.shared.DispatchAsync result = injector.getFragment_com_gwtplatform_dispatch_rpc_client().get_Key$type$com$gwtplatform$dispatch$rpc$client$RpcDispatchAsync$_annotation$$none$$();
        singleton_Key$type$com$gwtplatform$dispatch$rpc$shared$DispatchAsync$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$dispatch$rpc$shared$DispatchAsync$_annotation$$none$$;
    
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector injector;
  public com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector_fragment(com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
