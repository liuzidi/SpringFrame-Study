package lzd.bankTransaction.exp;

/**
 * @author:liuzidi
 * @Description:
 */
public class NoGoodsException extends RuntimeException{
    public NoGoodsException() {
        super();
    }

    public NoGoodsException(String message) {
        super(message);
    }
}
