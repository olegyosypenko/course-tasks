package ua.training.controller;

import ua.training.model.Entity;
import ua.training.model.Group;
import ua.training.view.View;

import java.util.Scanner;

public class Controller implements RegularExpressions, Constants {
    private View view;
    private Entity entity;
    private Scanner scanner;

    public Controller(View view, Entity entity) {
        this.view = view;
        this.entity = entity;
        this.scanner = new Scanner(System.in);
    }

    private void createEntity() {
        String firstName = getInputThatMatches(FIRST_NAME_REGULAR_EXPRESSION, FIRST_NAME_REQUEST);
        String lastName = getInputThatMatches(LAST_NAME_REGULAR_EXPRESSION, LAST_NAME_REQUEST);
        String phoneNumber = getInputThatMatches(MOBILE_PHONE_REGULAR_EXPRESSION, MOBILE_PHONE_REQUEST);
        String group = getInputThatMatches(Group.getRegular(), GROUP_REQUEST);
        String nickname = getInputThatMatches(NICKNAME_REGULAR_EXPRESSION, NICKNAME_REQUEST);
        String email = getInputThatMatches(EMAIL_REGULAR_EXPRESSION, EMAIL_REQUEST);
        String lastChangeDate = getInputThatMatches(LAST_CHANGE_DATE_REGULAR_EXPRESSION, LAST_CHANGE_DATE_REQUEST);

        this.entity.initEntity(firstName, lastName, phoneNumber, group, nickname, email, lastChangeDate);

    }

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
    private boolean isAGroup(String group) {
        try {
            Group.valueOf(group);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void processUser() {
        this.createEntity();
        this.view.printMessage(this.entity.toString());
    }
}
