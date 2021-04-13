
public class YourFirstAccount {

    public static void main(String[] args) {
        Account chrisAccount = new Account("Chris' account", 100.0);

        chrisAccount.deposit(20.0);
        System.out.println(chrisAccount);
        //System.out.println("The balance of Chris' account is: " + chrisAccount.saldo());
    }
}
