package ua.training.model;
import static ua.training.constants.Constants.*;

public enum State {
    DEFAULT {
        @Override
        public String toString() {
            return EMPTY_STRING;
        }
    },
    SMALLER {
        @Override
        public String toString() {
            return SMALLER_MESSAGE;
        }
    },
    BIGGER {
        @Override
        public String toString() {
            return BIGGER_MESSAGE;
        }
    },
    EQUAL {
        @Override
        public String toString() {
            return CONGRATS;
        }
    }
}
