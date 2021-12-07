package academy.learnprogramming;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(3600));
        System.out.println(getDurationString(654));
        System.out.println(getDurationString(3661));
        System.out.println(getDurationString(-1));
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || seconds < 0 || seconds > 59){
            return INVALID_VALUE_MESSAGE;
        }
        int minutesInSeconds = seconds / 60;
        int hours = minutes / 60;
        int minutesLeft = minutes - hours * 60 + minutesInSeconds;
        int secondsLeft = seconds - minutesInSeconds;

        String hoursString = hours + "h";
        if(hours < 10){
            hoursString = "0" + hoursString;
        }

        String minutesString = minutesLeft + "m";
        if(minutesLeft < 10){
            minutesString = "0" + minutesString;
        }

        String secondsString = secondsLeft + "s";
        if(secondsLeft < 10){
            secondsString = "0" + secondsString;
        }
        return hoursString + " " + minutesString + " " + secondsString;
    }

    public static String getDurationString(int seconds){
        if(seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }
        int minutesInSeconds = seconds / 60;
        int secondsLeft = seconds - minutesInSeconds * 60;
        return getDurationString(minutesInSeconds, secondsLeft);
    }





}
