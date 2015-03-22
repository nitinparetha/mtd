package com.gwtplatform.mvp.client;

public class com_gwtplatform_mvp_client_MobileGinjectorImpl implements com.gwtplatform.mvp.client.MobileGinjector {
  
  /**
   * Top-level injector instance for injector interface com.gwtplatform.mvp.client.MobileGinjector.
   */
  private final com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector fieldcom_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector = new com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector(this);
  public com_gwtplatform_mvp_client_MobileGinjectorImpl() {
    fieldcom_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector.initializeEagerSingletons();
    
  }
  
  public com.gwtplatform.mvp.client.DefaultBootstrapper getDefaultBootstrapper() {
    return fieldcom_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$DefaultBootstrapper$_annotation$$none$$();
  }
  
  public com.google.web.bindery.event.shared.EventBus getEventBus() {
    return fieldcom_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$();
  }
  
  public com.gwtplatform.mvp.client.proxy.PlaceManager getPlaceManager() {
    return fieldcom_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector.getFragment_com_gwtplatform_mvp_client_proxy().get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$();
  }
  
  public com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.mobile.client.application.AbstractApplicationPresenter> getcomgwtplatformsamplesmobileclientapplicationAbstractApplicationPresenter() {
    return fieldcom_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector.getFragment_com_gwtplatform_samples_mobile_client_application().get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$gwtplatform$samples$mobile$client$application$AbstractApplicationPresenter$$_annotation$$none$$();
  }
  
  public javax.inject.Provider<com.gwtplatform.samples.mobile.client.application.breadcrumbs.BreadcrumbsPresenter> getcomgwtplatformsamplesmobileclientapplicationbreadcrumbsBreadcrumbsPresenter() {
    return fieldcom_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector.getFragment_com_gwtplatform_samples_mobile_client_application_breadcrumbs().get_Key$type$com$google$inject$Provider$com$gwtplatform$samples$mobile$client$application$breadcrumbs$BreadcrumbsPresenter$$_annotation$$none$$();
  }
  
  public com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.mobile.client.application.product.ProductPresenter> getcomgwtplatformsamplesmobileclientapplicationproductProductPresenter() {
    return fieldcom_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector.getFragment_com_gwtplatform_samples_mobile_client_application_product().get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$gwtplatform$samples$mobile$client$application$product$ProductPresenter$$_annotation$$none$$();
  }
  
  public com.google.gwt.inject.client.AsyncProvider<com.gwtplatform.samples.mobile.client.application.products.ProductsPresenter> getcomgwtplatformsamplesmobileclientapplicationproductsProductsPresenter() {
    return fieldcom_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector.getFragment_com_gwtplatform_samples_mobile_client_application_products().get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$gwtplatform$samples$mobile$client$application$products$ProductsPresenter$$_annotation$$none$$();
  }
  
}
