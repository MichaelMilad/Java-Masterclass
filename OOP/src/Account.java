public class Account {
    private String accountNumber;
    private String customerName;
    private String email;
    private String phoneNumber;
    private double accountBalance;

    public Account(
            String accountNumber,
            String customerName,
            String email,
            String phoneNumber,
            double accountBalance
    ) {
        this.accountNumber = accountNumber;
        this.customerName = customerName.isEmpty() ? "N/A" : customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.accountBalance = accountBalance;
    }

    public Account() {
        this(
                "N/A",
                "N/A",
                "N/A",
                "N/A",
                00.00
        );
        System.out.println("Constructor has been invoked !!");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double deposit(double amount) {
        return this.accountBalance += amount;
    }

    public double withdraw(double amount) throws Exception {
        if (amount > this.accountBalance) {
            throw new Exception("Insufficient Funds");
        }
        return this.accountBalance -= amount;
    }
}
