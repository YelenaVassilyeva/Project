package lesson8;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Assignment7 {
    //Create a method with an array list of days of the week
    // from Sunday to Saturday. The method can receive a number and return the day of the week (or error).
    // Add unit tests for this method.Think about:
    //positive tests - all the days have correct return values
    //negative tests - numbers < 1 and >7
    //a null value (expect for exception)


    public static String getDay(Integer dayNumber) {


        ArrayList<String> daysList = new ArrayList<>();
        daysList.add("Sunday");
        daysList.add("Monday");
        daysList.add("Tuesday");
        daysList.add("Wednesday");
        daysList.add("Thursday");
        daysList.add("Friday");
        daysList.add("Saturday");
        if (dayNumber == null) {

            throw new NullPointerException();
        }
        else if (dayNumber < 1) {
            return "The number should be equal or larger than 1";
        } else if (dayNumber > 7) {
            return "The number should be equal or smaller than 7";
        } else {

            return daysList.get(dayNumber - 1);
        }
    }

}
