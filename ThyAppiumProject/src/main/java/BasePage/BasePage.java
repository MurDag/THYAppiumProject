package BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

public class BasePage {
    protected static AppiumDriver<MobileElement> appiumDriver;

    public void clickById(By id) {
        appiumDriver.findElement(id).click();
    }

    public void clickByXPath(By xPath) {
        appiumDriver.findElement(xPath).click();
    }

    public void senKeysById(By id, String text) {
        appiumDriver.findElement(id).sendKeys(text);
    }

    public List<MobileElement> dayListByXPath(By xPath) {
        return appiumDriver.findElements(xPath);
    }

    public void randomSelectToElementByXPath(By xPath) {
        List<MobileElement> flightList = appiumDriver.findElements(xPath);
        Random r = new Random();
        int random = r.nextInt(flightList.size());
        flightList.get(random).click();
    }

}
