package main.java.defaults;

/**
 * Created by raviagrawal on 13/01/17.
 */
public class ConflictClass implements InterfaceA, InterfaceB {

    @Override
    public void methodA() {
        System.out.println("Conflict Class methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Conflict Class methodB");
    }

    public void defaultMethod(){
        InterfaceA.super.defaultMethod();
    }

}