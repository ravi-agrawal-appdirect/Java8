package main.java.defaults;

/**
 * Created by raviagrawal on 13/01/17.
 */
public class DefaultClient3 {
    public static void main(String[] args) {
        ConflictClass conflictClass = new ConflictClass();
        conflictClass.methodA();
        conflictClass.methodB();
        conflictClass.defaultMethod();
    }
}
