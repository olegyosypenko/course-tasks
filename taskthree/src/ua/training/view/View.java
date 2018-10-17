package ua.training.view;


public class View {
    public static final String ERROR_MESSAGE = "You entered wrong input. Please, try again!";
    public static final String ASK_FOR_INPUT = "Enter ";

    /**
     * Prints to console error message.
     */
    public void printErrorMessage() {
        System.out.println(ERROR_MESSAGE);
    }

    /**
     * Prints ASK_FOR_INPUT with word.
     * @param word
     */
    public void askForInput(String word) {
        System.out.println(ASK_FOR_INPUT + word);
    }

    /**
     * Prints message to console.
     * @param message
     */
    public void printMessage(String message) {
        System.out.println(message);
    }
}
