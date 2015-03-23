/**
 * 
 */
package com.seimens.plm.tcmfg.client.application.development;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.RequestTabsHandler;
import com.gwtplatform.mvp.client.TabContainerPresenter;
import com.gwtplatform.mvp.client.TabPanel;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;

/**
 * @author Neha
 *
 */
public class DevelopmentPagePresenterBase<V extends View & TabPanel, P extends Proxy<?>>
extends TabContainerPresenter<V, P> {
	
	DevelopmentPagePresenterBase(EventBus eventBus,
            V view,
            P proxy,
            Type<RequestTabsHandler> requestTabsEventType,
            GwtEvent.Type<RevealContentHandler<?>> slot) {
		super(eventBus, view, proxy, SLOT_SetTabContent, requestTabsEventType, slot);
	}

/**
 * Use this in leaf presenters, inside their {@link #revealInParent} method.
 */
@ContentSlot
public static final Type<RevealContentHandler<?>> SLOT_SetTabContent = new Type<>();
}
