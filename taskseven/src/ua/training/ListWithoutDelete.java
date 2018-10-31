package ua.training;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;

public class ListWithoutDelete<E> extends ArrayList<E> {
    public E remove(int index) {
        throw new RuntimeException();
    }
    public boolean remove(Object o) {
        throw new RuntimeException();
    }
}
