package ConstructorsChallenge;

public class CreditAccount {

    private final String name;
    private final String email;
    private final int creditLimit;

    public CreditAccount() {
        this("N/A", "N/A", 10000);
    }

    public CreditAccount(
            String name, String email
    ) {
        this(name, email, 10000);
    }

    public CreditAccount(
            String name, String email, int creditLimit
    ) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getCreditLimit() {
        return creditLimit;
    }
}
