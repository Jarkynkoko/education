package Methods;

import java.util.Locale;

public class weekDayValid {
    public static boolean isWeekDay(String day){
        day = day.toLowerCase();

        switch (day){
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                return true;
            case "saturday":
            case "sunday":
                return false;
            default:
                System.out.println("Invalid day provided");
                return false;

        }
    }
}

