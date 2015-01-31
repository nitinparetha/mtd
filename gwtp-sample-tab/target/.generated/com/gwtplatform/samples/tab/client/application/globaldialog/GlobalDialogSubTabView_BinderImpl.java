// .ui.xml template last modified: 1422228557328
package com.gwtplatform.samples.tab.client.application.globaldialog;

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

public class GlobalDialogSubTabView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.gwtplatform.samples.tab.client.application.globaldialog.GlobalDialogSubTabView>, com.gwtplatform.samples.tab.client.application.globaldialog.GlobalDialogSubTabView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("Launch global dialog")
    SafeHtml html1();
     
    @Template("click here")
    SafeHtml html2();
     
    @Template("<h1>Global Dialog Sample</h1> <p>Clicking on the <b>Dialogs</b> tab will always come back to the <b>Global</b> tab. </p> <span id='{0}'></span> <p> You can <span id='{1}'></span> to see a popup panel. </p> <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla varius malesuada mollis. Nunc elit justo, pellentesque at condimentum a, egestas eget ipsum. Sed pulvinar metus non purus sollicitudin porta. Donec est diam, auctor a feugiat ac, elementum in felis. Donec non fringilla nisi. Etiam sollicitudin sapien vitae ipsum porta dictum blandit metus consectetur. Duis libero est, consectetur in tincidunt eu, ultricies eget dui. Integer felis elit, porttitor at convallis sed, venenatis eu metus. Nam ac metus at nibh placerat interdum vel vel mauris. In lacinia tellus sed leo cursus sodales. Vivamus in purus a nunc fermentum viverra quis non mauris. Nulla nec justo tellus. Maecenas leo velit, bibendum at dapibus at, vulputate et turpis. Sed fringilla interdum libero eu facilisis. Quisque lectus odio, aliquam sed vehicula at, euismod et nunc. Praesent at lacinia tortor. </p> <p>Fusce id blandit augue. Nulla sed velit augue. Vestibulum lectus orci, eleifend non posuere sed, volutpat sit amet metus. Proin at odio et tortor dictum eleifend. Donec dictum egestas sem et tempor. In commodo condimentum pretium. Curabitur congue ipsum vel eros vulputate sed interdum ipsum congue. Pellentesque elementum consectetur mollis. In sollicitudin aliquet dolor at scelerisque. Suspendisse risus leo, vestibulum non euismod a, viverra sed dolor. Nulla facilisi. Sed ut purus ac arcu porttitor feugiat bibendum vel ligula. Morbi fringilla turpis pretium tellus sollicitudin vel volutpat massa sollicitudin. Donec eleifend risus nec mauris pellentesque consectetur. Nulla ornare convallis metus, quis condimentum eros cursus ut. Pellentesque venenatis tellus non felis ullamcorper hendrerit. Praesent semper, nunc eu condimentum interdum, justo nunc semper nulla, nec consequat nisi diam sit amet magna. </p> <p>Nulla non magna id nunc volutpat tincidunt. Morbi sed velit sed elit mattis laoreet. Fusce leo massa, sollicitudin nec hendrerit et, pellentesque vitae tortor. Etiam eu lacus in felis sodales rhoncus. Nulla fermentum sodales arcu sed congue. Nunc molestie, augue et congue pharetra, urna dolor bibendum risus, a consectetur lectus diam ac purus. Nulla convallis mi sit amet elit semper vulputate. Aenean congue, velit eu dapibus molestie, lacus dui lacinia dui, id malesuada nisl turpis eget magna. Curabitur in gravida diam. Etiam viverra ullamcorper sapien et auctor. Praesent tincidunt, nisl at tincidunt imperdiet, nisi est blandit diam, id vulputate lacus nulla et tellus. Quisque ipsum mauris, sollicitudin et facilisis sit amet, placerat fringilla erat. Praesent non condimentum erat. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; </p>")
    SafeHtml html3(String arg0, String arg1);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.gwtplatform.samples.tab.client.application.globaldialog.GlobalDialogSubTabView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.gwtplatform.samples.tab.client.application.globaldialog.GlobalDialogSubTabView owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onGlobalClicked((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.MouseDownHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.MouseDownHandler() {
      public void onMouseDown(com.google.gwt.event.dom.client.MouseDownEvent event) {
        owner.onPopupLinkClicked((com.google.gwt.event.dom.client.MouseDownEvent) event);
      }
    };

    public Widgets(final com.gwtplatform.samples.tab.client.application.globaldialog.GlobalDialogSubTabView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1();
    }
    SafeHtml template_html2() {
      return template.html2();
    }
    SafeHtml template_html3() {
      return template.html3(get_domId0(), get_domId1());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.gwtplatform.samples.tab.client.application.globaldialog.GlobalDialogSubTabView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.gwtplatform.samples.tab.client.application.globaldialog.GlobalDialogSubTabView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.gwtplatform.samples.tab.client.application.globaldialog.GlobalDialogSubTabView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.gwtplatform.samples.tab.client.application.globaldialog.GlobalDialogSubTabView_BinderImpl_GenBundle) GWT.create(com.gwtplatform.samples.tab.client.application.globaldialog.GlobalDialogSubTabView_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 2 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.gwtplatform.samples.tab.client.application.globaldialog.GlobalDialogSubTabView_BinderImpl_GenCss_style style;
    private com.gwtplatform.samples.tab.client.application.globaldialog.GlobalDialogSubTabView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private com.gwtplatform.samples.tab.client.application.globaldialog.GlobalDialogSubTabView_BinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html3().asString());
      // Setup section.
      f_HTMLPanel1.addStyleName("" + get_style().panel() + "");

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());

        get_domId0Element().get();
        get_domId1Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_HTMLPanel1.addAndReplaceElement(get_globalDialog(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_popupLink(), get_domId1Element().get());

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
     * Getter for globalDialog called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Button get_globalDialog() {
      return build_globalDialog();
    }
    private com.google.gwt.user.client.ui.Button build_globalDialog() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button globalDialog = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      globalDialog.setHTML(template_html1().asString());
      globalDialog.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.globalDialog = globalDialog;

      return globalDialog;
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
     * Getter for popupLink called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Anchor get_popupLink() {
      return build_popupLink();
    }
    private com.google.gwt.user.client.ui.Anchor build_popupLink() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor popupLink = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      popupLink.setHTML(template_html2().asString());
      popupLink.setStyleName("" + get_style().anchor() + "");
      popupLink.addMouseDownHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

      this.owner.popupLink = popupLink;

      return popupLink;
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
  }
}
