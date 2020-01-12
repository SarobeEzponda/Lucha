package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author sqlitetutorial.net
 */
public class CreateTable
{


    /**
     * Create a new table in the test database
     *
     */
    public static void createNewTablePersonaje()
    {
        // SQLite connection string
        String name = "lucha.db";
        String url = "jdbc:sqlite:" + name;

        // SQL statement for creating a new table
        String sql =
//        		 "CREATE TABLE IF NOT EXISTS warehouses (\n"
//        	                + "    id integer PRIMARY KEY,\n"
//        	                + "    name text NOT NULL,\n"
//        	                + "    capacity real\n"
//        	                + ");";
				"CREATE TABLE PERSONAJE\n" +
				"(idPer NUMBER NOT NULL PRIMARY KEY,\n" +
				"bando BIT NOT NULL,\n" +
				"nombre TEXT NOT NULL CHECK(ataque>0), \n" +
				"vida NUMBER NOT NULL CHECK(vida>0), \n" +
				"ataque NUMBER NOT NULL);\n" ;
	        
        
        try
                (
                        Connection conn = DriverManager.getConnection(url);
                        Statement stmt = conn.createStatement()
                )
        {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void createNewTableSuperheroe()
    {
        // SQLite connection string
        String name = "lucha.db";
        String url = "jdbc:sqlite:" + name;

        // SQL statement for creating a new table
        String sql =
//        		 "CREATE TABLE IF NOT EXISTS warehouses (\n"
//        	                + "    id integer PRIMARY KEY,\n"
//        	                + "    name text NOT NULL,\n"
//        	                + "    capacity real\n"
//        	        
					"CREATE TABLE SUPERHEROE\n" +
					"(idPer NUMBER REFERENCES PERSONAJE (idPer),\n" +
					"bando BIT NOT NULL,\n" +
					"nombre TEXT NOT NULL CHECK(ataque>0), \n" +
					"vida NUMBER NOT NULL CHECK(vida>0), \n" +
					"ataque NUMBER NOT NULL, \n" +
					"poderAtaque BIT NOT NULL, \n" +
					"PRIMARY KEY (idPer));\n";
					
        
        try
                (
                        Connection conn = DriverManager.getConnection(url);
                        Statement stmt = conn.createStatement()
                )
        {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void createNewTableVillano()
    {
        // SQLite connection string
        String name = "lucha.db";
        String url = "jdbc:sqlite:" + name;

        // SQL statement for creating a new table
        String sql =
//        		 "CREATE TABLE IF NOT EXISTS warehouses (\n"
//        	                + "    id integer PRIMARY KEY,\n"
//        	                + "    name text NOT NULL,\n"
//        	                + "    capacity real\n"
//        	        
        		"CREATE TABLE VILLANO \n" +
				"(idPer NUMBER REFERENCES PERSONAJE (idPer),\n" +
				"bando BIT NOT NULL,\n" +
				"nombre TEXT NOT NULL, \n" +
				"vida NUMBER NOT NULL CHECK(vida>0), \n" +
				"ataque NUMBER NOT NULL CHECK(ataque>0), \n" +
				"poderSanar BIT NOT NULL,\n" +
				"PRIMARY KEY (idPer));";
					
        
        try
                (
                        Connection conn = DriverManager.getConnection(url);
                        Statement stmt = conn.createStatement()
                )
        {
            // create a new table
            stmt.execute(sql);
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
        createNewTablePersonaje();
        createNewTableSuperheroe();
        createNewTableVillano();
    }

}
