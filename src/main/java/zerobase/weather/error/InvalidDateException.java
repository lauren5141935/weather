package zerobase.weather.error;

public class InvalidDateException extends RuntimeException {
    private static final String MESSAGE = "너무 과거 혹은 미래의 날짜입니다.";

    public InvalidDateException() {
        super(MESSAGE);
    }
}