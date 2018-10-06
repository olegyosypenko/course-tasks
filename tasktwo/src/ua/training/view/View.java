package ua.training.view;

import static ua.training.constants.Constants.*;

public class View {


    public void printErrorMessage() {
        System.err.println(ERROR_MESSAGE);
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void printNumberOutOfRangeError() {

        System.err.println(OUT_OF_RANGE_ERROR_MESSAGE);
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
