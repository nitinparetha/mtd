/**
 * 
 */
package com.seimens.plm.tcmfg.client.gin;

import javax.inject.Inject;

import com.seimens.plm.tcmfg.client.resources.TcmfgResources;

/**
 * @author Nitin
 *
 */
public class ResourceLoader {

	/**
	 * 
	 */
    @Inject
    ResourceLoader(TcmfgResources resources) {
        resources.styles().ensureInjected();
        resources.sprites().ensureInjected();
    }

}
