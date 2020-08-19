import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Clinic {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Registry registry = context.getBean("Registry" , Registry.class);
        IDoctor idoc = context.getBean("IDoctor", IDoctor.class);

        registry.issue_direction();

    }
}
