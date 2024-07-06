public class Main {
    public static void main(String[] args) {
        strFormat();

        printInformation("123456789");

        String str = "Hello World";
        System.out.println(str.equals(str.toLowerCase()));
        System.out.println(str.equalsIgnoreCase(str.toLowerCase()));
        System.out.println(str.startsWith("HellO"));
        System.out.println(str.contains("ello "));

        System.out.println(str.concat(" 2").concat(" 3"));
    }

    public static void printInformation(String str) {
        int length = str.length();
        System.out.printf("Length = %d %n", length);
        System.out.printf("First Character = %c %n", str.charAt(0));
        System.out.printf("First Character = %c %n", str.charAt(length - 1));
        System.out.printf("Mid Mid = %s %n",
                str.substring((int) Math.floor(length / 4.0),
                        (int) (length - Math.floor(length / 4.0))
                )
        );
    }

    public static void strFormat() {
        String bulletString =
                "Printing a bullet list:\n" + "\t\u2022 First " + "Point\n" + "\t\t\u2022 Second Point";

        System.out.println(bulletString);
        System.out.println("__ __ __ __ __");

        String textBlock = """
                           Print a Bulleted Text
                               \u2022 First Point:
                                   \u2022 Sub-First Point
                               \u2022 Second Point
                           """;

        System.out.println(textBlock);
    }
}
