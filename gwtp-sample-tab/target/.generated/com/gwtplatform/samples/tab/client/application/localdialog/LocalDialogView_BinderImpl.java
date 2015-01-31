// .ui.xml template last modified: 1422228557476
package com.gwtplatform.samples.tab.client.application.localdialog;

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

public class LocalDialogView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.PopupPanel, com.gwtplatform.samples.tab.client.application.localdialog.LocalDialogView>, com.gwtplatform.samples.tab.client.application.localdialog.LocalDialogView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("Ok")
    SafeHtml html1();
     
    @Template("<p>This is an example of a presenter-local dialog PresenterWidget. </p> <p> Try clicking tabs and navigating while the dialog is showing. It <br> should disappear and reappear when you come back. <br> Compare this to the behavior of the global dialog box you get by <br> clicking on the \"Launch global dialog\" button. </p> <p> You could make this a modal dialog if desired. However, the <br> mechanism described above ensures that your app is robust <br> even when the user navigates with the browser arrows or by <br> manually modifying the URL. </p> <span id='{0}'></span>")
    SafeHtml html2(String arg0);
     
    @Template("<b>Local dialog box example</b>")
    SafeHtml html3();
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.PopupPanel createAndBindUi(final com.gwtplatform.samples.tab.client.application.localdialog.LocalDialogView owner) {


    return new Widgets(owner).get_f_DialogBox1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.gwtplatform.samples.tab.client.application.localdialog.LocalDialogView owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.okButtonClicked((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final com.gwtplatform.samples.tab.client.application.localdialog.LocalDialogView owner) {
      this.owner = owner;
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
    }

    SafeHtml template_html1() {
      return template.html1();
    }
    SafeHtml template_html2() {
      return template.html2(get_domId0());
    }
    SafeHtml template_html3() {
      return template.html3();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.gwtplatform.samples.tab.client.application.localdialog.LocalDialogView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.gwtplatform.samples.tab.client.application.localdialog.LocalDialogView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.gwtplatform.samples.tab.client.application.localdialog.LocalDialogView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.gwtplatform.samples.tab.client.application.localdialog.LocalDialogView_BinderImpl_GenBundle) GWT.create(com.gwtplatform.samples.tab.client.application.localdialog.LocalDialogView_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for f_DialogBox1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.DialogBox get_f_DialogBox1() {
      return build_f_DialogBox1();
    }
    private com.google.gwt.user.client.ui.DialogBox build_f_DialogBox1() {
      // Creation section.
      final com.google.gwt.user.client.ui.DialogBox f_DialogBox1 = new com.google.gwt.user.client.ui.DialogBox(false, false);
      // Setup section.
      f_DialogBox1.setHTML(template_html3().asString());
      f_DialogBox1.setWidget(get_f_HTMLPanel2());

      return f_DialogBox1;
    }

    /**
     * Getter for f_HTMLPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel2() {
      return build_f_HTMLPanel2();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel(template_html2().asString());
      // Setup section.

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());

        get_domId0Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_HTMLPanel2.addAndReplaceElement(get_okButton(), get_domId0Element().get());

      return f_HTMLPanel2;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
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
     * Getter for okButton called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Button get_okButton() {
      return build_okButton();
    }
    private com.google.gwt.user.client.ui.Button build_okButton() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button okButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      okButton.setHTML(template_html1().asString());
      okButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.okButton = okButton;

      return okButton;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 3.
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
  }
}
