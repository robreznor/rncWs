package cl.minsal.api.ws.validator;

public class ValidationException  extends RuntimeException {
    String code;

    public String getCode() {
        return code;
    }

    public ValidationException(String errorMessage, String code) {
        super(errorMessage);
        this.code = code;
    }
}