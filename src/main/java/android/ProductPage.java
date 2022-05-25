package android;

import common.PageBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ProductPage extends PageBase{

    public ProductPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"container header\"]/android.widget.TextView")
    AndroidElement productName;

    @AndroidFindBy(accessibility = "product price")
    AndroidElement productPrice;

    public boolean isVisible(MobileElement element) {
        return super.isVisible(element);
    }

    public boolean containsText(MobileElement element, String text) {
        boolean contains;
        contains = containsText(element, text);
        return contains;
    }

    public AndroidElement getProductName() {
        return productName;
    }

    public AndroidElement getProductPrice() {
        return productPrice;
    }
}
