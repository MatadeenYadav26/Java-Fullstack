public class Flow {
    static void main(String[] args) {
        try {
            System.out.println("Line-1");
            System.out.println(10/0);
            System.out.println("Line-2"); // ye ayega hi nahi as , exception k baad k codes nhi chalte in general and try me bhi same.
            //then voswitch hoke catch se exit hojayega!
        }
//        catch (ArithmeticException e) {
//            System.out.println("ArithemeticException Handled");
//        }
//        catch (RuntimeException e) {
//            System.out.println("Runtime Exception Handled");
//        }
        catch (Exception e) {
            System.out.println("Exception Handled");
        }

        System.out.println("Line-3");
    }
}
