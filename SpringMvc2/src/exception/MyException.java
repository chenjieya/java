package exception;

public class MyException extends RuntimeException{

    private String message;

    public MyException() {}
    public MyException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
