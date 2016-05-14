package projekt.zespolowy.utils;

/**
 * Created by tomahavvq on 13.05.16.
 */
public class TimeUtils {

    public static String secondsToTime(Integer secondsCount) {

        int seconds = secondsCount % 60;
        secondsCount -= seconds;

        int minutesCount = secondsCount / 60;
        int minutes = minutesCount % 60;
        minutesCount -= minutes;

        int hoursCount = minutesCount / 60;
        return String.valueOf(hoursCount + ":" + minutes + ":" + seconds);
    }

}
