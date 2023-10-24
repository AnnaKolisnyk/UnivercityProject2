package myPackage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MathSubject implements Subject{
    @Value("${mathSubject.name}")
    private String name;

    @Value("${mathSubject.hours}")
    private int hours;

    @Override
    public void showNameAndHours() {
        System.out.println("Math subject: " + name + "; hours: " + hours);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @PostConstruct
    public void init(){
        System.out.println("-> mathSubject bean initialization");
    }
    @PreDestroy
    public void destruct(){
        System.out.println("-> mathSubject bean destruction");
    }
}
