public class CodingExcercise1 {
    public static void main(String[] args) {
        System.out.println(
                "Output is:  \"" + getDurationString(3665) + "\""
        );
        System.out.println(
                "Output is:  \"" + getDurationString(1, 3661) + "\""
        );
        System.out.println(
                "Output is:  \"" + getDurationString(0,21, 165) + "\""
        );
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) return "Invalid Input For Seconds: \"" + seconds + "\"" + " Must be positive integer";

        int hours = seconds / 3600;
        int remainingSeconds = (seconds % 3600);

        int minutes = remainingSeconds / 60;
        remainingSeconds = (remainingSeconds % 60);

        return hours + "h " + minutes + "m " + remainingSeconds + "s";
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) return "Invalid Input For Minutes: \"" + minutes + "\"" + " Must be positive integer";
        if (seconds < 0) return "Invalid Input For Seconds: \"" + seconds + "\"" + " Must be positive integer";

        return getDurationString((minutes * 60) + seconds);
    }

    public static String getDurationString(int hours, int minutes, int seconds) {
        if (hours < 0) return "Invalid Input For Hours: \"" + hours + "\"" + " Must be positive integer";
        if (minutes < 0) return "Invalid Input For Minutes: \"" + minutes + "\"" + " Must be positive integer";
        if (seconds < 0) return "Invalid Input For Seconds: \"" + seconds + "\"" + " Must be positive integer";

        return getDurationString((hours * 3600) + (minutes * 60) + (seconds));
    }
}
