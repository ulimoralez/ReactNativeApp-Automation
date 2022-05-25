package common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

    public static AppiumDriver driver;

    public static void Android_setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("platformVersion", "12.0");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("app", "/Users/ulisesmoralez/Documents/SOLVD/RepositoriosPropios/MyRNDemoApp/src/main/resources/apps/Android-MyDemoAppRN.apk");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
    }

    public static void iOS_setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("platformVersion", "12.0");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("appPackage", "com.google.android.apps.youtube.music");
        capabilities.setCapability("appActivity", "com.google.android.apps.youtube.music.activities.MusicActivity");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
        capabilities.setCapability("noReset", true);
        capabilities.setCapability("fullReset", false);
    }

    public static void tearDown() {
        if (null != driver) {
            driver.quit();
        }
    }

}
