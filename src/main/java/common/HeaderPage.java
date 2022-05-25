package common;

import android.CartPage;
import android.CatalogPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HeaderPage extends PageBase{
    public HeaderPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"open menu\"]/android.widget.ImageView")
    private MobileElement burgerMenu;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"sort button\"]/android.widget.ImageView")
    private MobileElement sortByButton;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"cart badge\"]/android.widget.ImageView")
    private MobileElement cartButton;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"longpress reset app\"]/android.widget.ImageView")
    private MobileElement logo;

    public void clickBurgerMenu(){
        click(burgerMenu);
    }

    public void clickSortByButton(){
        click(sortByButton);
    }

    public CartPage clickCartButton(){
        click(cartButton);
        return new CartPage(driver);
    }

    public void clickLogo() {
        click(logo);
    }

}
