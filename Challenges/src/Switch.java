public class Switch {
    public static void main(String[] args) {
        char natoLetter = 'B';

        switch (natoLetter) {
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println("Not Found");
                break;
        }

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);
    }

    public static void printDayOfWeek(int day) {
        String dayOfTheWeek = dayOfTheWeek(day);

        if (dayOfTheWeek == "Invalid Day") {
            System.out.println("Day: \"" + day + "\" Is NOT a valid day");
        } else {
            System.out.println(dayOfTheWeek + " Is The " + day + "th Day of the Week!");
        }

    }

    public static String dayOfTheWeek(int day) {
        return switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
    }
}
