public class PrimeNumber {
    public static void main(String[] args) {

        int primeCount = 0;

        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i)) {
                primeCount++;
                System.out.println("(" + primeCount + ") " + i + " is a Prime Number");
            }
            if(primeCount == 10) break;
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
