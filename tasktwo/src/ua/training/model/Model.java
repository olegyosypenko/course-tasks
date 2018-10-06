package ua.training.model;

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

    public Model() {
        this.random = new Random();
        this.numberToGuess = this.rand();
        this.min = MIN;
        this.max = MAX;
        this.countLess = 0;
        this.countMore = 0;
    }

    private int rand(int min, int max) {
        max++;
        return min + this.random.nextInt(max - min);
    }

    private int rand() {
        return this.rand(RAND_MIN, RAND_MAX);
    }

    public void makeNewAttempt(int number) {
        if(number == numberToGuess) {
           this.state = State.WIN;
        } else if(number < this.numberToGuess) {
            this.min = ++number;
            this.state = State.LESS;
            this.countLess++;
        } else {
            this.max = --number;
            this.state = State.MORE;
            this.countMore++;
        }
    }

    public boolean isNumberInRange(int number) {
        return number > this.max || number < this.min;
    }

    public State getState() {
        return this.state;
    }

    public Object[] getStatistics() {
        return new Object[]{this.countLess, this.countMore};
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
