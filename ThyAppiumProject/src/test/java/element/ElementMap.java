package element;

import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

import static element.BookAFlightPageElements.*;
import static element.FlightResultsPage.*;
import static element.HomePageElements.*;

public class ElementMap {

    public static HashMap<String, By> elementsMap(){
        HashMap<String, By> elementsMap = new HashMap<String, By>();
        elementsMap.put( "BookAFlightBy", BookAFlightBy);
        elementsMap.put( "oneWayButtonBy", oneWayButtonBy);
        elementsMap.put( "fromToButtonBy", fromToButtonBy);
        elementsMap.put( "fromToSearchBoxButtonBy", fromToSearchBoxButtonBy);
        elementsMap.put( "fromToSelectResultBy", fromToSelectResultBy);
        elementsMap.put( "goToButtonBy", goToButtonBy);
        elementsMap.put( "goToSearchBoxButtonBy", goToSearchBoxButtonBy);
        elementsMap.put( "goToSelectResultBy", goToSelectResultBy);
        elementsMap.put( "dateButtonBy", dateButtonBy);
        elementsMap.put( "dateListBy", dateListBy);
        elementsMap.put( "doneButtonBy", doneButtonBy);
        elementsMap.put( "addingPersonButtonBy", addingPersonButtonBy);
        elementsMap.put( "searchFlightBy", searchFlightBy);
        elementsMap.put( "flightAreaBy", flightAreaBy);
        elementsMap.put( "flightListBy", flightListBy);
        elementsMap.put( "selectEcoFligthBy", selectEcoFligthBy);
        elementsMap.put( "continueButtonBy", continueButtonBy);
        return elementsMap;
    }


}
