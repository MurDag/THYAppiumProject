import BasePage.BasePage;
import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest extends BasePage {

    protected static FluentWait<AppiumDriver<MobileElement>> appiumFluentWait;

    @BeforeScenario
    public void beforeScenario() throws MalformedURLException {
        System.out.println("<------------------- Test Islemi Basladi ------------------->");

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.turkishairlines.mobile");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.turkishairlines.mobile.ui.ACSplash");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 3000);
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        appiumDriver = new AndroidDriver(url, desiredCapabilities);
    }

    @AfterScenario
    public void afterScenario() {
        if (appiumDriver != null)
        {
            System.out.println("<------------------- Test Islemi Basarili Sekilde Sonlandi ------------------->");
            appiumDriver.quit();
        }
    }
}