public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(100);
    }

    public static int getDigitCount(int num) {
        if (num < 0) return -1;

        int digitsCount = 0;
        while (num > 0) {
            digitsCount++;
            num /= 10;
        }

        return Math.max(digitsCount, 1);
    }

    public static int reverse(int num) {
        int reversedNumber = 0;
        while (num != 0) {
            reversedNumber = reversedNumber * 10 + num % 10;
            num /= 10;
        }

        return reversedNumber;
    }

    public static void numberToWords(int num) {
        if (num < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int digitsCount = getDigitCount(num);
        int reversedNumber = reverse(num);

        for (int i = 1; i <= digitsCount; i++) {
            int digit = reversedNumber % 10;
            reversedNumber /= 10;
            switch (digit) {
                case 0 -> System.out.print("Zero");
                case 1 -> System.out.print("One");
                case 2 -> System.out.print("Two");
                case 3 -> System.out.print("Three");
                case 4 -> System.out.print("Four");
                case 5 -> System.out.print("Five");
                case 6 -> System.out.print("Six");
                case 7 -> System.out.print("Seven");
                case 8 -> System.out.print("Eight");
                case 9 -> System.out.print("Nine");
                default -> System.out.print("Invalid Value: " + digit);
            }
            if (i < digitsCount) {
                System.out.print(" ");
            }
        }
    }
}