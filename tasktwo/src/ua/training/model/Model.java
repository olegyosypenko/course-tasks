package ua.training.model;

import java.util.ArrayList;
import java.util.Random;

import static ua.training.constants.Constants.*;

public class Model {


    private Random random;
    private int numberToGuess;
    private int min;
    private int max;
    private State state;
    private int countLess;
    private int countMore;
    private ArrayList<AttemptResult> attempts;

    public Model() {
        this.random = new Random();
        this.min = MIN;
        this.max = MAX;
        this.numberToGuess = this.rand(this.min + 1, this.max - 1);
        this.countLess = 0;
        this.countMore = 0;
        this.state = State.DEFAULT;
        this.attempts = new ArrayList<>();
    }

    public int rand(int min, int max) {
        return min + this.random.nextInt(max - min);
    }

    public int rand() {
        return this.rand(RAND_MIN, RAND_MAX);
    }

    public void makeNewAttempt(int number) {
        AttemptResult attemptResult;
        if (number == this.numberToGuess) {
            this.state = State.EQUAL;
        } else if (number < this.numberToGuess) {
            this.state = State.SMALLER;
            this.min = number;
            this.countLess++;
        } else {
            this.state = State.BIGGER;
            this.max = number;
            this.countMore++;
        }
        attemptResult = new AttemptResult(number, this.state);
        this.attempts.add(attemptResult);
    }

    public boolean isNumberInRange(int number) {
        return number < this.max && number > this.min;
    }

    public State getState() {
        return this.state;
    }

    public Object[] getStatistics() {
        return new Object[]{this.countLess, this.countMore};
    }

    public int getMin() {
        return this.min;
    }

    public int getMax() {
        return this.max;
    }

    public ArrayList<AttemptResult> getAttempts() {
        return this.attempts;
    }
}
