package exceptions;

public class AlcoholNotFound extends RuntimeException {

    public AlcoholNotFound() {
        super("Alcohol not found");
    }
}
