package android;

import common.HeaderPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CatalogPage extends HeaderPage {
    public CatalogPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(accessibility = "container header")
    private MobileElement productsMenu;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"store item\"])[1]/android.view.ViewGroup[1]/android.widget.ImageView")
    private MobileElement product1;

    public boolean headerIsVisible() {
        return isVisible(productsMenu);
    }

    public void clickProduct(){
        click(product1);
    }
}
