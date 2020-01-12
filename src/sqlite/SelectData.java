package sqlite;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import personas.Personaje;
import personas.Superheroe;
import personas.Villano;

/**
 *
 * @author sqlitetutorial.net
 */
public class SelectData
{
    /**
     * Connect to the test.db database
     * @return the Connection object
     */
    private Connection connect()
    {
        // SQLite connection string
        String name = "lucha.db";
        String url = "jdbc:sqlite:" + name;
        Connection conn = null;

        try
        {
            conn = DriverManager.getConnection(url);
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return conn;
    }


    /**
     * select all rows in the warehouses table
     */
//    public void selectAll()
//    {
//        String sql = "SELECT id, name, capacity FROM warehouses";
//
//        try
//                (
//                        Connection conn = this.connect();
//                        Statement stmt  = conn.createStatement();
//                        ResultSet rs    = stmt.executeQuery(sql)
//                )
//        {
//
//            // loop through the result set
//            while (rs.next())
//            {
//                System.out.println
//                        (
//                                rs.getInt("id") +  "\t" +
//                                rs.getString("name") + "\t" +
//                                rs.getDouble("capacity")
//                        );
//            }
//        } catch (SQLException e)
//        {
//            System.out.println(e.getMessage());
//        }
//    }
    public   ArrayList <Personaje> selectPersonajes(){
    	
    	String sql=  "SELECT * FROM PERSONAJE";
    	 
    	ArrayList <Personaje> listaPersonaje;
    	listaPersonaje = new ArrayList<Personaje>();
    	
    	try  (
                Connection conn = this.connect();
                Statement stmt  = conn.createStatement();
                ResultSet rs    = stmt.executeQuery(sql)
    			)
    	{
    		 while (rs.next())
    		 {
    			int idPer;
    			boolean bando;
    			String nombre;
    			int vida;
    			int ataque;			
    			
    			idPer =rs.getInt("idPer");
    			bando = rs.getBoolean("bando");
    			nombre = rs.getString( "nombre");
    			vida = rs.getInt("vida");
    			ataque = rs.getInt("ataque");
    			
    			Personaje per = new Personaje();
    			
    			per.setIdPer(idPer);
    			per.setEquipo(bando);
    			per.setNombre(nombre);
    			per.setVida(vida);
    			per.setAtaque(ataque);    			
    			
    			listaPersonaje.add(per);
    //			System.out.println(per.getNombre() + " añadido");
    			
    		 }
    	} catch (SQLException e)
    	{
    		System.out.println(e.getMessage());
    	}
    	return listaPersonaje;
    	
    }
   public   ArrayList <Superheroe> selectSuperheroes(){
    	
    	String sql=  "SELECT * FROM SUPERHEROE";
    	 
    	ArrayList <Superheroe> listaSuperheroe;
    	listaSuperheroe = new ArrayList<Superheroe>();
    	
    	try  (
                Connection conn = this.connect();
                Statement stmt  = conn.createStatement();
                ResultSet rs    = stmt.executeQuery(sql)
    			)
    	{
    		 while (rs.next())
    		 {
    			int idPer;
    			boolean bando;
    			String nombre;
    			int vida;
    			int ataque;
    			boolean poderAtaque;
    			
    			idPer =rs.getInt("idPer");
    			bando = rs.getBoolean("bando");
    			nombre = rs.getString( "nombre");
    			vida = rs.getInt("vida");
    			ataque = rs.getInt("ataque");
    			poderAtaque = rs.getBoolean("poderAtaque");
    			
    			Superheroe sup = new Superheroe();
    			
    			sup.setIdPer(idPer);
    			sup.setEquipo(bando);
    			sup.setNombre(nombre);
    			sup.setVida(vida);
    			sup.setAtaque(ataque);
    			sup.setPoderAtaque(poderAtaque);
    			
    			
    			listaSuperheroe.add(sup);
    			System.out.println(sup.getNombre() + " añadido"); // una mini prueba para saber que esta recorrienda bn
    			
    		 }
    	} catch (SQLException e)
    	{
    		System.out.println(e.getMessage());
    	}
    	return listaSuperheroe;
    	
    }
    public   ArrayList <Villano> selectVillanos(){
    	
    	String sql=  "SELECT * FROM VILLANO";
    	 
    	ArrayList <Villano> listaVillano;
    	listaVillano = new ArrayList<Villano>();
    	
    	try  (
                Connection conn = this.connect();
                Statement stmt  = conn.createStatement();
                ResultSet rs    = stmt.executeQuery(sql)
    			)
    	{
    		 while (rs.next())
    		 {
    			int idPer;
    			boolean bando;
    			String nombre;
    			int vida;
    			int ataque;
    			boolean poderSanar;
    			
    			idPer =rs.getInt("idPer");
    			bando = rs.getBoolean("bando");
    			nombre = rs.getString( "nombre");
    			vida = rs.getInt("vida");
    			ataque = rs.getInt("ataque");
    			poderSanar = rs.getBoolean("poderSanar");
    			
    			Villano vil = new Villano();
    			
    			vil.setIdPer(idPer);
    			vil.setEquipo(bando);
    			vil.setNombre(nombre);
    			vil.setVida(vida);
    			vil.setAtaque(ataque);
    			vil.setPoderSanar(poderSanar);
    			
    			
    			listaVillano.add(vil);
    			System.out.println(vil.getNombre() + " añadido");
    			
    		 }
    	} catch (SQLException e)
    	{
    		System.out.println(e.getMessage());
    	}
    	return listaVillano;
    	
    }
    public void selectAllP()
    {
        String sql = "SELECT idPer, bando, nombre, vida, ataque FROM PERSONAJE";

        try
                (
                        Connection conn = this.connect();
                        Statement stmt  = conn.createStatement();
                        ResultSet rs    = stmt.executeQuery(sql)
                )
        {

            // loop through the result set
            while (rs.next())
            {
                System.out.println
                        (
                                rs.getInt("idPer") +  "\t" +
                                rs.getBoolean("bando") + "\t" +
                                rs.getString("nombre") +  "\t" +
                                rs.getInt("vida") + "\t" +
                                rs.getInt("ataque")
                        );
            }
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        
    }

    public void selectAllS()
    {
        String sql = "SELECT idPer, bando, nombre, vida, ataque, poderAtaque FROM SUPERHEROE";

        try
                (
                        Connection conn = this.connect();
                        Statement stmt  = conn.createStatement();
                        ResultSet rs    = stmt.executeQuery(sql)
                )
        {

            // loop through the result set
            while (rs.next())
            {
                System.out.println
                        (
                                rs.getInt("idPer") +  "\t" +
                                rs.getBoolean("bando") + "\t" +
                                rs.getString("nombre") +  "\t" +
                                rs.getInt("vida") + "\t" +
                                rs.getInt("ataque") + "\t" +
                                rs.getBoolean("poderAtaque")
                        );
            }
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        
    }

    public void selectAllV()
    {
        String sql = "SELECT idPer, bando, nombre, vida, ataque, poderSanar FROM VILLANO";

        try
                (
                        Connection conn = this.connect();
                        Statement stmt  = conn.createStatement();
                        ResultSet rs    = stmt.executeQuery(sql)
                )
        {

            // loop through the result set
            while (rs.next())
            {
                System.out.println
                        (
                                rs.getInt("idPer") +  "\t" +
                                rs.getBoolean("bando") + "\t" +
                                rs.getString("nombre") +  "\t" +
                                rs.getInt("vida") + "\t" +
                                rs.getInt("ataque") + "\t" +
                                rs.getBoolean("poderSanar")
                        );
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
        SelectData app = new SelectData();
      
        app.selectVillanos();
        app.selectSuperheroes();
        
        
        
//        System.out.println("La tabla de todos los Personajes: ");
//        app.selectAllP();
//        System.out.println("\n" + "La tabla de los Superheroes: ");
//        app.selectAllS();
//        System.out.println("\n" + "La tabla de los Villanos:");
//        app.selectAllV();
    }
}

