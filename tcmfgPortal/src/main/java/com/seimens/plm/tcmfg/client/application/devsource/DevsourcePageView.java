package com.seimens.plm.tcmfg.client.application.devsource;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.Tab;
import com.gwtplatform.mvp.client.TabData;
import com.gwtplatform.mvp.client.ViewImpl;
import com.seimens.plm.tcmfg.client.application.ui.tabs.SimpleTabPanel;

public class DevsourcePageView extends ViewImpl implements DevsourcePagePresenter.MyView {
    public interface Binder extends UiBinder<Widget, DevsourcePageView> {
    }

    
    @Inject
    DevsourcePageView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
