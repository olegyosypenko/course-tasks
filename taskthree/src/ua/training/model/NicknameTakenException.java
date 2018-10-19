package ua.training.model;

public class NicknameTakenException extends RuntimeException {
    public NicknameTakenException() {
        super("This nickname is taken, please choose another");
    }
}
