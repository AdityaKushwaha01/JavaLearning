package com.CollectionsLearning;

import java.util.*;
class EmployeeSorting {
    public static void main(String[] args) {
        
        List<Employee> emp= new ArrayList<>();
        emp.add(new Employee("Aditya",28,30000));
        emp.add(new Employee("kumar",25,50000));
        emp.add(new Employee("kushwaha",30,30400));
        
        emp.sort(Comparator.comparing(e -> e.getName().length()));
        for(Employee emp1:emp){
        System.out.println(emp1);
    }}
}

class Employee{
    private String name;
    private int age;
    private double salary;
    
    public Employee(String name, int age,double salary){
        this.name = name;
        this.age = age;
        this.salary=salary;
    }
    
    public String getName(){
        return name;
    }
    public String toString(){
        return (name+" "+age+" "+salary);
    }
    
}
