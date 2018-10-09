package ua.training.view;

import ua.training.model.AttemptResult;
import ua.training.model.State;

import java.util.ArrayList;

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
        this.printError(STRING_INPUT_ERROR_MESSAGE);
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

    public void showAttempts(ArrayList<AttemptResult> attempts) {
        for (AttemptResult attempt : attempts) {
            String result;
            if (attempt.getAttemptState().equals(State.EQUAL)) {
                result = attempt.getAttemptState().name().toLowerCase() + TO;
            } else {
                result = attempt.getAttemptState().name().toLowerCase() + THAN;
            }
            System.out.printf(MESSAGE_TO_SHOW_ATTEMPT, attempt.getNumber(), result);
        }
    }
}
