package main.java.utils;

import java.util.function.Function;

/**
 * Created by raviagrawal on 12/01/17.
 */
public class Utils {

    public static Integer add1(int i){
        return i + 1;
    }

    public static Function<Integer, Integer> adder(Integer x) {
        return y -> x + y;
    }

}
