package main.java.defaults;

/**
 * Created by raviagrawal on 13/01/17.
 */
public interface InterfaceA {

    void methodA();

    default void defaultMethod(){
        System.out.println("Interface A default method");
    }

}
