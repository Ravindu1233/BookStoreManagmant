package Model;

import java.sql.*;
public class JDBConnection {
    private static Connection con;
    public static Connection createDBConnection()
    {   
        try
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost/bookstore","root","");
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
    return con;
}
}
