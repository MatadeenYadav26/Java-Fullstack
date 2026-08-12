public class finallyDemo {
    static void main(String[] args) {
        try {
            int res = 10/2;
            System.out.println(res);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception.");
        }
        finally {
        System.out.println("Done");
        }
    }
}
