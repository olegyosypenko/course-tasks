package ua.training.view;

import static ua.training.constants.Constants.*;

public class View {

    private void printError(String message) {
        System.err.println(message);
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void printStringInputError() {
        this.printError(STRING_INPUT_ERROR);
    }
    public void printNumberOutOfRangeError() {
        this.printError(OUT_OF_RANGE_ERROR_MESSAGE);
    }

    public void askForInput(int min, int max) {
        System.out.printf(REQUEST_FOR_INPUT, min, max);
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void showStatistic(Object[] objects) {
        System.out.printf(MESSAGE_TO_SHOW_STATISTIC, objects);
    }
}
