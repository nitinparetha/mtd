// .ui.xml template last modified: 1422228452014
package com.gwtplatform.samples.nested.client.application.ui;

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
import com.google.gwt.user.client.ui.Widget;

public class MainMenu_MainMenuUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.gwtplatform.samples.nested.client.application.ui.MainMenu>, com.gwtplatform.samples.nested.client.application.ui.MainMenu.MainMenuUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("Home")
    SafeHtml html1();
     
    @Template("About Us")
    SafeHtml html2();
     
    @Template("Contact")
    SafeHtml html3();
     
    @Template("<span id='{0}'></span> | <span id='{1}'></span> | <span id='{2}'></span>")
    SafeHtml html4(String arg0, String arg1, String arg2);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.gwtplatform.samples.nested.client.application.ui.MainMenu owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.gwtplatform.samples.nested.client.application.ui.MainMenu owner;


    public Widgets(final com.gwtplatform.samples.nested.client.application.ui.MainMenu owner) {
      this.owner = owner;
      build_nameTokens();  // more than one getter call detected. Type: IMPORTED, precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1();
    }
    SafeHtml template_html2() {
      return template.html2();
    }
    SafeHtml template_html3() {
      return template.html3();
    }
    SafeHtml template_html4() {
      return template.html4(get_domId0(), get_domId1(), get_domId2());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.gwtplatform.samples.nested.client.application.ui.MainMenu_MainMenuUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.gwtplatform.samples.nested.client.application.ui.MainMenu_MainMenuUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.gwtplatform.samples.nested.client.application.ui.MainMenu_MainMenuUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.gwtplatform.samples.nested.client.application.ui.MainMenu_MainMenuUiBinderImpl_GenBundle) GWT.create(com.gwtplatform.samples.nested.client.application.ui.MainMenu_MainMenuUiBinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for nameTokens called 3 times. Type: IMPORTED. Build precedence: 1.
     */
    private com.gwtplatform.samples.nested.client.place.NameTokens nameTokens;
    private com.gwtplatform.samples.nested.client.place.NameTokens get_nameTokens() {
      return nameTokens;
    }
    private com.gwtplatform.samples.nested.client.place.NameTokens build_nameTokens() {
      // Creation section.
      nameTokens = (com.gwtplatform.samples.nested.client.place.NameTokens) GWT.create(com.gwtplatform.samples.nested.client.place.NameTokens.class);
      // Setup section.

      return nameTokens;
    }

    /**
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html4().asString());
      // Setup section.

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());

        get_domId0Element().get();
        get_domId1Element().get();
        get_domId2Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineHyperlink2(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineHyperlink3(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineHyperlink4(), get_domId2Element().get());

      return f_HTMLPanel1;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId0;
    private java.lang.String get_domId0() {
      return domId0;
    }
    private java.lang.String build_domId0() {
      // Creation section.
      domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId0;
    }

    /**
     * Getter for f_InlineHyperlink2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.InlineHyperlink get_f_InlineHyperlink2() {
      return build_f_InlineHyperlink2();
    }
    private com.google.gwt.user.client.ui.InlineHyperlink build_f_InlineHyperlink2() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineHyperlink f_InlineHyperlink2 = (com.google.gwt.user.client.ui.InlineHyperlink) GWT.create(com.google.gwt.user.client.ui.InlineHyperlink.class);
      // Setup section.
      f_InlineHyperlink2.setHTML(template_html1().asString());
      f_InlineHyperlink2.setTargetHistoryToken("" + get_nameTokens().getHomePage() + "");

      return f_InlineHyperlink2;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId0Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId0Element() {
      return domId0Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId0Element() {
      // Creation section.
      domId0Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId0());
      // Setup section.

      return domId0Element;
    }

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId1;
    private java.lang.String get_domId1() {
      return domId1;
    }
    private java.lang.String build_domId1() {
      // Creation section.
      domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId1;
    }

    /**
     * Getter for f_InlineHyperlink3 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.InlineHyperlink get_f_InlineHyperlink3() {
      return build_f_InlineHyperlink3();
    }
    private com.google.gwt.user.client.ui.InlineHyperlink build_f_InlineHyperlink3() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineHyperlink f_InlineHyperlink3 = (com.google.gwt.user.client.ui.InlineHyperlink) GWT.create(com.google.gwt.user.client.ui.InlineHyperlink.class);
      // Setup section.
      f_InlineHyperlink3.setHTML(template_html2().asString());
      f_InlineHyperlink3.setTargetHistoryToken("" + get_nameTokens().getAboutUsePage() + "");

      return f_InlineHyperlink3;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId1Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId1Element() {
      return domId1Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId1Element() {
      // Creation section.
      domId1Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId1());
      // Setup section.

      return domId1Element;
    }

    /**
     * Getter for domId2 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId2;
    private java.lang.String get_domId2() {
      return domId2;
    }
    private java.lang.String build_domId2() {
      // Creation section.
      domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId2;
    }

    /**
     * Getter for f_InlineHyperlink4 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.InlineHyperlink get_f_InlineHyperlink4() {
      return build_f_InlineHyperlink4();
    }
    private com.google.gwt.user.client.ui.InlineHyperlink build_f_InlineHyperlink4() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineHyperlink f_InlineHyperlink4 = (com.google.gwt.user.client.ui.InlineHyperlink) GWT.create(com.google.gwt.user.client.ui.InlineHyperlink.class);
      // Setup section.
      f_InlineHyperlink4.setHTML(template_html3().asString());
      f_InlineHyperlink4.setTargetHistoryToken("" + get_nameTokens().getContactPage() + "");

      return f_InlineHyperlink4;
    }

    /**
     * Getter for domId2Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId2Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId2Element() {
      return domId2Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId2Element() {
      // Creation section.
      domId2Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId2());
      // Setup section.

      return domId2Element;
    }
  }
}
