public class Question3 {
    static int test()
    {
        try{
            System.out.println("Try");
//            int r = 10/0;
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
            return 30;
        }

//      return 40;  why is this line not allowed ?? : coz ye line un reachable code hai! as above 3eeno blocks me  return codes run hojayege and is return  tak koi output leke hi nhi jayega!

    }


    public static void main(String[] args) {
        int res = test();
        System.out.println("Result: "+res);
    }

}



// OP : try , finally , 30
// OP : try , finally , 10 , 30  // ye nahi aya coz finally humeshsa run krke update kardega , coz end block jarur chalega and ye lst wale return block ko override kar deta hai!
