package Encapsulation;

public class Test {
    static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(70000);

        System.out.println(bankAccount.getBalance());

        // here balance is private , outside class cannot be changed.money cn be added only through deposit().

    }
}
