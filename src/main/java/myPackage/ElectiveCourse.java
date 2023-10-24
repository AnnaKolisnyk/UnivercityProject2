package myPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ElectiveCourse implements Course {
    private Subject subject1;
    private Subject subject2;


    @Autowired
    public void setSubjects(@Qualifier("mathSubject") Subject subject1, @Qualifier("englishSubject")Subject subject2) {
        this.subject1 = subject1;
        this.subject2 = subject2;
    }

    @Override
    public void getCource() {
        System.out.println("This is elective cource");

        subject1.showNameAndHours();
        subject2.showNameAndHours();

        System.out.println("------------------------------------------");
    }
    @PostConstruct
    public void init(){
        System.out.println("-> electiveCourse bean initialization");
    }
    @PreDestroy
    public void destruct(){
        System.out.println("-> electiveCourse bean destruction");
    }
}
