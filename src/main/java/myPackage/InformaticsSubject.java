package myPackage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class InformaticsSubject implements Subject{
    @Value("${informaticsSubject.name}")
    private String name;

    @Value("${informaticsSubject.hours}")
    private int hours;

    @Override
    public void showNameAndHours() {
        System.out.println("Informatics subject: " + name + "; hours: " + hours);
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    @PostConstruct
    public void init(){
        System.out.println("-> informaticsSubject bean initialization");
    }
    @PreDestroy
    public void destruct(){
        System.out.println("-> informaticsSubject bean destruction");
    }
}
