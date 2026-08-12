public class Question2 {
    static int test()
    {
        try{
            System.out.println("Try");
            int r = 10/0;
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


// exp : try , inside catch block , finally , 20; [Correct]

