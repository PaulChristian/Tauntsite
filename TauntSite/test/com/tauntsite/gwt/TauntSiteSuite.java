package com.tauntsite.gwt;

import com.tauntsite.gwt.client.TauntSiteTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class TauntSiteSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for TauntSite");
    suite.addTestSuite(TauntSiteTest.class);
    return suite;
  }
}
