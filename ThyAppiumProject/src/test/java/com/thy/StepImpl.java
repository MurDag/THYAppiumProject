package com.thy;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.junit.Assert;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static element.BookAFlightPageElements.*;
import static element.FlightResultsPage.*;
import static element.ElementMap.*;

public class StepImpl extends HookImpl{

    @Step({"<seconds> saniye bekle"})
    public void waitBySecond(int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }

    @Step("<element> butonuna tıkla")
    public void clickElement(String element){
        click(elementsMap().get(element));
    }

    @Step("<element> 'ine <key> degerini yolla")
    public void sendKeyElement(String element, String key){
        sendKeys(elementsMap().get(element), key);
    }

    @Step("<element> var mı kontrol et")
    public void isDisplayedElement(String element){
        Assert.assertTrue(getElement(elementsMap().get(element)).isDisplayed());
    }

    @Step("<key> elementleri arasından rastgele tıkla")
    public void randomSelect(String key){
        int randomNumber = randomElement(elementsMap().get(key));
        elementList(elementsMap().get(key)).get(randomNumber).click();
    }

    @Step("<element> elementleri arasından <index> .inci elemana tıkla")
    public void indexSelect(String element, String index){
        int i = Integer.parseInt(index);
        elementList(elementsMap().get(element)).get(i).click();
    }

    @Step({"<gun> sonraki tarihi seç"})
    public void selectDate(String gun){
        int day = Integer.parseInt(gun);
        List<MobileElement> dates = elementList(dateListBy);
        int index = 0;
        for (MobileElement element: dates) {
            if (element.isSelected()){
                index = dates.indexOf(element) + day;
            }
        }
        elementList(dateListBy).get(index).click();
    }


}
