public class TryCatch {
    static void main(String[] args) {
        try{
            int res = 10/0;
            // ye line me ek exception ayegi , jvm iska ek object banayega aur handling code me push kardega ie. TryCatch mein.

        }
        catch (ArithmeticException e){ // aur isme pass karega
            System.out.println("Invalid Division");
//            e.printStackTrace(); // ye code hai to print the actual error
            System.out.println(e.getMessage());
        }
        System.out.println("Program Completed");
    }
}
