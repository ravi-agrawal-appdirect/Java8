package main.java.defaults;

/**
 * Created by raviagrawal on 13/01/17.
 */
public class OverrideDefaultMethodClass implements InterfaceA {
    @Override
    public void methodA() {
        System.out.println("OverrideDefaultMethodClass Class methodA");
    }

    @Override
    public void defaultMethod() {
        System.out.println("OverrideDefaultMethodClass default method");
    }
}
