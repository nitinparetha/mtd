/**
 * 
 */
package com.seimens.plm.tcmfg.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ClientBundle.Source;

/**
 * @author Nitin
 *
 */
public interface TcmfgResources extends ClientBundle {

    public interface Styles extends CssResource {
        String divBorder();

        String logo();
    }

    public interface Sprites extends CssResource {
        String logo();
    }

    public Styles styles();

    public Sprites sprites();

    @Source("images/logo.png")
    @ImageResource.ImageOptions(repeatStyle = ImageResource.RepeatStyle.Horizontal, width = 50)
    ImageResource logo();

}
