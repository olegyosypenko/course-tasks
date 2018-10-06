package ua.training;

public class Model {

    public static final String SPACE = " ";

    private StringBuilder message;

    public Model() {
        this.message = new StringBuilder();
    }


    public void addWordToOurMessage(String word) {
        this.message.append(word).append(SPACE);
    }

    public void addLastWordToOurMessage(String word) {
        this.message.append(word);
    }

    public String getMessage() {
        return this.message.toString();
    }

}
