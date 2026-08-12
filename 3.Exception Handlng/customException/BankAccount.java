package customException;

public class BankAccount {
    double balance = 5000;


//    void withdraw(double amount)

//    {
//        if(amount > balance){
//            try{
//            throw new InsufficientBalanceException("Gareeb hogye bhai aaap!");
//        }
//            catch(InsufficientBalanceException e){
//                System.out.println("You have balance lower than amount: "+ amount);
//            }
//            finally {
//                System.out.println("Transaction Closed");
//            }
//        }
//        else{
//                System.out.println("Transaction successful!");
//
//        }
//        balance = balance - amount;
//
////        System.out.println(balance);
//    }



void withdraw (double amount) throws InsufficientBalanceException {
        if(amount > balance)
        {
            throw new InsufficientBalanceException("No enough Amount");

        }
        else{
                System.out.println("Transaction successful!");

        }
        balance = balance - amount;

//        System.out.println(balance);
    }
}
