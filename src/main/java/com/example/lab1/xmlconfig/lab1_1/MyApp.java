package com.example.lab1.xmlconfig.lab1_1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyApp {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContextXml_1.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Employee emp1 = (Employee) factory.getBean("emp1");
        Employee emp2 = (Employee) factory.getBean("emp2");
        Employee emp3 = (Employee) factory.getBean("emp3");
        Employee emp4 = (Employee) factory.getBean("emp4");

        printEmployee(emp1);
        printEmployee(emp2);
        printEmployee(emp3);
        printEmployee(emp4);
    }

    private static void printEmployee(Employee employee) {
        System.out.println("Employee Details : ");
        System.out.println("---------------------------");
        System.out.println("Employee ID : " + employee.getEmpId());
        System.out.println("Employee Name : " + employee.getEmpName());
        System.out.println("Employee Salary : " + employee.getSalary());
        System.out.println("Employee BU : " + employee.getBusinessUnit());
        System.out.println("Employee Age : " + employee.getAge());
        System.out.println();
    }
}
