package myPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class CompulsoryCourse implements Course {
    private Subject subject;

    @Autowired
    public void setSubjects(@Qualifier("informaticsSubject")Subject subject) {
        this.subject = subject;
    }

    @Override
    public void getCource() {
        System.out.println("This is compulsory cource");

        subject.showNameAndHours();

        System.out.println("------------------------------------------");
    }
    @PostConstruct
    public void init(){
        System.out.println("-> compulsoryCourse bean initialization");
    }
    @PreDestroy
    public void destruct(){
        System.out.println("-> compulsoryCourse bean destruction");
    }
}
