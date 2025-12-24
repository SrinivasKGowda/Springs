package com.Jspider.springs.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependecyInjectionDemo
{
    public static void main(String[] args)
    {

        System.out.println("Program starts..");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Employee emp = context.getBean("employee", Employee.class);
        Employee emp1 = context.getBean("employee", Employee.class);


        System.out.println(emp.getCantact());


        System.out.println(emp.getAddress());

        System.out.println("ID : "+ emp.getId());
        System.out.println("Name : "+ emp.getName());
        System.out.println("salary : "+ emp.getSalary());

        System.out.println(emp);
        System.out.println(emp1);



        System.out.println("Program ends..");
    }
}
