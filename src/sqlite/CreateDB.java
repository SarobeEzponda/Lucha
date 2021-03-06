package sqlite;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *La clase en donde se crea la conexi�n con la base de datos.
 * @author Pablo Sarobe Ezponda 
 */
public class CreateDB
{

    /**
     * Conectarse con una base de datos
     *
     * @param fileName the database file name
     */
    public static void createNewDatabase(String fileName)
    {

        String url = "jdbc:sqlite:" + fileName;

        try (Connection conn = DriverManager.getConnection(url))
        {
            if (conn != null)
            {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        createNewDatabase("lucha.db");
    }
}
