package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        ClassForSingleton objA = (ClassForSingleton) context.getBean("singleton");

        objA.setMessage("I'm object A");
        objA.getMessage();

        ClassForSingleton objB = (ClassForSingleton) context.getBean("singleton");
        objB.getMessage();

        ClassForPrototype objC = (ClassForPrototype) context.getBean("prototype");
        objC.setNumber(1,2);
        objC.getSum();

        ClassForPrototype objD = (ClassForPrototype) context.getBean("prototype");
        objD.getSum();
    }
}
