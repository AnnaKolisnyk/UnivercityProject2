package myPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class University {
    private Course electiveCource;
    private Course compulsoryCource;

    @Autowired
    public University(@Qualifier("electiveCourse") Course cource1, @Qualifier("compulsoryCourse") Course cource2) {
        this.electiveCource = cource1;
        this.compulsoryCource = cource2;
    }

    public void showCource(){
        System.out.println();
        electiveCource.getCource();
        compulsoryCource.getCource();
    }
}
