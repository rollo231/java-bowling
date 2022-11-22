package bowling.exception;

public class CannotCalculateException extends RuntimeException {
    private static final String MESSAGE = "계산할 수 없습니다.";

    public CannotCalculateException() {
        super(MESSAGE);
    }
}
