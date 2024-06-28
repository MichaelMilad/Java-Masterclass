package Student;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            LPAStudent s = new LPAStudent(
                    "S92300" + i,
                    switch(i) {
                        case 0 -> "Michael";
                        case 1 -> "Foo";
                        case 2 -> "Bar";
                        case 3 -> "John";
                        case 4 -> "Smith";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "ZTM"
            );

            System.out.println(s + "\n");
        }
    }
}
