package com.CollectionsLearning;


import java.util.*;
class EmployeeSortingComparable {
    public static void main(String[] args) {
        
        List<EmployeeDetails> emp= new ArrayList<>();
        emp.add(new EmployeeDetails("Aditya",28,30000));
        emp.add(new EmployeeDetails("kumar",25,50000));
        emp.add(new EmployeeDetails("kushwaha",30,30400));
        
      //  emp.sort(Comparator.comparing(e -> e.getName()));
        Collections.sort(emp);
        
        for(EmployeeDetails emp1:emp){
        System.out.println(emp1);
    }}
}

class EmployeeDetails implements Comparable<EmployeeDetails>{
    private String name;
    private int age;
    private double salary;
    
    public int compareTo(EmployeeDetails e){
        return this.age-e.age;
    }
    
    public EmployeeDetails(String name, int age,double salary){
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