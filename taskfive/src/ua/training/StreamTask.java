package ua.training;

import java.util.Arrays;
import java.util.List;

public class StreamTask {
    public static void main(String[] strs) {
        List<Integer> list = Arrays.asList(1, -2, 0, 8, -6, 2, 6);
        double d = list.stream().mapToInt(b->b).average().getAsDouble();
        long amountEqualsZero = list.stream().filter( i1 -> i1 == 0 ).count();
        long amountGreaterThanZero = list.stream().filter( i1 -> i1 > 0 ).count();
        System.out.println(list);
        System.out.println(d);
        list.stream().forEach(i -> {
            if (i.equals(list.stream().min((i1, i2) -> i1 - i2).get())) {
                System.out.println("Value i = " + i + ", index = " + list.indexOf(i));
            }
        });
        System.out.println("Number of zero: " + amountEqualsZero);
        System.out.println("Number of greater than zero: " + amountGreaterThanZero);
        System.out.println(Arrays.toString(list.stream().map(i1 -> i1 * 5).toArray()));
    }
}
