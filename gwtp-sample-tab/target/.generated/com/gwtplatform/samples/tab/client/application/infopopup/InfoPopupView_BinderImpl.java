// .ui.xml template last modified: 1422228557324
package com.gwtplatform.samples.tab.client.application.infopopup;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.PopupPanel;

public class InfoPopupView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.PopupPanel, com.gwtplatform.samples.tab.client.application.infopopup.InfoPopupView>, com.gwtplatform.samples.tab.client.application.infopopup.InfoPopupView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("<p class='{0}'> This is an example of an auto-hiding <br> popup PresenterWidget. </p> <p> It will automatically go away if you click <br> anywhere or navigate. </p>")
    SafeHtml html1(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.PopupPanel createAndBindUi(final com.gwtplatform.samples.tab.client.application.infopopup.InfoPopupView owner) {


    return new Widgets(owner).get_f_PopupPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.gwtplatform.samples.tab.client.application.infopopup.InfoPopupView owner;


    public Widgets(final com.gwtplatform.samples.tab.client.application.infopopup.InfoPopupView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }

    SafeHtml template_html1() {
      return template.html1("" + get_style().bold() + "");
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.gwtplatform.samples.tab.client.application.infopopup.InfoPopupView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.gwtplatform.samples.tab.client.application.infopopup.InfoPopupView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.gwtplatform.samples.tab.client.application.infopopup.InfoPopupView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.gwtplatform.samples.tab.client.application.infopopup.InfoPopupView_BinderImpl_GenBundle) GWT.create(com.gwtplatform.samples.tab.client.application.infopopup.InfoPopupView_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 2 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.gwtplatform.samples.tab.client.application.infopopup.InfoPopupView_BinderImpl_GenCss_style style;
    private com.gwtplatform.samples.tab.client.application.infopopup.InfoPopupView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private com.gwtplatform.samples.tab.client.application.infopopup.InfoPopupView_BinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for f_PopupPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.PopupPanel get_f_PopupPanel1() {
      return build_f_PopupPanel1();
    }
    private com.google.gwt.user.client.ui.PopupPanel build_f_PopupPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.PopupPanel f_PopupPanel1 = (com.google.gwt.user.client.ui.PopupPanel) GWT.create(com.google.gwt.user.client.ui.PopupPanel.class);
      // Setup section.
      f_PopupPanel1.add(get_f_HTMLPanel2());
      f_PopupPanel1.setStyleName("" + get_style().popup() + "");
      f_PopupPanel1.setAutoHideOnHistoryEventsEnabled(true);
      f_PopupPanel1.setAutoHideEnabled(true);

      return f_PopupPanel1;
    }

    /**
     * Getter for f_HTMLPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel2() {
      return build_f_HTMLPanel2();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      return f_HTMLPanel2;
    }
  }
}
