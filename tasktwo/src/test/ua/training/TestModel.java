package test.ua.training;

import org.junit.Test;
import ua.training.model.Model;
import ua.training.model.State;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestModel {
    @Test
    public void testIsNumberInRange() {
        Model model = new Model();
        boolean b = model.isNumberInRange(50);
        assertEquals(true, b);
    }
    @Test
    public void testGetMax() {
        Model model = new Model();
        assertEquals(100, model.getMax());
    }
    @Test
    public void testGetMin() {
        Model model = new Model();
        assertEquals(0, model.getMin());
    }
    @Test
    public void testGetMinAndMakeAttempt() {
        Model model = new Model();
        model.makeNewAttempt(1);
        assertEquals(1, model.getMin());
    }
    @Test
    public void testGetAttempts() {
        Model model = new Model();
        model.makeNewAttempt(1);
        model.makeNewAttempt(2);
        assertEquals(2, model.getAttempts().size());
    }
    @Test
    public void testGetStatistic() {
        Model model = new Model();
        int countSmaller = 0;
        model.makeNewAttempt(1);
        if (model.getState() == State.SMALLER) {
            countSmaller++;
        }
        model.makeNewAttempt(2);
        if (model.getState() == State.SMALLER) {
            countSmaller++;
        }
        Object[] o = model.getStatistics();
        assertEquals(countSmaller, o[0]);
    }
    @Test
    public void testRand() {
        Model model = new Model();
        int countOutOfBounds = 0;
        int min = 0;
        int max = 100;
        for (int i = 0; i < 1000; i++) {
            int randInt = model.rand(min, max);
            if (randInt < min || randInt > max) {
                countOutOfBounds++;
            }
        }

        assertEquals(0, countOutOfBounds);
    }
}
