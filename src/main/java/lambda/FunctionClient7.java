package main.java.lambda;

import java.util.function.Function;

import main.java.utils.Utils;

/**
 * Created by raviagrawal on 12/01/17.
 */
public class FunctionClient7 {
    public static void main(String[] args) {

        Function<Integer, Integer> function1 = (i) -> i+1;
        System.out.println(function1.apply(10));

        Function<Integer, Integer> function2 = (i) -> Utils.add1(i);
        System.out.println(function2.apply(20));

        Function<Integer, Integer> function3 = Utils::add1;
        System.out.println(function3.apply(30));

        Function<Integer, Function<Integer,Integer>> makeAdder1 = Utils::adder;
        Function<Integer,Integer> add1 = makeAdder1.apply(1);
        System.out.println(add1.apply(40));
        Function<Integer,Integer> add2 = makeAdder1.apply(2);
        System.out.println(add2.apply(40));

        Function<Integer, Function<Integer,Integer>> makeAdder3 = x -> y -> x + y;
        Function<Integer,Integer> add3 = makeAdder3.apply(3);
        System.out.println(add3.apply(50));

    }
}
