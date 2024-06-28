package ConstructorsChallenge;

public class Main {
    public static void main(String[] args) {
        CreditAccount account1 = new CreditAccount();
        CreditAccount account2 = new CreditAccount(
                "Michael Milad", "michaelmilad001@gmail.com");
        CreditAccount account3 = new CreditAccount(
                "John Smith", "john_smith12@hotmail.com", 30000);

        printStats(account1.getName(), account1.getEmail(),
                account1.getCreditLimit()
        );

        printStats(account2.getName(), account2.getEmail(),
                account2.getCreditLimit()
        );

        printStats(account3.getName(), account3.getEmail(),
                account3.getCreditLimit()
        );
    }

    private static void printStats(
            String name, String email, int limit
    ) {
        System.out.println(
                "User: " + name + " and Email: " + email + " Has a credit " + "limit of: " + limit);
    }
}
