package ua.training;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask {
    public static void main(String[] strs) {
        List<Integer> list = Arrays.asList(1, -2, 0, 8, -6, 2, 6);
        double d = list.stream().mapToInt(b->b).average().getAsDouble();
        long amountEqualsZero = list.stream().filter( i1 -> i1 == 0 ).count();
        long amountGreaterThanZero = list.stream().filter( i1 -> i1 > 0 ).count();
        Map.Entry entry = IntStream.range(0, list.size()).boxed()
                .collect(Collectors.toMap(Function.identity(), list::get))
                .entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getValue)).findFirst().get();
        int min = (int) entry.getValue();
        int index = (int) entry.getKey();
        System.out.println("Source array: " + list);
        System.out.println("average = " + d);
        System.out.println("Number of zero: " + amountEqualsZero);
        System.out.println("Number of greater than zero: " + amountGreaterThanZero);
        System.out.println("Value i = " + min + ", index = " + index);
        System.out.println("Multiplied array: " + Arrays.toString(list.stream().map(i1 -> i1 * 5).toArray()));
    }
}
