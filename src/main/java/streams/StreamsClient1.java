package main.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by raviagrawal on 13/01/17.
 */
public class StreamsClient1 {
    public static void main(String[] args) {

        List<String> input = Arrays.asList("one", "two", "three");

        input
            .stream()
            .forEach(s -> System.out.println(s));

        System.out.println();

        input
                .stream()
                .forEach(System.out::println);

        System.out.println();

        Consumer<String> consumer = System.out::println;
        input
                .stream()
                .forEach(consumer);
    }
}