package main.java.domain;

/**
 * Created by raviagrawal on 13/01/17.
 */
public class Employee {
    private int id;
    private String name;

    public Employee(){

    }

    public Employee(String name){
        this.name = name;
    }

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "** " + name;
    }
}
