public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(2, 2, 11));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount * 5 + smallCount) < goal) {
            return false;
        }
        int currentCount = 0;
        int bigBagsUsed = 0;
        int smallBagsUsed = 0;

        while (bigBagsUsed < bigCount && currentCount <= goal - 5) {
            currentCount += 5;
            bigBagsUsed++;
        }

        while (smallBagsUsed < smallCount && currentCount <= goal - 1) {
            currentCount += 1;
            smallBagsUsed++;
        }

        return currentCount == goal;
    }
}
