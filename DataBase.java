package electricity.billing.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataBase {
    Connection connection;
    Statement statement;
DataBase()  {
    try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Electricity", "root", "abdurrehman.30143$");
         statement=connection.createStatement();
    }catch (Exception e){

        e.printStackTrace();
    }
}
}

