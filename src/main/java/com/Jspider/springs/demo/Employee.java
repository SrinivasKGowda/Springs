package com.Jspider.springs.demo;

public class Employee
{
    private int id;
    private String  name;
    private  double salary;
    private  ContactInfo cantact;
    private Address address;

    //Injecting dependency in Constructor
//
    public Employee(ContactInfo cantact)
    {
        this.cantact = cantact;
    }
//    public Employee(ContactInfo cantact,Address address)
//    {
//        this.cantact = cantact;
//        this.address = address;
//    }

//    public Employee (Address address)
//    {
//        this.address = address;
//    }

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ContactInfo getCantact() {
        return cantact;
    }

    public void setCantact(ContactInfo cantact) {
        this.cantact = cantact;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
