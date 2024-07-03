package InheritanceChallenge1;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee emp1 = new SalariedEmployee(
                "Michael", "1997", "2024", 720.19 * 12);

        System.out.println(emp1);

        emp1.retire();
    }
}
