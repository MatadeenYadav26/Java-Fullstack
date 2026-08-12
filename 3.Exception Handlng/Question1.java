public class Question1 {
    static int test()
    {
        try{
            System.out.println("Try");
            return 10;
        }
        catch (Exception e)
        {
            System.out.println("Inside Catch block");
            return 20;
        }
        finally
        {
            System.out.println("finally");
        }
    }


    public static void main(String[] args) {
        int res = test();
        System.out.println("Result: "+res);
    }

}



// OP : expected tha, try , catch 10 , finally : wrong as it goes like , try if error then catch , with return value at end and finally  at finally block.
// so aya apna : try , finally , 10.


