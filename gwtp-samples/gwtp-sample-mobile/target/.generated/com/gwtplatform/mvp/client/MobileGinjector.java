package com.gwtplatform.mvp.client;

import com.google.gwt.inject.client.GinModules;

@GinModules(value={com.gwtplatform.samples.mobile.client.gin.MobileModule.class}, properties={"gin.ginjector.modules"})
public interface MobileGinjector extends ClientGinjector {
}
