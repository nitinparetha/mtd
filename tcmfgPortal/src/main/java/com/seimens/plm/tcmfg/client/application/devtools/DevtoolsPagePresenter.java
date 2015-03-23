package com.seimens.plm.tcmfg.client.application.devtools;

import javax.inject.Inject;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.TabData;
import com.gwtplatform.mvp.client.TabDataBasic;
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
import com.seimens.plm.tcmfg.client.resources.TcmfgConstants;

public class DevtoolsPagePresenter extends Presenter<DevtoolsPagePresenter.MyView, DevtoolsPagePresenter.MyProxy> {
    public interface MyView extends View {
    }

    /**
     * {@link AdminAreaPresenter}'s proxy.
     */
    @ProxyCodeSplit
    @NameToken(NameTokens.devTools)
    public interface MyProxy extends TabContentProxyPlace<DevtoolsPagePresenter> {
    }

    @TabInfo(container = DevelopmentPagePresenter.class)
    static TabData getTabLabel(TcmfgConstants constants) {
        // Priority = 0, means it will be the left-most tab in the home tab
        return new TabDataBasic(constants.tools(), 0);
    }
    
    @Inject
    DevtoolsPagePresenter(EventBus eventBus,
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
