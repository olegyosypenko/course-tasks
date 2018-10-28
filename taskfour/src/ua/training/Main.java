package ua.training;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class Main{
    public static void main(String ... strs) throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Student std = new Student("fds", 12, 23);
        changePrivateField(std);
        invokeMethodsWithAnnotation(std);
    }

    public static void changePrivateField(Object cc) throws NoSuchFieldException, IllegalAccessException {
        Class<?> clazz = Student.class;
        Field f1 = cc.getClass().getDeclaredField("name");
        f1.setAccessible(true);
        f1.set(cc, "ref");
    }

    public static void invokeMethodsWithAnnotation(Object cc) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> clazz = Student.class;
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            Annotation[] annotations = m.getAnnotations();
            for (Annotation a : annotations) {
                if (a.annotationType().getSimpleName().equals(CustomAnnotation.class.getSimpleName())) {
                    m.setAccessible(true);
                    m.invoke(cc);
                }
            }
        }
    }
}
