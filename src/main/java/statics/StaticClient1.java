package main.java.statics;

/**
 * Created by raviagrawal on 13/01/17.
 */
public class StaticClient1 {
    public static void main(String[] args) {

        StaticClass staticClass = new StaticClass();
        String s = staticClass.method();

        boolean isNull = StaticInterface.isNull(s);
        System.out.println("isNull : " + isNull);
    }
}
