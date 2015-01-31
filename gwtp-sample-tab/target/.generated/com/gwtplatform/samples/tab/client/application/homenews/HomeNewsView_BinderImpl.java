// .ui.xml template last modified: 1422228557392
package com.gwtplatform.samples.tab.client.application.homenews;

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

public class HomeNewsView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView>, com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("<h1>News</h1> <div class='{0}'> GWTP Tabs Sample <br> <a href='https://github.com/ArcBees/GWTP'>Project Home</a> <br> <a href='https://github.com/ArcBees/GWTP-Samples/tree/master/gwtp-samples/gwtp-sample-tab'>Source</a> </div> <p>Clicking on the <b>Home</b> tab will always come back to the last tab selected. </p> <div class='{1}'> <span id='{2}'></span> </div> <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla varius malesuada mollis. Nunc elit justo, pellentesque at condimentum a, egestas eget ipsum. Sed pulvinar metus non purus sollicitudin porta. Donec est diam, auctor a feugiat ac, elementum in felis. Donec non fringilla nisi. Etiam sollicitudin sapien vitae ipsum porta dictum blandit metus consectetur. Duis libero est, consectetur in tincidunt eu, ultricies eget dui. Integer felis elit, porttitor at convallis sed, venenatis eu metus. Nam ac metus at nibh placerat interdum vel vel mauris. In lacinia tellus sed leo cursus sodales. Vivamus in purus a nunc fermentum viverra quis non mauris. Nulla nec justo tellus. Maecenas leo velit, bibendum at dapibus at, vulputate et turpis. Sed fringilla interdum libero eu facilisis. Quisque lectus odio, aliquam sed vehicula at, euismod et nunc. Praesent at lacinia tortor. </p>  <div>Example use of Messages:</div> <span id='{3}'></span> <div>Example use of Constants:</div> <span id='{4}'></span> <div>Example use of ImageResource:</div> <span id='{5}'></span> <div class='{6}'>Example use of Css Resource:</div>")
    SafeHtml html1(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onClick((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_resources();  // more than one getter call detected. Type: IMPORTED, precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1("" + get_style().links() + "", "" + get_style().confirmationLink() + "", get_domId0(), get_domId1(), get_domId2(), get_domId3(), "" + get_resources().styles().divBorder() + "");
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView_BinderImpl_GenBundle) GWT.create(com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for resources called 3 times. Type: IMPORTED. Build precedence: 1.
     */
    private com.gwtplatform.samples.tab.client.resources.AppResources resources;
    private com.gwtplatform.samples.tab.client.resources.AppResources get_resources() {
      return resources;
    }
    private com.gwtplatform.samples.tab.client.resources.AppResources build_resources() {
      // Creation section.
      resources = owner.resources;
      assert resources != null : "UiField resources with 'provided = true' was null";
      // Setup section.

      return resources;
    }

    /**
     * Getter for style called 2 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView_BinderImpl_GenCss_style style;
    private com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView_BinderImpl_GenCss_style build_style() {
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
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());

        get_domId0Element().get();
        get_domId1Element().get();
        get_domId2Element().get();
        get_domId3Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_HTMLPanel1.addAndReplaceElement(get_confirmationLink(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_orderText(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_gwtpTitle(), get_domId2Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_Image2(), get_domId3Element().get());

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
     * Getter for confirmationLink called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Anchor get_confirmationLink() {
      return build_confirmationLink();
    }
    private com.google.gwt.user.client.ui.Anchor build_confirmationLink() {
      // Creation section.
      final com.google.gwt.user.client.ui.Anchor confirmationLink = (com.google.gwt.user.client.ui.Anchor) GWT.create(com.google.gwt.user.client.ui.Anchor.class);
      // Setup section.
      confirmationLink.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.confirmationLink = confirmationLink;

      return confirmationLink;
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
     * Getter for orderText called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTML get_orderText() {
      return build_orderText();
    }
    private com.google.gwt.user.client.ui.HTML build_orderText() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML orderText = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.

      this.owner.orderText = orderText;

      return orderText;
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
     * Getter for gwtpTitle called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTML get_gwtpTitle() {
      return build_gwtpTitle();
    }
    private com.google.gwt.user.client.ui.HTML build_gwtpTitle() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML gwtpTitle = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.

      this.owner.gwtpTitle = gwtpTitle;

      return gwtpTitle;
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
     * Getter for f_Image2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Image get_f_Image2() {
      return build_f_Image2();
    }
    private com.google.gwt.user.client.ui.Image build_f_Image2() {
      // Creation section.
      final com.google.gwt.user.client.ui.Image f_Image2 = new com.google.gwt.user.client.ui.Image(get_resources().logo());
      // Setup section.
      f_Image2.setStyleName("" + get_resources().styles().logo() + "");

      return f_Image2;
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
