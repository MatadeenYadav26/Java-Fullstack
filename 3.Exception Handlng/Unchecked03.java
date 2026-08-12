public class Unchecked03 {
    public static void main(String[] args) {

//        int arr[]  = new int [-5];  //hypothetical error btw , risky code
//        System.out.println(arr.length);

        try{
            int arr[] = new int[-5];
            System.out.println(arr.length);
        }
        catch (NegativeArraySizeException e){
            System.out.println("Array Size cannot be Negative.");
        }


    }

}
