package main.java.statics;

/**
 * Created by raviagrawal on 13/01/17.
 */
public class StaticClass implements StaticInterface {
    @Override
    public String method() {
        String s = "StaticClass method called";
        System.out.println(s);
        return s;
    }
}
