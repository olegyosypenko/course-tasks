package ua.training;

import ua.training.controller.Controller;
import ua.training.model.Entity;
import ua.training.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Entity entity = new Entity();
        Controller controller = new Controller(view, entity);
        controller.processUser();
    }
}
