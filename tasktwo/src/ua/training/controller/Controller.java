package ua.training.controller;

import ua.training.model.Model;
import ua.training.model.State;
import ua.training.view.View;

import java.util.Scanner;

public class Controller {

    private View view;
    private Model model;
    private Scanner scanner;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        this.scanner = new Scanner(System.in);
    }


    public void startGame() {
        this.view.showAttempts(this.model.getAttempts());
        int number = getNumber();

        while (true) {

            if (this.model.isNumberInRange(number)) {
                this.model.makeNewAttempt(number);
                this.view.showAttempts(this.model.getAttempts());
            } else {
                this.view.printNumberOutOfRangeError();
            }
            if (this.model.getState() != State.EQUAL) {
                number = getNumber();
            } else {
                break;
            }
        }
        this.view.printMessage(this.model.getState().toString());
        this.view.showStatistic(this.model.getStatistics());
    }

    private int getNumber() {
        this.view.askForInput(this.model.getMin(), this.model.getMax());
        if (!this.model.getState().toString().isEmpty()) {
            this.view.printMessage(this.model.getState().toString());
        }
        while (!this.scanner.hasNextInt()) {
            this.view.printStringInputError();
            this.view.askForInput(this.model.getMin(), this.model.getMax());
            this.scanner.next();
        }
        return this.scanner.nextInt();
    }
}
