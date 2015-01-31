package com.gwtplatform.samples.tab.client.application.infopopup;

public class InfoPopupView_BinderImpl_TemplateImpl implements com.gwtplatform.samples.tab.client.application.infopopup.InfoPopupView_BinderImpl.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml html1(java.lang.String arg0) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<p class='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
    sb.append("'> This is an example of an auto-hiding <br> popup PresenterWidget. </p> <p> It will automatically go away if you click <br> anywhere or navigate. </p>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
