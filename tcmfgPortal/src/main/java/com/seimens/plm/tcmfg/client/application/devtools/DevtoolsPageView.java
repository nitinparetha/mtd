package com.seimens.plm.tcmfg.client.application.devtools;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.Tab;
import com.gwtplatform.mvp.client.TabData;
import com.gwtplatform.mvp.client.ViewImpl;
import com.seimens.plm.tcmfg.client.application.ui.tabs.SimpleTabPanel;

public class DevtoolsPageView extends ViewImpl implements DevtoolsPagePresenter.MyView {
    public interface Binder extends UiBinder<Widget, DevtoolsPageView> {
    }

    
    @Inject
    DevtoolsPageView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
