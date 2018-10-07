package ua.training;

public class Model {

    public static final String SPACE = " ";
    public static final String EXCLAMATION_MARK = "!";
    public static final String HELLO = "Hello";
    public static final String WORLD = "world";

    private StringBuilder message;
    private String[] requirements;

    public Model() {
        this.message = new StringBuilder();
        this.requirements = {HELLO, WORLD};
    }


    public void addWordToOurMessage(String word) {
        this.message.append(word).append(SPACE);
    }

    public void addLastWordToOurMessage(String word) {
        this.message.append(word).append(EXCLAMATION_MARK);
    }

    public String getMessage() {
        return this.message.toString();
    }

    public String[] getRequirements() {
        return this.requirements;
    }
}
