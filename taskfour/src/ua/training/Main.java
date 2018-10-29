package ua.training;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;

public class Main{
    public static void main(String ... strs) throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Student std = new Student("fds", 12, 23);
        changePrivateField(std);
        invokeMethodsWithAnnotation(std);
        printClassName(DiplomaStudent.class);
        printMethodsAndModifiers(DiplomaStudent.class);
        printSuperClassName(DiplomaStudent.class);
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

    public static void printClassName(Class<?> clazz) {
        System.out.println(clazz.getName());
    }

    public static void printMethodsAndModifiers(Class<?> clazz) {
        for (Method m : clazz.getDeclaredMethods()) {
            System.out.println(m.toString());
        }
    }

    public static void printSuperClassName(Class<?> diplomaStudentClass) {
        System.out.println(diplomaStudentClass.getSuperclass().getName());
    }
}
