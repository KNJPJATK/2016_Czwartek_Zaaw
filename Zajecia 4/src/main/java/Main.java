import org.apache.derby.jdbc.EmbeddedDriver;
import pl.Klasa1;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * Created by rpi on 03.11.16.
 */
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
//        InputStream is = Main.class.getResourceAsStream("my.properties");
//        Properties prop = new Properties();
//        prop.load(is);
//        String prop1 = prop.getProperty("prop1");
//        System.out.println(prop1);
//
//        Class.forName(EmbeddedDriver.class.getName());
//        Connection connection = DriverManager.getConnection
//                ("jdbc:derby:myDB;create=true", "test", "test");
//        Statement stmt = connection.createStatement();
//        ResultSet rs = stmt.executeQuery("SHOW TABLES");
//
//        while (rs.next()) {
//            System.out.println(rs.getString(1));
//        }
//
//        rs.close();
//        stmt.close();
//        connection.close();
        Klasa1 k = new Klasa1();
        System.out.println(k.getIncreased(-3));
    }

}
