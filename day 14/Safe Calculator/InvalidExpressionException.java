import jdk.dynalink.support.AbstractRelinkableCallSite;

public class InvalidExpressionException extends RuntimeException {


    public InvalidExpressionException(String message) {
        super(message);
    }

}
