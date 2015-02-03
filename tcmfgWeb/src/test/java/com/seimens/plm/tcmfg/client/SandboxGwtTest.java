package com.seimens.plm.tcmfg.client;

import com.google.gwt.junit.client.GWTTestCase;

public class SandboxGwtTest extends GWTTestCase {
    @Override
    public String getModuleName() {
        return "com.seimens.plm.tcmfg.tcmfgWeb";
    }

    public void testSandbox() {
        assertTrue(true);
    }
}