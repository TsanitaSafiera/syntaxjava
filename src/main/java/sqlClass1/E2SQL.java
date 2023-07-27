package sqlClass1;

import utils.ConfigReader;

import java.sql.*;

public class E2SQL {
    public static void main(String[] args) {

        String dbUrl = ConfigReader.getProperty("dbUrl");
        String dbUserName = ConfigReader.getProperty("dbUserName");
        String dbPassword = ConfigReader.getProperty("dbPassword");
        try {
            Connection connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
            Statement statement = connection.createStatement();

            String query = "select * from employee";
            // executes the query and stores the results in resultSet variable
            ResultSet resultSet = statement.executeQuery(query);
            //information about the data for example no of columns their names data types etc.
            ResultSetMetaData metaData = resultSet.getMetaData();
            // gives us the no of columns in the resultSet
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(metaData.getColumnLabel(i) + " ");
            }
            System.out.println();
            // while loop goes throug the rows
            while (resultSet.next()) {
                // it goes through the columns
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(resultSet.getString(i) + " ");
                }
                System.out.println();
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}