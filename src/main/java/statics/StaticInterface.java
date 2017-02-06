package main.java.statics;

/**
 * Created by raviagrawal on 13/01/17.
 */
public interface StaticInterface {

    String method();

    static boolean isNull(String str) {
        System.out.println("Interface Null Check");
        return str == null ? true : "".equals(str) ? true : false;
    }
}
