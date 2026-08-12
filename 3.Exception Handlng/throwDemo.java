import java.util.Scanner;

public class throwDemo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Age: ");
        int age = sc.nextInt();

        if (age < 18) {
            try{
                System.out.println("inside try: ");
                throw new ArithmeticException("Age must be above 18.");
            }
            catch (ArithmeticException e){
                System.out.println("catch block ka error");
            }
        }
        System.out.println("done");
    }
}
