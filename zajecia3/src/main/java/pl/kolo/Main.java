package pl.kolo;

import java.sql.*;
import java.util.Properties;

/**
 * Created by rpi on 27.10.2016.
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

//        praca domowa!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//        String host = System.getProperty("${db.host}");
//
//        System.out.println(host);

        Connection con = DriverManager.
                getConnection("jdbc:postgresql://localhost:5432/kolo_java",
                        "postgres", "postgres");

        Statement magicStmnt = con.createStatement();

//        System.out.println(
//                magicStmnt.executeUpdate("delete from temat where id = 3;"));

        ResultSet rs = magicStmnt.executeQuery(
                "select * from temat where nazwa like '%a%';");

        while(rs.next()) {
            System.out.println(rs.getString(1));
            System.out.println(rs.getString("nazwa"));
        }

        rs.close();

        PreparedStatement magicPreparedStmnt = con.prepareStatement(
                "select * from temat where nazwa like ?;");

        magicPreparedStmnt.setString(1, "%k%");

        ResultSet rs1 = magicPreparedStmnt.executeQuery();

        System.out.println("=======================");

        while(rs1.next()) {
            System.out.println(rs1.getString(1));
            System.out.println(rs1.getString("nazwa"));
        }

        rs1.close();
        con.close();
    }

}