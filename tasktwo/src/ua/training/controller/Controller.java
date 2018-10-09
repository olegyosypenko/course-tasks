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


    public void gameLoop() {
        while (this.model.getState() != State.EQUAL) {
            int number = getNumber();
            if (this.model.isNumberInRange(number)) {
                this.view.printNumberOutOfRangeError();
            } else {
                this.model.makeNewAttempt(number);
                this.view.printMessage(this.model.getState().toString());
            }
        }
        this.view.showStatistic(this.model.getStatistics());
        this.view.showAttempts(this.model.getAttempts());
    }

    private int getNumber() {
        this.view.askForInput(this.model.getMin(), this.model.getMax());
        boolean hasNextInt = false;
        while (!hasNextInt) {
            hasNextInt = this.scanner.hasNextInt();
            if (!hasNextInt) {
                this.view.printStringInputError();
                this.view.askForInput(this.model.getMin(), this.model.getMax());
                this.scanner.next();
            }
        }
        return this.scanner.nextInt();
    }
}
