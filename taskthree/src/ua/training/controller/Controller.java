package ua.training.controller;

public class Controller implements RegularExpressions, Constants {


    public void createEntity() {
        String firstName = getInputThatMatches(FIRST_NAME_REGULAR, FIRST_NAME_REQUEST);
        String lastName;
        String phoneNumber;


    }

    public String getInputThatMatches(String regularExpression, String messageToAsk) {
        String input = EMPTY_STRING;
        while (!input.matches(regularExpression)) {
            this.view.askForInput(messageToAsk);
            input = this.scanner.next();
            if (!input.matches(regularExpression)) {
                this.view.printErrorMessage();
            }
        }
        return input;
    }

}
