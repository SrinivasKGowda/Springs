package com.Jspider.springs.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependecyInjectionDemo
{
    public static void main(String[] args)
    {

        System.out.println("Program starts..");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Employee emp = context.getBean("employee", Employee.class);

        System.out.println(emp.getCantact());

        System.out.println(emp.getAddress());

        System.out.println("Program ends..");
    }
}
