public class PrecedenceChallenge {
    public static void main(String[] args) {
        double double1 = 20d;
        double double2 = 801d;
        double total = (double1 + double2) * 100d;
        double remainder = total % 40d;
        boolean isNoRemainder = (remainder == 0);

        System.out.println(isNoRemainder);

        if (!isNoRemainder && remainder != 20) {
            System.out.println("Got some remainder:: " + remainder);
        } else if (!isNoRemainder && remainder == 20d ) {
            System.out.println("Remainder is 20.00 exactly");
        } else {
            System.out.println("No Remainder");
        }
    }
}
