package main.java.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by raviagrawal on 12/01/17.
 */
public class FunctionsClient6 {
    public static void main(String[] args) {

        //Consumer
        Consumer<String> consumer1 = (s) -> System.out.println(s);
        consumer1.accept("Consuming message...");

        //Predicate
        Predicate<Integer> predicate = (i) -> i > 0;
        if(predicate.test(1)) System.out.println("Predicate test case passed");

        //Supplier
        Supplier<Integer> supplier = () -> 2;
        System.out.println("Supplier gives us : " + supplier.get());

        //Function
        Function<Integer, Float> function = (i) -> (float) i;
        System.out.println("Applying function to get : " + function.apply(5));

        //BiFunction, UnaryOperator, BinaryOperator
    }
}
