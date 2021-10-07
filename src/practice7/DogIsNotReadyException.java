package practice7;

public class DogIsNotReadyException extends Throwable {
    public DogIsNotReadyException(String message) {
        super(message);
    }
}
