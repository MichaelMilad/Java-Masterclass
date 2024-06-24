import java.util.Scanner;

public class CalculatingNumbersInputChallenge {
    public static void main(String[] args) {
        int numbersCount = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        while (numbersCount < 5) {
            System.out.println("Enter Number #" + (numbersCount + 1));
            String num = scanner.nextLine();
            boolean isValidNumber = isValidNumber(num);

            if (isValidNumber) {
                sum += Integer.parseInt(num);
                numbersCount++;
            } else {
                System.out.println("Invalid Number Entered");
            }
        }

        System.out.println("Sum is equal to " + sum);
    }

    public static boolean isValidNumber(String num) {
        try {
            Integer.valueOf(Integer.parseInt(num));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
