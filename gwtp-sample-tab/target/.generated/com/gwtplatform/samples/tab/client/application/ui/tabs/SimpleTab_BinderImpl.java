// .ui.xml template last modified: 1422228557454
package com.gwtplatform.samples.tab.client.application.ui.tabs;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class SimpleTab_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.gwtplatform.samples.tab.client.application.ui.tabs.SimpleTab>, com.gwtplatform.samples.tab.client.application.ui.tabs.SimpleTab.Binder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.gwtplatform.samples.tab.client.application.ui.tabs.SimpleTab owner) {


    return new Widgets(owner).get_hyperlink();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.gwtplatform.samples.tab.client.application.ui.tabs.SimpleTab owner;


    public Widgets(final com.gwtplatform.samples.tab.client.application.ui.tabs.SimpleTab owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.gwtplatform.samples.tab.client.application.ui.tabs.SimpleTab_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.gwtplatform.samples.tab.client.application.ui.tabs.SimpleTab_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.gwtplatform.samples.tab.client.application.ui.tabs.SimpleTab_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.gwtplatform.samples.tab.client.application.ui.tabs.SimpleTab_BinderImpl_GenBundle) GWT.create(com.gwtplatform.samples.tab.client.application.ui.tabs.SimpleTab_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 2 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.gwtplatform.samples.tab.client.application.ui.tabs.SimpleTab_BinderImpl_GenCss_style style;
    private com.gwtplatform.samples.tab.client.application.ui.tabs.SimpleTab_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private com.gwtplatform.samples.tab.client.application.ui.tabs.SimpleTab_BinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      this.owner.style = style;

      return style;
    }

    /**
     * Getter for hyperlink called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.Hyperlink get_hyperlink() {
      return build_hyperlink();
    }
    private com.google.gwt.user.client.ui.Hyperlink build_hyperlink() {
      // Creation section.
      final com.google.gwt.user.client.ui.Hyperlink hyperlink = (com.google.gwt.user.client.ui.Hyperlink) GWT.create(com.google.gwt.user.client.ui.Hyperlink.class);
      // Setup section.
      hyperlink.addStyleName("" + get_style().tab() + "");
      hyperlink.addStyleName("" + get_style().inactive() + "");

      this.owner.hyperlink = hyperlink;

      return hyperlink;
    }
  }
}
