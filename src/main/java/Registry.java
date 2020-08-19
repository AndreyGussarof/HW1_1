import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Registry")
public class Registry {

    @Autowired
    private IDoctor idoc;
    @Autowired
    public IDoctor getIDoctor() {
        return idoc;
    }
    @Autowired(required = false)
    @Qualifier("Doc")
    public void setIDoctor(IDoctor idoc) {
        this.idoc = idoc;
    }
//
    public void issue_direction() {
        System.out.println("Направление выдано");
        idoc.direct();
    }
}
