package com.gwtplatform.samples.tab.client.application.globaldialog;

public class GlobalDialogView_BinderImpl_TemplateImpl implements com.gwtplatform.samples.tab.client.application.globaldialog.GlobalDialogView_BinderImpl.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml html1() {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("Ok");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml html2(java.lang.String arg0,java.lang.String arg1) {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("<p>This is an example of a global dialog PresenterWidget.</p> <p> Try clicking tabs and navigating while the dialog is showing and <br> it will not disappear. <br> Compare this to the behavior of the presenter-local dialog box you <br> get by clicking on the \"Launch local dialog\" button. </p> <span id='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
sb.append("'></span> <span id='");
sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1));
sb.append("'></span>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

public com.google.gwt.safehtml.shared.SafeHtml html3() {
StringBuilder sb = new java.lang.StringBuilder();
sb.append("<b>Global dialog box example</b>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
