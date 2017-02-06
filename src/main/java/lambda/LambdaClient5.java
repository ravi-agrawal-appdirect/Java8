package main.java.lambda;

/**
 * Created by raviagrawal on 12/01/17.
 */
public class LambdaClient5 {
    public static void main(String[] args) {
        int i = 1;

        LambdaTestInterface5 lambda1 = (int j) -> (float) j;

        System.out.println(lambda1.method(i));
    }
}
