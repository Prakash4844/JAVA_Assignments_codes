//Q23. WAP to retrieve data from database.
package JAVA_Lab_File;

import java.sql.*;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.*;
import java.sql.ResultSet;

public class Q23_Retrieve_DB_data {
    public class Test {

        public static final boolean Connected() {
            boolean initialize = SQLiteJDBCLoader.initialize();

            SQLiteDataSource dataSource = new SQLiteDataSource();
            dataSource.setUrl("jdbc:sqlite:/home/users.sqlite");
            int i=0;
            try {
                ResultSet executeQuery = dataSource.getConnection()
                        .createStatement().executeQuery("select * from \"Table\"");
                while (executeQuery.next()) {
                    i++;
                    System.out.println("out: "+executeQuery.getMetaData().getColumnLabel(i));
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

            return initialize;

        }
    }
}
