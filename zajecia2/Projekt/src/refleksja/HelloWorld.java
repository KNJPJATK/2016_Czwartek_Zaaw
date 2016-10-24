package refleksja;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by rpi on 13.10.2016.
 */
public class HelloWorld {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<Roslinka> roslinkaClass =
                (Class<Roslinka>)
                        Class.forName("Roslinka");

//        for (Method m : roslinkaClass.getDeclaredMethods()) {
//            System.out.println(m);
//        }

        Constructor<Roslinka> roslinkaConstructor =
                roslinkaClass.getConstructor(Double.class);
        Roslinka roslinka = roslinkaConstructor.
                newInstance(34.33);
        System.out.println(roslinka);
        Field wysokoscField = roslinkaClass.
                getDeclaredField("wysokosc");
        wysokoscField.setAccessible(true);
        wysokoscField.set(roslinka, 332.32);
        System.out.println(roslinka);
    }

}
