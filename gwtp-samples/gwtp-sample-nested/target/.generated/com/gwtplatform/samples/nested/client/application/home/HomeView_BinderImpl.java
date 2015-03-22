// .ui.xml template last modified: 1422228451961
package com.gwtplatform.samples.nested.client.application.home;

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

public class HomeView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.gwtplatform.samples.nested.client.application.home.HomeView>, com.gwtplatform.samples.nested.client.application.home.HomeView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("<h1>Home page</h1> <div class='{0}'> GWTP Nested Sample <br> <a href='https://github.com/ArcBees/GWTP'>Project Home</a> <br> <a href='https://github.com/ArcBees/GWTP-Samples/tree/master/gwtp-samples/gwtp-sample-nested'>Source</a> </div> <p>This is the home page for this demonstration. You'll always get this page as the default when you come in this showcase. </p> <p>Also try using back of your browser after being in another page !</p> <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla varius malesuada mollis. Nunc elit justo, pellentesque at condimentum a, egestas eget ipsum. Sed pulvinar metus non purus sollicitudin porta. Donec est diam, auctor a feugiat ac, elementum in felis. Donec non fringilla nisi. Etiam sollicitudin sapien vitae ipsum porta dictum blandit metus consectetur. Duis libero est, consectetur in tincidunt eu, ultricies eget dui. Integer felis elit, porttitor at convallis sed, venenatis eu metus. Nam ac metus at nibh placerat interdum vel vel mauris. In lacinia tellus sed leo cursus sodales. Vivamus in purus a nunc fermentum viverra quis non mauris. Nulla nec justo tellus. Maecenas leo velit, bibendum at dapibus at, vulputate et turpis. Sed fringilla interdum libero eu facilisis. Quisque lectus odio, aliquam sed vehicula at, euismod et nunc. Praesent at lacinia tortor. </p> <p>Fusce id blandit augue. Nulla sed velit augue. Vestibulum lectus orci, eleifend non posuere sed, volutpat sit amet metus. Proin at odio et tortor dictum eleifend. Donec dictum egestas sem et tempor. In commodo condimentum pretium. Curabitur congue ipsum vel eros vulputate sed interdum ipsum congue. Pellentesque elementum consectetur mollis. In sollicitudin aliquet dolor at scelerisque. Suspendisse risus leo, vestibulum non euismod a, viverra sed dolor. Nulla facilisi. Sed ut purus ac arcu porttitor feugiat bibendum vel ligula. Morbi fringilla turpis pretium tellus sollicitudin vel volutpat massa sollicitudin. Donec eleifend risus nec mauris pellentesque consectetur. Nulla ornare convallis metus, quis condimentum eros cursus ut. Pellentesque venenatis tellus non felis ullamcorper hendrerit. Praesent semper, nunc eu condimentum interdum, justo nunc semper nulla, nec consequat nisi diam sit amet magna. </p> <p>Nulla non magna id nunc volutpat tincidunt. Morbi sed velit sed elit mattis laoreet. Fusce leo massa, sollicitudin nec hendrerit et, pellentesque vitae tortor. Etiam eu lacus in felis sodales rhoncus. Nulla fermentum sodales arcu sed congue. Nunc molestie, augue et congue pharetra, urna dolor bibendum risus, a consectetur lectus diam ac purus. Nulla convallis mi sit amet elit semper vulputate. Aenean congue, velit eu dapibus molestie, lacus dui lacinia dui, id malesuada nisl turpis eget magna. Curabitur in gravida diam. Etiam viverra ullamcorper sapien et auctor. Praesent tincidunt, nisl at tincidunt imperdiet, nisi est blandit diam, id vulputate lacus nulla et tellus. Quisque ipsum mauris, sollicitudin et facilisis sit amet, placerat fringilla erat. Praesent non condimentum erat. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; </p>")
    SafeHtml html1(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.gwtplatform.samples.nested.client.application.home.HomeView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.gwtplatform.samples.nested.client.application.home.HomeView owner;


    public Widgets(final com.gwtplatform.samples.nested.client.application.home.HomeView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }

    SafeHtml template_html1() {
      return template.html1("" + get_style().links() + "");
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.gwtplatform.samples.nested.client.application.home.HomeView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.gwtplatform.samples.nested.client.application.home.HomeView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.gwtplatform.samples.nested.client.application.home.HomeView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.gwtplatform.samples.nested.client.application.home.HomeView_BinderImpl_GenBundle) GWT.create(com.gwtplatform.samples.nested.client.application.home.HomeView_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 1 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.gwtplatform.samples.nested.client.application.home.HomeView_BinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.gwtplatform.samples.nested.client.application.home.HomeView_BinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.gwtplatform.samples.nested.client.application.home.HomeView_BinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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

      return f_HTMLPanel1;
    }
  }
}
