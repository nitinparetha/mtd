// .ui.xml template last modified: 1422228452017
package com.gwtplatform.samples.nested.client.application;

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

public class ApplicationView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.gwtplatform.samples.nested.client.application.ApplicationView>, com.gwtplatform.samples.nested.client.application.ApplicationView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("<div id='{0}' style='position:absolute; top:0; left:0; background-color:yellow;'> Loading... </div> <span id='{1}'></span> <span id='{2}'></span> <span id='{3}'></span>")
    SafeHtml html1(String arg0, String arg1, String arg2, String arg3);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.gwtplatform.samples.nested.client.application.ApplicationView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.gwtplatform.samples.nested.client.application.ApplicationView owner;


    public Widgets(final com.gwtplatform.samples.nested.client.application.ApplicationView owner) {
      this.owner = owner;
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), get_domId1(), get_domId2(), get_domId3());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.gwtplatform.samples.nested.client.application.ApplicationView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.gwtplatform.samples.nested.client.application.ApplicationView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.gwtplatform.samples.nested.client.application.ApplicationView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.gwtplatform.samples.nested.client.application.ApplicationView_BinderImpl_GenBundle) GWT.create(com.gwtplatform.samples.nested.client.application.ApplicationView_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());

        get_loadingMessage();
        get_domId1Element().get();
        get_domId2Element().get();
        get_domId3Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_HTMLPanel1.addAndReplaceElement(get_f_MainMenu2(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_mainContentPanel(), get_domId2Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_MainMenu3(), get_domId3Element().get());

      return f_HTMLPanel1;
    }

    /**
     * Getter for loadingMessage called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.dom.client.DivElement get_loadingMessage() {
      return build_loadingMessage();
    }
    private com.google.gwt.dom.client.DivElement build_loadingMessage() {
      // Creation section.
      final com.google.gwt.dom.client.DivElement loadingMessage = new com.google.gwt.uibinder.client.LazyDomElement(get_domId0()).get().cast();
      // Setup section.

      this.owner.loadingMessage = loadingMessage;

      return loadingMessage;
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
     * Getter for f_MainMenu2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.gwtplatform.samples.nested.client.application.ui.MainMenu get_f_MainMenu2() {
      return build_f_MainMenu2();
    }
    private com.gwtplatform.samples.nested.client.application.ui.MainMenu build_f_MainMenu2() {
      // Creation section.
      final com.gwtplatform.samples.nested.client.application.ui.MainMenu f_MainMenu2 = (com.gwtplatform.samples.nested.client.application.ui.MainMenu) GWT.create(com.gwtplatform.samples.nested.client.application.ui.MainMenu.class);
      // Setup section.

      return f_MainMenu2;
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
     * Getter for mainContentPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.SimplePanel get_mainContentPanel() {
      return build_mainContentPanel();
    }
    private com.google.gwt.user.client.ui.SimplePanel build_mainContentPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.SimplePanel mainContentPanel = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
      // Setup section.

      this.owner.mainContentPanel = mainContentPanel;

      return mainContentPanel;
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

    /**
     * Getter for domId3 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId3;
    private java.lang.String get_domId3() {
      return domId3;
    }
    private java.lang.String build_domId3() {
      // Creation section.
      domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId3;
    }

    /**
     * Getter for f_MainMenu3 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.gwtplatform.samples.nested.client.application.ui.MainMenu get_f_MainMenu3() {
      return build_f_MainMenu3();
    }
    private com.gwtplatform.samples.nested.client.application.ui.MainMenu build_f_MainMenu3() {
      // Creation section.
      final com.gwtplatform.samples.nested.client.application.ui.MainMenu f_MainMenu3 = (com.gwtplatform.samples.nested.client.application.ui.MainMenu) GWT.create(com.gwtplatform.samples.nested.client.application.ui.MainMenu.class);
      // Setup section.

      return f_MainMenu3;
    }

    /**
     * Getter for domId3Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId3Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId3Element() {
      return domId3Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId3Element() {
      // Creation section.
      domId3Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId3());
      // Setup section.

      return domId3Element;
    }
  }
}
