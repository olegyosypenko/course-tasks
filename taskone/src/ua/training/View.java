package ua.training;

public class View {

    public static final String ERROR_MESSAGE = "You entered wrong input. Please, try again!";
    public static final String ASK_FOR_INPUT = "Enter ";

    public void printErrorMessage() {
        System.out.println(ERROR_MESSAGE);
    }

    public void askForInput(String word) {
        System.out.println(ASK_FOR_INPUT + word);
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

}
