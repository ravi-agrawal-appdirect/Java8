package main.java.streams;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by raviagrawal on 13/01/17.
 */
public class StreamsClient4 {
    public static void main(String[] args) {

        //Intermediate and Terminal Operations

        Predicate<String> predicate = (s) -> {
            System.out.println("filter : " + s);
            return true;
        };

        System.out.println("************** Intermediary Operation ********************");

        Stream.of("one", "two", "three", "four", "five")
                .filter(predicate);


        System.out.println("************** Final Operation ********************");

        Stream.of("one", "two", "three", "four", "five")
                .filter(predicate)
                .forEach(s -> System.out.println("foreach : " + s));
    }
}