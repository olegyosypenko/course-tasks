package ua.training.controller;

import ua.training.model.Group;
import ua.training.model.Model;
import ua.training.model.NicknameTakenException;
import ua.training.view.View;

import java.util.Scanner;

public class Controller implements RegularExpressions, Constants {
    private View view;
    private Model model;
    private Scanner scanner;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Creates entity and prints to console.
     */
    public void processUser() {
        this.getAllDataForEntity();
        this.view.printMessage(this.model.getEntities().get(0).toString());
    }

    private void getAllDataForEntity() {
        String firstName = getInputThatMatches(FIRST_NAME_REGULAR_EXPRESSION, FIRST_NAME_REQUEST);
        String lastName = getInputThatMatches(LAST_NAME_REGULAR_EXPRESSION, LAST_NAME_REQUEST);
        String phoneNumber = getInputThatMatches(MOBILE_PHONE_REGULAR_EXPRESSION, MOBILE_PHONE_REQUEST);
        String group = getInputThatMatches(Group.getRegular(), GROUP_REQUEST);
        String nickname = getInputThatMatches(NICKNAME_REGULAR_EXPRESSION, NICKNAME_REQUEST);
        String email = getInputThatMatches(EMAIL_REGULAR_EXPRESSION, EMAIL_REQUEST);
        String lastChangeDate = getInputThatMatches(LAST_CHANGE_DATE_REGULAR_EXPRESSION, LAST_CHANGE_DATE_REQUEST);
        this.tryToCreateEntity(firstName, lastName, phoneNumber, group, nickname, email, lastChangeDate);
    }
    private void tryToCreateEntity(String firstName, String secondName, String phone, String group, String nickname,
                                   String email, String date) {
        while (true) {
            try {
                this.model.addEntity(firstName, secondName, phone, group, nickname, email, date);
                break;
            } catch (NicknameTakenException e) {
                System.out.println(e.getMessage());
                nickname = getInputThatMatches(NICKNAME_REGULAR_EXPRESSION, NICKNAME_REQUEST);
            }
        }
    }

    /**
     * This function returns string entered in console by user which matches with regularExpression.
     * @param regularExpression
     * @param requestMessage
     * @return
     */
    private String getInputThatMatches(String regularExpression, String requestMessage) {
        String input = EMPTY_STRING;
        while (!input.matches(regularExpression)) {
            this.view.askForInput(requestMessage);
            input = this.scanner.next();
            if (!input.matches(regularExpression)) {
                this.view.printErrorMessage();
            }
        }
        return input;
    }
}
