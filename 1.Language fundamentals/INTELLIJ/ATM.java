public class ATM {

    double balance;

    void withdraw(double amount)
    {
        if(amount >= balance){
            balance -= amount;
            System.out.println("Withdraw Successful");
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.balance = 3000;

        atm.withdraw( 1000.0);

        System.out.println("Remaining Balance: "+ atm.balance);

    }

}
