package Inheritance;

public class Employee {

    Employee(){
        System.out.println("Employee Constructor...");
    }
    int id ;
    String name;
    double salary;
}

class Developer extends Employee{
    String progLang;
}

class Manager extends Employee{
    Manager(){
        super();
        System.out.println("Manager Constructor...");
    }
    int teamSize = 100;

}