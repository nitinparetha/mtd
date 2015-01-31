package com.gwtplatform.samples.tab.client.application.localdialog;

public class LocalDialogView_BinderImpl_TemplateImpl implements com.gwtplatform.samples.tab.client.application.localdialog.LocalDialogView_BinderImpl.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml html1() {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("Ok");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml html2(java.lang.String arg0) {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("<p>This is an example of a presenter-local dialog PresenterWidget. </p> <p> Try clicking tabs and navigating while the dialog is showing. It <br> should disappear and reappear when you come back. <br> Compare this to the behavior of the global dialog box you get by <br> clicking on the \"Launch global dialog\" button. </p> <p> You could make this a modal dialog if desired. However, the <br> mechanism described above ensures that your app is robust <br> even when the user navigates with the browser arrows or by <br> manually modifying the URL. </p> <span id='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
sb.append("'></span>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml html3() {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("<b>Local dialog box example</b>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
