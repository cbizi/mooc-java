
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account Matthew = new Account("Matthews account", 1000);
        Account myAccount = new Account("My account", 0);
        Matthew.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(Matthew + " " + myAccount);
    }
}
