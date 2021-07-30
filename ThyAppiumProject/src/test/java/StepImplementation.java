import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.junit.Assert;

import java.util.List;

import static BasePage.Elements.dateTable;
import static BasePage.Elements.elementListMap;

public class StepImplementation extends BaseTest {
    @Step("<second> Saniye Bekle")
    public void waitBySecond(Integer second) throws InterruptedException {
        Thread.sleep(second * 1000);
    }

    @Step("<key> Id'li Elemente Tıkla")
    public void clickById(String key) {
        clickById(elementListMap().get(key));
    }

    @Step("<key> xPath'li Elemente Tıkla")
    public void clickByXPath(String key) {
        clickByXPath(elementListMap().get(key));
    }

    @Step("<key> Id'li Elemente <text> Değerini Yaz")
    public void clickById(String key, String text) {
        senKeysById(elementListMap().get(key), text);
    }

    @Step({"<day> Gün Sonraki Tarihe Tıkla"})
    public void selectNextDate(String day) {
        int gun = Integer.parseInt(day);
        int selectIndex = 0;
        List<MobileElement> days = dayListByXPath(dateTable);
        for (MobileElement element : days) {
            if (element.isSelected()) {
                selectIndex = days.indexOf(element) + gun;
            }
        }
        dayListByXPath(dateTable).get(selectIndex).click();
    }

    @Step("<id> Id'li Elementin Varlığını Kontrol Et")
    public void controlElementById(String id) {
        Assert.assertTrue(appiumDriver.findElement(elementListMap().get(id)).isDisplayed());
    }

    @Step("<xPath> Listesinden Rastgele Bir Element Seç")
    public void randomSelectToElementByXPath(String xPath) {
        randomSelectToElementByXPath(elementListMap().get(xPath));
    }

}
