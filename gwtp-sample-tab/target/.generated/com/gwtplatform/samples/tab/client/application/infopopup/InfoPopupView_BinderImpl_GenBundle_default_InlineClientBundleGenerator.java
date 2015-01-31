package com.gwtplatform.samples.tab.client.application.infopopup;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class InfoPopupView_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.gwtplatform.samples.tab.client.application.infopopup.InfoPopupView_BinderImpl_GenBundle {
  private static InfoPopupView_BinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new InfoPopupView_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.gwtplatform.samples.tab.client.application.infopopup.InfoPopupView_BinderImpl_GenCss_style() {
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
        return (".GBUBVKMBAJ{background-color:" + ("aqua")  + ";border:" + ("3px"+ " " +"double"+ " " +"black")  + ";padding:" + ("0"+ " " +"15px")  + ";}.GBUBVKMBPI{font-weight:" + ("bold")  + ";}");
      }
      public java.lang.String bold() {
        return "GBUBVKMBPI";
      }
      public java.lang.String popup() {
        return "GBUBVKMBAJ";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.gwtplatform.samples.tab.client.application.infopopup.InfoPopupView_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.gwtplatform.samples.tab.client.application.infopopup.InfoPopupView_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.gwtplatform.samples.tab.client.application.infopopup.InfoPopupView_BinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.gwtplatform.samples.tab.client.application.infopopup.InfoPopupView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
