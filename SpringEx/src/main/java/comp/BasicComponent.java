package comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Dominik C.
 */
@Component
public class BasicComponent {

    @Autowired
    NotBasicComponent notBasicComponent;

    private String name;

    public BasicComponent() {
    }

    public BasicComponent(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
}
