import conf.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Dominik C.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        context.getBean("");
    }

}
