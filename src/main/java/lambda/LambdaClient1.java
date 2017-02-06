package main.java.lambda;

/**
 * Created by raviagrawal on 12/01/17.
 */
public class LambdaClient1 {

    public static void main(String[] args) {

        LambdaTestInterface1 anonymousClass = new LambdaTestInterface1() {
            @Override
            public void method() {
                System.out.println("Hello from anonymous class");
            }
        };
        anonymousClass.method();

        LambdaTestInterface1 lambda1 = () -> System.out.println("Hello from Lambda expression");
        lambda1.method();

        LambdaTestInterface1 lambda2 = () -> {
            System.out.println("Hello lambda 1");
            System.out.println("Hello lambda 2");
            System.out.println("Hello lambda 3");
        };
        lambda2.method();
    }
}
