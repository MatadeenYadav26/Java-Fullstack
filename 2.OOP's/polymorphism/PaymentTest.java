package Polymorphism;

class Payment {
    void pay(){
        System.out.println("Generic Payment");
    }
}

class upiPayment extends Payment {
    @Override
    void pay(){
        System.out.println("Upi Payment");
    }
    void hello(){
        System.out.println("hello");
    }
}

public class PaymentTest {
    static void main(String[] args) {
        Payment payment = new Payment();
        payment.pay();

        upiPayment upiPayment = new upiPayment();
        upiPayment.pay();
        upiPayment.hello();

        //Parent refrence can hold child refrence.
        Payment parent = new upiPayment();
        parent.pay();

    }

}
