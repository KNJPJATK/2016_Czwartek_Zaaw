import comp.BasicComponent;
import comp.NotBasicComponent;
import conf.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * Created by Dominik C.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BasicTest implements ApplicationContextAware {

    @Autowired
    @Qualifier("without")
    BasicComponent basicComponent;

    ApplicationContext applicationContext;

    @Test
    public void test1() {

        NotBasicComponent notBasicComponent = (NotBasicComponent) applicationContext.getBean("not");

        System.out.println(basicComponent.getName());

        org.junit.Assert.assertNotNull(basicComponent);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
