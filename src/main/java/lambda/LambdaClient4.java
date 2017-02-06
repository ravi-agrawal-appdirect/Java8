package main.java.lambda;

/**
 * Created by raviagrawal on 12/01/17.
 */
public class LambdaClient4 {
    public static void main(String[] args) {
        int i = 1;

        LambdaTestInterface4 lambda1 = () -> i;

        System.out.println(lambda1.method());

    }
}
