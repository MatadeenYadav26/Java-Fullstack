import java.util.InputMismatchException;
import java.util.Scanner;

public class UnChecked02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter age: ");
//        int age = sc.nextInt(); // if age is string , then inpput mis match exception , so , we will put risky code into the block.
//        System.out.println(age);

        try{
            System.out.println("Enter Age: ");
            int age = sc.nextInt();
            System.out.println("Age: " + age);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input.");
        }

    }
}
