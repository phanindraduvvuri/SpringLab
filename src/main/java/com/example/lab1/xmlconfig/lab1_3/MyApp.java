package com.example.lab1.xmlconfig.lab1_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextXml_3.xml");

        SBU sbu1 = (SBU) applicationContext.getBean("sbu1");
        SBU sbu2 = (SBU) applicationContext.getBean("sbu2");

        System.out.println("SBU Details : ");
        System.out.println("---------------------------------");
        System.out.println(sbu1);
        sbu1.getEmpList().forEach(System.out::println);

        System.out.println();

        System.out.println("SBU Details : ");
        System.out.println("---------------------------------");
        System.out.println(sbu2);
        sbu2.getEmpList().forEach(System.out::println);
    }
}
