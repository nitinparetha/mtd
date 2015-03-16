package com.seimens.plm.tcmfg.client.application.development;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.Tab;
import com.gwtplatform.mvp.client.TabData;
import com.gwtplatform.mvp.client.ViewImpl;

public class DevelopmentPageView extends ViewImpl implements DevelopmentPagePresenter.MyView {
    public interface Binder extends UiBinder<Widget, DevelopmentPageView> {
    }

    @Inject
    DevelopmentPageView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
