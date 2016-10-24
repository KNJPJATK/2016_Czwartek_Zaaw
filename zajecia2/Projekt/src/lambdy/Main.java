package lambdy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by rpi on 20.10.2016.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Function<Integer, Integer> potega = (a) -> (a * a);
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            integers.add(metoda(potega, i));
        }
        System.out.println(integers);
        integers = integers.stream().filter((i) -> (i < 20)).
                collect(Collectors.toList());
        System.out.println(integers);
        List<String> allLines =
                Files.readAllLines(Paths.get("plik.txt"));
        System.out.println(allLines);
        System.out.println(new Date());
        System.out.println(LocalDate.of(2010, 5, 1));
    }

    public static Integer metoda
            (Function<Integer, Integer> function, Integer param) {
        return function.apply(param);
    }

}
