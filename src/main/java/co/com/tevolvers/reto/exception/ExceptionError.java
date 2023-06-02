package co.com.tevolvers.reto.exception;

public class ExceptionError extends AssertionError{

    public ExceptionError(String lbl, Throwable throwable){
        super(lbl,throwable);
    }
}
