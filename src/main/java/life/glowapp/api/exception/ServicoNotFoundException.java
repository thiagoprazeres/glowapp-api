package life.glowapp.api.exception;

public class ServicoNotFoundException extends RuntimeException {
    public ServicoNotFoundException(String message) {
        super(message);
    }
}
