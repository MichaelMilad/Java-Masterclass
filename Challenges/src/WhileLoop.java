public class WhileLoop {
    public static void main(String[] args) {

        int i = 4;
        while (i <= 20) {
            i++;
            if (!isEven(i)) continue;
            System.out.println(i);
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
