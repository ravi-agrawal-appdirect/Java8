package main.java.lambda;

/**
 * Created by raviagrawal on 12/01/17.
 */
public class LambdaClient2 {
    public static void main(String[] args) {
        int j = 1;

        LambdaTestInterface2 lambda1 = new LambdaTestInterface2() {
            @Override
            public boolean method(int i) {
                return i > 0;
            }
        };
        if(lambda1.method(j)) System.out.println("Test passed using anonymous class");


        LambdaTestInterface2 lambda2 = (int i) -> i > 0;

        if(lambda2.method(j)) System.out.println("Test passed using lambda expression");

        LambdaTestInterface2 lambda3 = (i) -> {
            System.out.println("Perform operation 1");
            System.out.println("Perform operation 2");
            return i > 0;
        };

        if(lambda3.method(j)) System.out.println("Multiple operations method passed using lambda expression");

    }
}
