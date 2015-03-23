package com.seimens.plm.tcmfg.client.application.devsource;

import javax.inject.Inject;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.TabInfo;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.gwtplatform.mvp.client.proxy.TabContentProxyPlace;
import com.seimens.plm.tcmfg.client.application.adminarea.AdminAreaPresenter;
import com.seimens.plm.tcmfg.client.application.development.DevelopmentPagePresenter;
import com.seimens.plm.tcmfg.client.place.NameTokens;

public class DevsourcePagePresenter extends Presenter<DevsourcePagePresenter.MyView, DevsourcePagePresenter.MyProxy> {
    public interface MyView extends View {
    }

    /**
     * {@link AdminAreaPresenter}'s proxy.
     */
    @ProxyCodeSplit
    @NameToken(NameTokens.devSource)
    @TabInfo(container = DevelopmentPagePresenter.class, label = "Source", priority = 1)
    public interface MyProxy extends TabContentProxyPlace<DevsourcePagePresenter> {
    }

    
    @Inject
    DevsourcePagePresenter(EventBus eventBus,
            MyView view,
            MyProxy proxy) {
	super(eventBus, view, proxy, DevelopmentPagePresenter.SLOT_SetTabContent);
	}
    
    /**
     * Use this in leaf presenters, inside their {@link #revealInParent} method.
     */
    @ContentSlot
    public static final Type<RevealContentHandler<?>> SLOT_SetTabContent = new Type<>();
}
