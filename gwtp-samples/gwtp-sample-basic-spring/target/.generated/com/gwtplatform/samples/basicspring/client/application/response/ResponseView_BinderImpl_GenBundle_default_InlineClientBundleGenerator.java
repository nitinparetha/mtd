package com.gwtplatform.samples.basicspring.client.application.response;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ResponseView_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.gwtplatform.samples.basicspring.client.application.response.ResponseView_BinderImpl_GenBundle {
  private static ResponseView_BinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new ResponseView_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.gwtplatform.samples.basicspring.client.application.response.ResponseView_BinderImpl_GenCss_style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GBP4CD0BJI{width:" + ("500px")  + ";margin-right:" + ("auto")  + ";margin-left:" + ("auto")  + ";}.GBP4CD0BII{font-weight:" + ("bold")  + ";}")) : ((".GBP4CD0BJI{width:" + ("500px")  + ";margin-left:" + ("auto")  + ";margin-right:" + ("auto")  + ";}.GBP4CD0BII{font-weight:" + ("bold")  + ";}"));
      }
      public java.lang.String label() {
        return "GBP4CD0BII";
      }
      public java.lang.String root() {
        return "GBP4CD0BJI";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.gwtplatform.samples.basicspring.client.application.response.ResponseView_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.gwtplatform.samples.basicspring.client.application.response.ResponseView_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.gwtplatform.samples.basicspring.client.application.response.ResponseView_BinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.gwtplatform.samples.basicspring.client.application.response.ResponseView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}