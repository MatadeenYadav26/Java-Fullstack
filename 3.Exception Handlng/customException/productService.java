package customException;

public class productService {
    void findProduct(int productId)
    {
        if(productId != 101)
        {
            //exception
            throw new productNotFound("productId not found");
        }
        System.out.println("product found");
    }
}
