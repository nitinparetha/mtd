package com.seimens.plm.tcmfg.client.application;

import javax.inject.Inject;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.ChangeTabHandler;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.RequestTabsHandler;
import com.gwtplatform.mvp.client.TabContainerPresenter;
import com.gwtplatform.mvp.client.TabView;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.Presenter.RevealType;
import com.gwtplatform.mvp.client.annotations.ChangeTab;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.ProxyEvent;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.annotations.RequestTabs;
import com.gwtplatform.mvp.client.proxy.AsyncCallFailEvent;
import com.gwtplatform.mvp.client.proxy.AsyncCallFailHandler;
import com.gwtplatform.mvp.client.proxy.AsyncCallStartEvent;
import com.gwtplatform.mvp.client.proxy.AsyncCallStartHandler;
import com.gwtplatform.mvp.client.proxy.AsyncCallSucceedEvent;
import com.gwtplatform.mvp.client.proxy.AsyncCallSucceedHandler;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.seimens.plm.tcmfg.client.security.CurrentUserChangedEvent;
import com.seimens.plm.tcmfg.client.security.CurrentUserChangedHandler;

/**
 * The main {@link com.gwtplatform.mvp.client.Presenter} of the application. It contains a number of tabs allowing
 * access to the various parts of the application. Tabs are refreshed whenever the current user's privileges change in
 * order to hide areas that cannot be accessed.
 */
public class ApplicationPresenter
        extends TabContainerPresenter<ApplicationPresenter.MyView, ApplicationPresenter.MyProxy>
        implements CurrentUserChangedHandler, AsyncCallStartHandler, AsyncCallFailHandler, AsyncCallSucceedHandler {
    /**
     * {@link ApplicationPresenter}'s proxy.
     */
    @ProxyStandard
    public interface MyProxy extends Proxy<ApplicationPresenter> {
    }

    /**
     * {@link ApplicationPresenter}'s view.
     */
    public interface MyView extends TabView {
        void refreshTabs();

        void setTopMessage(String string);
    }

    /**
     * This will be the event sent to our "unknown" child presenters, in order for them to register their tabs.
     */
    @RequestTabs
    public static final Type<RequestTabsHandler> SLOT_RequestTabs = new Type<>();

    /**
     * Fired by child proxie's when their tab content is changed.
     */
    @ChangeTab
    public static final Type<ChangeTabHandler> SLOT_ChangeTab = new Type<>();

    /**
     * Use this in leaf presenters, inside their {@link #revealInParent} method.
     */
    @ContentSlot
    public static final Type<RevealContentHandler<?>> SLOT_SetTabContent = new Type<>();

    @Inject
    ApplicationPresenter(EventBus eventBus,
                         MyView view,
                         MyProxy proxy) {
        super(eventBus, view, proxy, SLOT_SetTabContent, SLOT_RequestTabs, SLOT_ChangeTab, RevealType.Root);
    }

    @ProxyEvent
    @Override
    public void onCurrentUserChanged(CurrentUserChangedEvent event) {
        getView().refreshTabs();
    }

    @ProxyEvent
    @Override
    public void onAsyncCallStart(AsyncCallStartEvent event) {
        getView().setTopMessage("Loading...");
    }

    @ProxyEvent
    @Override
    public void onAsyncCallFail(AsyncCallFailEvent event) {
        getView().setTopMessage("Oops, something went wrong...");
    }

    @ProxyEvent
    @Override
    public void onAsyncCallSucceed(AsyncCallSucceedEvent event) {
        getView().setTopMessage(null);
    }
}
