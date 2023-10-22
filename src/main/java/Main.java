import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Univercity uni = context.getBean("univercityBean", Univercity.class);
        uni.showCource();
    }
}
