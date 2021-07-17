package lzd.bankTransaction.exp;

/**
 * @author:liuzidi
 * @Description:
 */
public class NotExistGoodException extends RuntimeException{
    public NotExistGoodException() {
        super();
    }

    public NotExistGoodException(String message) {
        super(message);
    }

}
