package com.example.lab1.xmlconfig.lab1_2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyApp {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContextXml_2.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Employee emp1 = (Employee) factory.getBean("emp1");
        Employee emp2 = (Employee) factory.getBean("emp2");
        Employee emp3 = (Employee) factory.getBean("emp3");
        Employee emp4 = (Employee) factory.getBean("emp4");

        System.out.println(emp1);
        System.out.println(emp1.getSBUDetails());
        System.out.println();
        System.out.println(emp2);
        System.out.println(emp2.getSBUDetails());
        System.out.println();
        System.out.println(emp3);
        System.out.println(emp3.getSBUDetails());
        System.out.println();
        System.out.println(emp4);
        System.out.println(emp4.getSBUDetails());
        System.out.println();

    }
}
