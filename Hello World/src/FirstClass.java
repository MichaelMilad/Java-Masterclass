public class FirstClass {
    public static void main(String[] args) {
        System.out.print("*****\nHello World,\n" + myMethod("Michael") + "\n*****");
    }

    private static String myMethod(String myName) {
        return "My Name is " + myName;
    }
}
