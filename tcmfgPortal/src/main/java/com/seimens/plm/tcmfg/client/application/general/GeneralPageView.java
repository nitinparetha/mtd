package com.seimens.plm.tcmfg.client.application.general;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.Tab;
import com.gwtplatform.mvp.client.TabData;
import com.gwtplatform.mvp.client.ViewImpl;

public class GeneralPageView extends ViewImpl implements GeneralPagePresenter.MyView {
    public interface Binder extends UiBinder<Widget, GeneralPageView> {
    }

    @Inject
    GeneralPageView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
