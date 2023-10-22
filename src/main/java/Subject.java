
public class Subject {
    private String name;
    private int hours;

    public void setHours(int hours) {
        this.hours = hours;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void showNameAndHours(){
        System.out.println("Name: " + name + "Hours: " + hours);
    }
}
