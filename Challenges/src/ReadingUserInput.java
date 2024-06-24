import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        int currentYear = 2024;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println("An Exception Occurred !! \n");
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your name ?\n");
        System.out.println("Hi " + name + " , Thanks for adding the name");

        String dateOfBirth = System.console().readLine("What year were you born ?\n");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old!";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, What's your name ?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + " , Thanks for adding the name");

        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("What year were you born ?");
            try {
                age = getAge(2024, scanner.nextLine());
                if (age == -1) {
                    System.out.println("Invalid DOB !!");
                } else {
                    validDOB = true;
                }
            } catch (NumberFormatException badUserData) {
                System.out.println("NON Numeric Year Entered!");
            }
        } while (!validDOB);

        return "So you are " + age + " years old!";
    }

    public static int getAge(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minYear = currentYear - 125;

        if (dob < minYear || dob >= currentYear) {
            return -1;
        }

        return (currentYear - dob);
    }
}
