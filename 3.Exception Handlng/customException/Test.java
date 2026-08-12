package customException;

public class Test {
    static void main(String[] args) {

        productService service = new productService();

        try{
            service.findProduct(300); //production grade code! eg: movie not available in zone A but in zone B.
        }
        catch (productNotFound e){
            System.out.println(e.getMessage());
        }

    }
}
