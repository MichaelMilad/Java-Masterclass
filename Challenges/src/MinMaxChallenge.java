import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Find the Min & Max Numbers");

        double min = Double.MAX_VALUE, max = Double.MIN_VALUE;

        do {
            System.out.println("Enter a number !!");
            try {
                double newNumber = Double.parseDouble(scanner.nextLine());
                min = Math.min(newNumber, min);
                max = Math.max(newNumber, max);
            } catch (NumberFormatException e) {
                System.out.println("Invalid Number, Breaking ... \n");
                System.out.println("Minimum Number Entered Was:= " + min);
                System.out.println("Maximum Number Entered Was:= " + max);
                break;
            }
        } while (true);
    }
}
