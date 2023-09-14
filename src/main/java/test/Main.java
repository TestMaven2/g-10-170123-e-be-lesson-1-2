package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//        ClassA classA = (ClassA) context.getBean("idA");

        ClassA classA1 = context.getBean(ClassA.class);
        ClassA classA2 = context.getBean(ClassA.class);

        classA1.setMessage("Hello!");
        System.out.println(classA2.getMessage());

        ClassB classB1 = context.getBean(ClassB.class);
        ClassB classB2 = context.getBean(ClassB.class);

        classB1.setMessage("Hi!");
        System.out.println(classB2.getMessage());

        System.out.println(classA1 == classA2);
    }
}
