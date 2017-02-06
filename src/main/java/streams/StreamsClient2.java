package main.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by raviagrawal on 13/01/17.
 */
public class StreamsClient2 {
    public static void main(String[] args) {

        List<String> input = Arrays.asList("one", "two", "three");
        List<String> result = new ArrayList<>();

        Consumer<String> printInputListConsumer = System.out::println;
        Consumer<String> addToResultListConsumer = result::add; //Consumer<String> addToResultListConsumer = s -> result.add(s);

        input
                .stream()
                .forEach(printInputListConsumer.andThen(addToResultListConsumer));
        System.out.println(result);

    }
}