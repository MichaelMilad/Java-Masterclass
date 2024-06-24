public class DigitSum {
    public static void main(String[] args) {
//        System.out.print(sumDigits(-45));

        int i = Math.min(43, 12);
        System.out.println(i);
    }

    public static int sumDigits(int num) {
        if (num < 0) {
            return -1;
        }

        int sum = 0;
        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
