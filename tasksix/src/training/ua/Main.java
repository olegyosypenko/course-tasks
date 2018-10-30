package training.ua;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 7, -5, 4, 1, 7, 0, 7, 1, -5};
        System.out.println(getNumberOfSame(arr));
        System.out.println(getNumberOfSameStream(arr));
    }
    public static Map<Integer, Integer> getNumberOfSame(Integer[] arr) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i : arr) {
            if (result.containsKey(i)) {
                result.put(i, result.get(i) + 1);
            }
            else {
                result.put(i, 1);
            }
        }
        return result;
    }
    public static Map<Integer, Integer> getNumberOfSameStream(Integer[] arr) {
        Map<Integer, Integer> result = new HashMap<>();
        Stream.of(arr).forEach(i -> {
            if (result.containsKey(i)) {
                result.put(i, result.get(i) + 1);
            }
            else {
                result.put(i, 1);
            }

        });
        return result;
    }
}
