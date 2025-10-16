package lang;

//Exception : 컴파일 예외 발생
//RuntimeException : 실행 시 예외 발생

// public class BalanceInsufficientException extends Exception {
//     public BalanceInsufficientException() {
//     }

//     public BalanceInsufficientException(String message) {
//         super(message);
//     }

// }

public class BalanceInsufficientException extends RuntimeException {
    public BalanceInsufficientException() {
    }

    public BalanceInsufficientException(String message) {
        super(message);
    }

}