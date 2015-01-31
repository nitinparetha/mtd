package com.gwtplatform.samples.tab.client.application.ui.tabs;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class RoundTab_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.gwtplatform.samples.tab.client.application.ui.tabs.RoundTab_BinderImpl_GenBundle {
  private static RoundTab_BinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new RoundTab_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.gwtplatform.samples.tab.client.application.ui.tabs.RoundTab_BinderImpl_GenCss_style() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GBUBVKMBPJ{float:" + ("right")  + ";margin-left:" + ("8px")  + ";}.GBUBVKMBPJ a,.GBUBVKMBPJ a:visited,.GBUBVKMBPJ a:hover{text-decoration:" + ("none")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";color:" + ("black")  + ";}.GBUBVKMBAK{margin:" + ("0")  + ";padding:" + ("0"+ " " +"13px")  + ";}.GBUBVKMBKJ{background-color:" + ("#fcb072")  + ";}.GBUBVKMBLJ{background-color:" + ("#fcd5b6")  + ";}.GBUBVKMBMJ{font-size:") + (("0")  + ";height:" + ("1px")  + ";margin:" + ("0")  + ";padding:" + ("0")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"white")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"white")  + ";}.GBUBVKMBNJ{font-size:" + ("0")  + ";height:" + ("1px")  + ";margin:" + ("0")  + ";padding:" + ("0")  + ";border-right:" + ("2px"+ " " +"solid"+ " " +"white") ) + (";border-left:" + ("2px"+ " " +"solid"+ " " +"white")  + ";}.GBUBVKMBOJ{font-size:" + ("0")  + ";height:" + ("1px")  + ";margin:" + ("0")  + ";padding:" + ("0")  + ";border-right:" + ("4px"+ " " +"solid"+ " " +"white")  + ";border-left:" + ("4px"+ " " +"solid"+ " " +"white")  + ";}")) : ((".GBUBVKMBPJ{float:" + ("left")  + ";margin-right:" + ("8px")  + ";}.GBUBVKMBPJ a,.GBUBVKMBPJ a:visited,.GBUBVKMBPJ a:hover{text-decoration:" + ("none")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";color:" + ("black")  + ";}.GBUBVKMBAK{margin:" + ("0")  + ";padding:" + ("0"+ " " +"13px")  + ";}.GBUBVKMBKJ{background-color:" + ("#fcb072")  + ";}.GBUBVKMBLJ{background-color:" + ("#fcd5b6")  + ";}.GBUBVKMBMJ{font-size:") + (("0")  + ";height:" + ("1px")  + ";margin:" + ("0")  + ";padding:" + ("0")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"white")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"white")  + ";}.GBUBVKMBNJ{font-size:" + ("0")  + ";height:" + ("1px")  + ";margin:" + ("0")  + ";padding:" + ("0")  + ";border-left:" + ("2px"+ " " +"solid"+ " " +"white") ) + (";border-right:" + ("2px"+ " " +"solid"+ " " +"white")  + ";}.GBUBVKMBOJ{font-size:" + ("0")  + ";height:" + ("1px")  + ";margin:" + ("0")  + ";padding:" + ("0")  + ";border-left:" + ("4px"+ " " +"solid"+ " " +"white")  + ";border-right:" + ("4px"+ " " +"solid"+ " " +"white")  + ";}"));
      }
      public java.lang.String active() {
        return "GBUBVKMBKJ";
      }
      public java.lang.String inactive() {
        return "GBUBVKMBLJ";
      }
      public java.lang.String round1() {
        return "GBUBVKMBMJ";
      }
      public java.lang.String round2() {
        return "GBUBVKMBNJ";
      }
      public java.lang.String round4() {
        return "GBUBVKMBOJ";
      }
      public java.lang.String tab() {
        return "GBUBVKMBPJ";
      }
      public java.lang.String tab_inner() {
        return "GBUBVKMBAK";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.gwtplatform.samples.tab.client.application.ui.tabs.RoundTab_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.gwtplatform.samples.tab.client.application.ui.tabs.RoundTab_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.gwtplatform.samples.tab.client.application.ui.tabs.RoundTab_BinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.gwtplatform.samples.tab.client.application.ui.tabs.RoundTab_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
