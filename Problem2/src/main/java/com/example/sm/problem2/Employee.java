package com.example.sm.problem2;


//public class Employee /* extends something1 implements something2 */ {
public class Employee extends Person implements Payment{

    private int salary;
    public void increase(){
        if(salary==0){
            salary+=10000;

        }
        else{
            salary+=10000;
        }
    }
    public void decrease(){
        if(salary==0){
            salary=0;

        }
        else{
            salary-=10000;
        }
    }

    public Employee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // need something here
}
