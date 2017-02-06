package main.java.defaults;

/**
 * Created by raviagrawal on 13/01/17.
 */
public interface InterfaceB {

    void methodB();

    default void defaultMethod(){
        System.out.println("Interface B default method");
    }

}
