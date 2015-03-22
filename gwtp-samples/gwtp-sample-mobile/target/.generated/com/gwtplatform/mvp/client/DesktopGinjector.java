package com.gwtplatform.mvp.client;

import com.google.gwt.inject.client.GinModules;

@GinModules(value={com.gwtplatform.samples.mobile.client.gin.DesktopModule.class}, properties={"gin.ginjector.modules"})
public interface DesktopGinjector extends ClientGinjector {
}
