package main.java.streams;

import java.util.stream.Stream;

/**
 * Created by raviagrawal on 13/01/17.
 */
public class StreamsClient5 {
    public static void main(String[] args) {

        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("A");
                });

    }
}
