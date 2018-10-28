package ua.training;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class Main{
    public static void main(String ... strs) throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Student std = new Student("fds", 12, 23);
        changePrivateField(std);
    }

    public static void changePrivateField(Object cc) throws NoSuchFieldException, IllegalAccessException {
        Class<?> clazz = Student.class;
        Field f1 = cc.getClass().getDeclaredField("name");
        f1.setAccessible(true);
        f1.set(cc, "ref");
    }

}
