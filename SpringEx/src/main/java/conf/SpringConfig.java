package conf;

import comp.BasicComponent;
import comp.NotBasicComponent;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by Dominik C.
 */
  @Configuration
  @ComponentScan(basePackages = "comp")
public class SpringConfig {

    @Bean(name = "not")
    public NotBasicComponent notBasicComponent() {
        return new NotBasicComponent();
    }

    @Bean(name = "without")
    public BasicComponent basicComponent(NotBasicComponent notBasicComponent) {
        System.out.println(notBasicComponent);

        return new BasicComponent("bean without name");
    }

    @Bean(name = "name")
    public BasicComponent basicComponentWithName() {
        return new BasicComponent("with name");
    }

}
