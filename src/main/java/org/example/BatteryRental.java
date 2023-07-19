package org.example;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class BatteryRental {
    // takes a list of string array as input, each array represents a pair of borrow
    // & return time
    public static int countLateReturns(List<String[]> inputTimes) {

        // initialised to increment count if the period is above 5 hours borrow time
        int lateReturns = 0;
        String borrowTime;
        String returnTime;

        // timePair represents each time pair within the available list(inputTimes)
        for (String[] timePair : inputTimes) {
            borrowTime = timePair[0];
            returnTime = timePair[1];

            // getting the difference between each pair borrowTime and returnTime
            long differenceInHours = (LocalTime.parse(returnTime).toSecondOfDay()
                    - LocalTime.parse(borrowTime).toSecondOfDay()) / 3600;

            // check if we have a difference of above 5
            if (differenceInHours > 5) {
                lateReturns++;

            }

        }

        return lateReturns;

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        // Example input
        List<String[]> inputTimes = new ArrayList<>();
        inputTimes.add(new String[] { "04:00", "11:00" });
        inputTimes.add(new String[] { "13:00", "16:00" });
        inputTimes.add(new String[] { "06:00", "10:00" });
        inputTimes.add(new String[] { "12:30", "13:30" });
        inputTimes.add(new String[] { "02:00", "11:00" });

        System.out.println(countLateReturns(inputTimes));
//        System.out.println("pass");
    }
}
