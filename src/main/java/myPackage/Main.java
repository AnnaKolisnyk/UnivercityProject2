package myPackage;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        University uni = context.getBean("university", University.class);
        uni.showCource();

        context.close();
    }
}
