package sqlClass1;

import java.sql.*;

public class E1SQL {
    public static void main(String[] args) {
        String dbUrl="jdbc:mysql://3.239.253.255:3306/syntaxhrm_mysql";
        String userName="syntax_hrm";
        String password="syntaxhrm123";
        try {
            // we need to create connections to connect to the database first
            Connection connection = DriverManager.getConnection(dbUrl,userName,password);
            // takes your queries executes them on the database and brings the result back

            Statement statement= connection.createStatement();
            String query="select * from person";
            // resultset contains the results of the query that we execute on the
            // database in yje form of table
            ResultSet resultSet=statement.executeQuery(query);
            while (resultSet.next()){
                String firstName=resultSet.getString("FirstName");
                int age=resultSet.getInt("age");
                String city=resultSet.getString("City");
                System.out.println(firstName+" "+age+" "+city);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
