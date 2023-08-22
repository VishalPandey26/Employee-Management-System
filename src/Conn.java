

import java.sql.*;  // JDBC CONECTIVITY 

public class Conn {
    
    Connection c;
    Statement s;

    public Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root", "Sovietrussia");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagementsystem", "root", "Sovietrussia");

            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
