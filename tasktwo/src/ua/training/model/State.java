package ua.training.model;
import static ua.training.constants.Constants.*;

public enum State {
    LESS {
        @Override
        public String toString() {
            return LESS_RESULT;
        }
    },
    MORE {
        @Override
        public String toString() {
            return BIGGER_RESULT;
        }
    },
    WIN {
        @Override
        public String toString() {
            return CONGRATS;
        }
    }
}
