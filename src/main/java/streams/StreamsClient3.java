package main.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import main.java.domain.Employee;

/**
 * Created by raviagrawal on 13/01/17.
 */
public class StreamsClient3 {
    public static void main(String[] args) {

        Stream.of("ravi", "arpit")
                .map(s -> new Employee(s))
                .forEach(System.out::println);

        System.out.println();

        List<Employee> employees = Stream.of("ravi", "arpit")
                                .map(Employee::new)
                                .collect(Collectors.toList());
        System.out.println(employees);

        System.out.println();

        List<Employee> employees1 = new ArrayList<>();
        employees1.add(new Employee(1, "ravi 1"));
        employees1.add(new Employee(1, "ravi 2"));
        employees1.add(new Employee(2, "arpit 1"));
        employees1.add(new Employee(2, "arpit 2"));

        Map<Integer, List<Employee>> listMap =
                employees1
                        .stream()
                        .collect(Collectors.groupingBy(Employee::getId));
        System.out.println(listMap);
    }
}