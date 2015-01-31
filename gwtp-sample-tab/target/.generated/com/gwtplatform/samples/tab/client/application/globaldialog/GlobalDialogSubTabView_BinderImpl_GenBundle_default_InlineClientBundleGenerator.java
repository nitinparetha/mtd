package com.gwtplatform.samples.tab.client.application.globaldialog;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class GlobalDialogSubTabView_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.gwtplatform.samples.tab.client.application.globaldialog.GlobalDialogSubTabView_BinderImpl_GenBundle {
  private static GlobalDialogSubTabView_BinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new GlobalDialogSubTabView_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.gwtplatform.samples.tab.client.application.globaldialog.GlobalDialogSubTabView_BinderImpl_GenCss_style() {
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
        return (".GBUBVKMBLI{text-decoration:" + ("underline")  + ";font-weight:" + ("bold")  + ";cursor:" + ("pointer")  + ";}.GBUBVKMBMI{background-color:" + ("#fcd5b6")  + ";padding:" + ("5px")  + ";}");
      }
      public java.lang.String anchor() {
        return "GBUBVKMBLI";
      }
      public java.lang.String panel() {
        return "GBUBVKMBMI";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.gwtplatform.samples.tab.client.application.globaldialog.GlobalDialogSubTabView_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.gwtplatform.samples.tab.client.application.globaldialog.GlobalDialogSubTabView_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.gwtplatform.samples.tab.client.application.globaldialog.GlobalDialogSubTabView_BinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.gwtplatform.samples.tab.client.application.globaldialog.GlobalDialogSubTabView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
