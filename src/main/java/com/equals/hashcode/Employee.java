package com.equals.hashcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {

    private String name;
    private String is;

    public Employee(String name, String is) {
        this.name = name;
        this.is = is;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        return is != null ? is.equals(employee.is) : employee.is == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (is != null ? is.hashCode() : 0);
        return result;
    }

    @Override
    public String
    toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", is='" + is + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Map<Employee, String> empList = new HashMap<>();

        empList.put(new Employee("a","a"), "1");
        empList.put(new Employee("a","a"), "1");
        empList.put(new Employee("a","a"), "1");
        empList.put(new Employee("a","a2awewqe"), "1");


        final Employee e = new Employee("a","ddd");
        Employee e1 = new Employee("a","ddd");
        e.name="9999";

        System.out.println(e);
    }
}
