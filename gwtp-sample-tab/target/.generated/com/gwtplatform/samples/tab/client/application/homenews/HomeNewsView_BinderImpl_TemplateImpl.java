package com.gwtplatform.samples.tab.client.application.homenews;

public class HomeNewsView_BinderImpl_TemplateImpl implements com.gwtplatform.samples.tab.client.application.homenews.HomeNewsView_BinderImpl.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml html1(java.lang.String arg0,java.lang.String arg1,java.lang.String arg2,java.lang.String arg3,java.lang.String arg4,java.lang.String arg5,java.lang.String arg6) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<h1>News</h1> <div class='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
    sb.append("'> GWTP Tabs Sample <br> <a href='https://github.com/ArcBees/GWTP'>Project Home</a> <br> <a href='https://github.com/ArcBees/GWTP-Samples/tree/master/gwtp-samples/gwtp-sample-tab'>Source</a> </div> <p>Clicking on the <b>Home</b> tab will always come back to the last tab selected. </p> <div class='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1));
    sb.append("'> <span id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg2));
    sb.append("'></span> </div> <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla varius malesuada mollis. Nunc elit justo, pellentesque at condimentum a, egestas eget ipsum. Sed pulvinar metus non purus sollicitudin porta. Donec est diam, auctor a feugiat ac, elementum in felis. Donec non fringilla nisi. Etiam sollicitudin sapien vitae ipsum porta dictum blandit metus consectetur. Duis libero est, consectetur in tincidunt eu, ultricies eget dui. Integer felis elit, porttitor at convallis sed, venenatis eu metus. Nam ac metus at nibh placerat interdum vel vel mauris. In lacinia tellus sed leo cursus sodales. Vivamus in purus a nunc fermentum viverra quis non mauris. Nulla nec justo tellus. Maecenas leo velit, bibendum at dapibus at, vulputate et turpis. Sed fringilla interdum libero eu facilisis. Quisque lectus odio, aliquam sed vehicula at, euismod et nunc. Praesent at lacinia tortor. </p>  <div>Example use of Messages:</div> <span id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg3));
    sb.append("'></span> <div>Example use of Constants:</div> <span id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg4));
    sb.append("'></span> <div>Example use of ImageResource:</div> <span id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg5));
    sb.append("'></span> <div class='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg6));
    sb.append("'>Example use of Css Resource:</div>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
