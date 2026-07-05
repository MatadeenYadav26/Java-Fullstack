public class TestAccount {
    static void main(String[] args) {
        BankAccount account = new BankAccount(); // object creation
        account.accountHolder="Shreya";
        account.balance=25000;

        account.displayBalance();

    }
}
