package BasePage;

import org.openqa.selenium.By;

import java.util.HashMap;

public class Elements extends BasePage {
    static final By allowLocation = By.id("com.android.packageinstaller:id/permission_allow_button");
    static final By allowCookies = By.id("frPrivacy_btnAccept");
    static final By bookAFlight = By.id("acMain_btnBooking");
    static final By oneWay = By.id("com.turkishairlines.mobile:id/frDashboard_tvOneWay");
    static final By fromAirPort = By.id("com.turkishairlines.mobile:id/frDashboard_tvFromCode");
    static final By searchAirPort = By.id("frAirportSelection_etSearch");
    static final By selectResultFromAirPort = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[2]");
    static final By toAirPort = By.id("frDashboard_tvToCode");
    static final By selectResultToAirPort = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.TextView[2]");
    static final By dateButtonBox = By.id("frDashboard_rlDeparture");
    public static final By dateTable = By.xpath("//*[@class=\"android.view.ViewGroup\"]/android.view.ViewGroup/android.widget.FrameLayout");
    static final By confirmDate = By.id("frDashboard_btnDone");
    static final By plusPerson = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[7]/android.widget.TextView\n");
    static final By searchFligtsButton = By.id("frDashboard_btnSearch");
    static final By resultFligthsBox = By.id("frFlightSearch_rvFlight");
    static final By resultFlightList = By.xpath("//*[@class=\"androidx.recyclerview.widget.RecyclerView\"]/android.view.ViewGroup/android.widget.FrameLayout");
    static final By ecoFlyClick = By.xpath("//*[contains(@text,'EcoFly')]");
    static final By continueButton = By.id("frFlightSearch_btnContinue");


    public static HashMap<String, By> elementListMap() {
        HashMap<String, By> elements = new HashMap<String, By>();
        elements.put("allowLocation", allowLocation);
        elements.put("allowCookies", allowCookies);
        elements.put("bookAFlight", bookAFlight);
        elements.put("oneWay", oneWay);
        elements.put("fromAirPort", fromAirPort);
        elements.put("searchAirPort", searchAirPort);
        elements.put("selectResultFromAirPort", selectResultFromAirPort);
        elements.put("toAirPort", toAirPort);
        elements.put("dateButtonBox", dateButtonBox);
        elements.put("selectResultToAirPort", selectResultToAirPort);
        elements.put("confirmDate", confirmDate);
        elements.put("plusPerson", plusPerson);
        elements.put("searchFligtsButton", searchFligtsButton);
        elements.put("resultFligthsBox", resultFligthsBox);
        elements.put("resultFlightList", resultFlightList);
        elements.put("ecoFlyClick", ecoFlyClick);
        elements.put("continueButton", continueButton);
        return elements;
    }

}
