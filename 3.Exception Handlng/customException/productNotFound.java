package customException;

public class productNotFound extends RuntimeException {

    productNotFound(String msg)
    {
    super(msg);
    }

}
