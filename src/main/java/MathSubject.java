public class MathSubject implements Subject{
    private String name;
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
}
