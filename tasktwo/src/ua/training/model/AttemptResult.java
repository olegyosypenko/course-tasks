package ua.training.model;

public class AttemptResult {
    private int number;
    private State attemptState;

    public AttemptResult(int number, State attemptState) {
        this.number = number;
        this.attemptState = attemptState;
    }

    public int getNumber() {
        return this.number;
    }

    public State getAttemptState() {
        return this.attemptState;
    }
}
