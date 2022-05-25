package android;

import common.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class CatalogPageTests extends TestBase {

    @BeforeSuite
    public void setUp() throws MalformedURLException {
        Android_setUp();
    }

    @Test
    public void firstTest(){
        CatalogPage catalogPage = new CatalogPage(driver);
        Assert.assertTrue(catalogPage.headerIsVisible(), "Products it's not the header");
    }
}
