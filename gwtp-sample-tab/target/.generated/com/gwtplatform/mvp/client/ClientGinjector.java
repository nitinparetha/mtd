package com.gwtplatform.mvp.client;

import com.google.gwt.inject.client.Ginjector;
import com.gwtplatform.samples.tab.client.gin.GinjectorExtension;
import com.google.gwt.core.shared.GWT;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.DefaultBootstrapper;
import javax.inject.Provider;
import com.google.gwt.inject.client.AsyncProvider;

public interface ClientGinjector extends Ginjector, GinjectorExtension {
  static ClientGinjector SINGLETON = ((GinjectorProvider) GWT.create(GinjectorProvider.class)).get();
  
  EventBus getEventBus();
  
  PlaceManager getPlaceManager();
  
  DefaultBootstrapper getDefaultBootstrapper();
  
  com.gwtplatform.samples.tab.client.security.IsAdminGatekeeper getcomgwtplatformsamplestabclientsecurityIsAdminGatekeeper();
  
  Provider<com.gwtplatform.samples.tab.client.application.ApplicationPresenter> getcomgwtplatformsamplestabclientapplicationApplicationPresenter();
  
  AsyncProvider<com.gwtplatform.samples.tab.client.application.adminarea.AdminAreaPresenter> getcomgwtplatformsamplestabclientapplicationadminareaAdminAreaPresenter();
  
  AsyncProvider<com.gwtplatform.samples.tab.client.application.dialog.DialogSamplePresenter> getcomgwtplatformsamplestabclientapplicationdialogDialogSamplePresenter();
  
  AsyncProvider<com.gwtplatform.samples.tab.client.application.globaldialog.GlobalDialogSubTabPresenter> getcomgwtplatformsamplestabclientapplicationglobaldialogGlobalDialogSubTabPresenter();
  
  AsyncProvider<com.gwtplatform.samples.tab.client.application.home.HomePresenter> getcomgwtplatformsamplestabclientapplicationhomeHomePresenter();
  
  AsyncProvider<com.gwtplatform.samples.tab.client.application.homeinfo.HomeInfoPresenter> getcomgwtplatformsamplestabclientapplicationhomeinfoHomeInfoPresenter();
  
  AsyncProvider<com.gwtplatform.samples.tab.client.application.homenews.HomeNewsPresenter> getcomgwtplatformsamplestabclientapplicationhomenewsHomeNewsPresenter();
  
  AsyncProvider<com.gwtplatform.samples.tab.client.application.localdialog.LocalDialogSubTabPresenter> getcomgwtplatformsamplestabclientapplicationlocaldialogLocalDialogSubTabPresenter();
  
  AsyncProvider<com.gwtplatform.samples.tab.client.application.settings.SettingsPresenter> getcomgwtplatformsamplestabclientapplicationsettingsSettingsPresenter();
}
