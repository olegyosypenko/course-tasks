package ua.training;

public class Main {

    public static void main(String[] strs) {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(view, model);
        controller.process();
    }
}
