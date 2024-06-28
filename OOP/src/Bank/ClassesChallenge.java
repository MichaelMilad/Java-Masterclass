package Bank;

public class ClassesChallenge {
    public static void main(String[] args) {
        try {
            Account myAccount = new Account(
                    "ACC_FTP12fx",
                    "cus_12PXFfA",
                    "michaelmilad001@gmail.com",
                    "01068595906",
                    1000
            );

            Account myAccount2 = new Account();

            System.out.println(myAccount.getCustomerName());
            System.out.println(myAccount.getAccountBalance());

            myAccount.deposit(23);
            System.out.println(myAccount.getAccountBalance());

            myAccount.withdraw(8.4);
            System.out.println(myAccount.getAccountBalance());

            myAccount.withdraw(200);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
