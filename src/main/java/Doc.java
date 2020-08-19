import org.springframework.stereotype.Component;

@Component("Doc")
public class Doc implements IDoctor {
    public void direct() {
        System.out.println("Клиент обслужен");
    }
}