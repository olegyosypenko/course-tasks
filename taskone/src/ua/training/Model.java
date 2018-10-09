package ua.training;

public class Model {

    public static final String SPACE = " ";
    public static final String HELLO = "Hello";
    public static final String WORLD = "world";
    public static final String EXCLEMATION_MARK = "!";

    private StringBuilder message;
    private String[] requirements;

    public Model() {
        this.message = new StringBuilder();
        this.requirements = new String[]{HELLO, WORLD};
    }


    public void addWordToOurMessage(String word) {
        if (message.length() == 0) {
            this.message.append(word);
        } else {
            this.message.append(SPACE).append(word);
        }
    }

    public void finishMessage() {
        this.message.append(EXCLEMATION_MARK);
    }

    public String getMessage() {
        return this.message.toString();
    }

    public String[] getRequirements() {
        return this.requirements;
    }
}
