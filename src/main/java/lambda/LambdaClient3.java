package main.java.lambda;

/**
 * Created by raviagrawal on 12/01/17.
 */
public class LambdaClient3 {
    public static void main(String[] args) {

        LambdaTestInterface3 lambda1 = (s) -> System.out.println(s);
        lambda1.method("print using normal lambda expression");

        LambdaTestInterface3 lambda2 = System.out::println;
        lambda2.method("print using method reference");

    }
}
