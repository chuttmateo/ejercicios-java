package org.example.streams.flatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("John", "Doe");
        Employee e2 = new Employee("Alice", "Smith");
        Employee e3 = new Employee("Bob", "Johnson");
        Employee e4 = new Employee("Emily", "Davis");
        Employee e5 = new Employee("Michael", "Brown");

        List<Employee> employeesDept1 = new ArrayList<>();
        employeesDept1.add(e1);
        employeesDept1.add(e2);

        List<Employee> employeesDept2 = new ArrayList<>();
        employeesDept2.add(e3);
        employeesDept2.add(e4);

        List<Employee> employeesDept3 = new ArrayList<>();
        employeesDept3.add(e5);


        Department department1 = new Department(employeesDept1);
        Department department2 = new Department(employeesDept2);
        Department department3 = new Department(employeesDept3);

        List<Department> departments = new ArrayList<>();
        departments.add(department1);
        departments.add(department2);
        departments.add(department3);

        Company company = new Company(departments);

        /*This code snippet uses flatMap to extract the stream of employees from each department
        (department.getEmployees().stream()) and then collects them into a single list
        (collect(Collectors.toList())).
        Finally, it prints the names of all employees in the combined list.*/
        //combine all employees from different departments into a single list

        Function<Department, Stream<Employee>> flatMapMapper =
                departMent -> departMent.getEmployees().stream();


        List<Employee> allEmployees = departments.stream()
                .flatMap(flatMapMapper)
                //peek doesn't modify the current stream it just runs a method
                .peek(System.out::println)
                .toList();

        //returns only the first and last name for each one
        System.out.println("returns only the first and last name for each one");
        Function<Employee, String> mapMapper =
                employee -> employee.getFirstName() + " " + employee.getLastName();
        allEmployees.stream()
                .map(mapMapper)
                .forEach(System.out::println);


    }
}
