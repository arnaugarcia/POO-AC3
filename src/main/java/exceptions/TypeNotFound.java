package exceptions;

public class TypeNotFound extends RuntimeException {

    public TypeNotFound() {
        super("Type not found");
    }
}
