package myPackage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class EnglishSubject implements Subject{

    @Value("${englishSubject.name}")
    private String name;

    @Value("${englishSubject.hours}")
    private int hours;


    @Override
    public void showNameAndHours() {
        System.out.println("English subject: " + name + "; hours: " + hours);
    }

    @PostConstruct
    public void init(){
        System.out.println("-> englishSubject bean initialization");
    }
    @PreDestroy
    public void destruct(){
        System.out.println("-> englishSubject bean destruction");
    }
}
