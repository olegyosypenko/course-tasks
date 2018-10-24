package ua.training;

import java.util.Arrays;
import java.util.List;

public class StreamTask {
    public static void main(String[] strs) {
        List<Integer> list = Arrays.asList(1, -2, 0, 8, -6, 2, 6);
        double d = list.stream().mapToInt(b->b).average().getAsDouble();
        int i = list.stream().mapToInt(b->b).sum();
        list.stream().mapToInt(i1 -> i1);
        long amountGreaterThanZero = list.stream().filter( i1 -> i1 > 0 ).count();
        long amountEqualsZero = list.stream().filter( i1 -> i1 == 0 ).count();
        System.out.println(list);
        System.out.println(d);
        System.out.println(i);
        System.out.println(amountGreaterThanZero);
        System.out.println(amountEqualsZero);

    }
}
