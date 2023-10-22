import java.util.List;

public class CompulsoryCource implements Cource{
    private List<Subject> subjects;

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public void getCource() {
        System.out.println("This is compulsory cource");
        for(Subject s: subjects){
            s.showNameAndHours();
        }
    }
}
