package main.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by raviagrawal on 13/01/17.
 */
public class StreamsClient6 {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        int res1 = list1.stream()
                .reduce(0, (i1, i2) -> i1 + i2); //.reduce(0, Integer::sum);
        System.out.println(res1);
        System.out.println("*****************************");

        List<Integer> list2 = Arrays.asList(1, 2, 3);
        Optional<Integer> res2 = list2.stream()
                .reduce(Integer::max);
        System.out.println(res2);
        System.out.println("*****************************");

        List<Integer> list3 = Arrays.asList(-1, -2, -3);
        Integer res3 = list3.stream()
                .reduce(0, Integer::max);
        System.out.println(res3);
        System.out.println("*****************************");

        List<Integer> list4 = Arrays.asList();
        Optional<Integer> res4 = list4.stream()
                .reduce(Integer::max);
        System.out.println(res4);
        System.out.println("*****************************");

        List<Integer> list5 = Arrays.asList();
        Optional<Integer> res5 = list5.stream()
                .reduce(Integer::max);
        System.out.println(res5.orElse(100));
        System.out.println("*****************************");
    }
}
