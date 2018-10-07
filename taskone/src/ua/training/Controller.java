package ua.training;

import java.util.Scanner;

public class Controller {

    public static final String EMPTY_STRING = "";

    private View view;
    private Model model;
    private Scanner scanner;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        this.scanner = new Scanner(System.in);
    }

    public void process() {
        String[] requirements = this.model.getRequirements();
        for(String requirement : requirements) {
            this.model.addWordToOurMessage(getInputEqualTo(requirement));
        }
        this.view.printMessage(this.model.getMessage());
    }

    public String getInputEqualTo(String word) {
        String input = EMPTY_STRING;
        while(!word.equals(input)) {

            this.view.askForInput(word);
            input = this.scanner.next();
            if (!input.equals(word)) {
                this.view.printErrorMessage();
            }
        }
        return input;
    }

}
