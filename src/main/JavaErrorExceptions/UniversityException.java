public class UniversityException extends Exception {

    public UniversityException() {
    }

    public UniversityException(String message) {
        super("Error: " + message);
    }

    public UniversityException(String message, Throwable cause) {
        super("Error: " + message, cause);
    }

    public UniversityException(Throwable cause) {
        super(cause);
    }
}
