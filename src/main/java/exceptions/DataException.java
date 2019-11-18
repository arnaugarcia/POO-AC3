package exceptions;

public class DataException extends RuntimeException {

    public DataException() {
        super("Data cannot be loaded");
    }
}
