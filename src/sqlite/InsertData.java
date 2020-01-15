package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *Es la clase en donde se insertan los datos en las tablas para la BD.
 * @author Pablo Sarobe Ezponda
 */
public class InsertData
{

    /**
     * Conectar a la base de datos, lucha.db
     *
     * @return the Connection object
     */
    private Connection connect()
    {
        // SQLite connection string
        String name = "lucha.db";
        String url = "jdbc:sqlite:"+name;

        Connection conn = null;

        try
        {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }

        return conn;
    }

//    /**
//     * Insert a new row into the warehouses table
//     *
//     * @param name
//     * @param capacity
//     */
//    public void insert(String name, double capacity)
//    {
//        String sql = "INSERT INTO warehouses(name,capacity) VALUES(?,?)";
//
//        try
//                (
//                        Connection conn = this.connect();
//                        PreparedStatement pstmt = conn.prepareStatement(sql)
//                )
//        {
//            pstmt.setString(1, name);
//            pstmt.setDouble(2, capacity);
//            pstmt.executeUpdate();
//        }
//        catch (SQLException e)
//        {
//            System.out.println(e.getMessage());
//        }
//    }

    /**Método en el que se insertan las variables que tendrá la tabla de personaje.
     * @param idPer variable int número identificador.
     * @param bando variable booleana que asigna bando al personaje.
     * @param nombre variable String con el nombre del personaje.
     * @param vida variable int con la vida del personaje.
     * @param ataque variable int con el ataque del personaje.
     */
    public void insertP(int idPer, boolean bando, String nombre, int vida, int ataque)
    {
        String sql = "INSERT INTO PERSONAJE(idPer,bando,nombre,vida,ataque) VALUES(?,?,?,?,?)";

        try
                (
                        Connection conn = this.connect();
                        PreparedStatement pstmt = conn.prepareStatement(sql)
                )
        {
          pstmt.setInt(1, idPer);
          pstmt.setBoolean(2, bando);
          pstmt.setString(3, nombre);
          pstmt.setInt(4, vida);
          pstmt.setInt(5, ataque);
          pstmt.executeUpdate();
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
 

    
    /** Método en el que se insertan las variables que tendrá la tabla de Superhéroe.
     * @param idPer variable int número identificador.
     * @param bando variable booleana que asigna bando al superhéroe.
     * @param nombre variable String con el nombre del superhéroe.
     * @param vida variable int con la vida del superhéroe.
     * @param ataque variable int con el ataque del superhéroe.
     * @param poderAtaque variable booleana que decide si el superhéroe tiene poder de aumentar el ataque  o no.
     */
    public void insertS(int idPer, boolean bando, String nombre, int vida, int ataque, boolean poderAtaque)
    {
        String sql = "INSERT INTO SUPERHEROE(idPer,bando,nombre,vida,ataque, poderAtaque) VALUES(?,?,?,?,?,?)";

        try
                (
                        Connection conn = this.connect();
                        PreparedStatement pstmt = conn.prepareStatement(sql)
                )
        {
          pstmt.setInt(1, idPer);
          pstmt.setBoolean(2, bando);
          pstmt.setString(3, nombre);
          pstmt.setInt(4, vida);
          pstmt.setInt(5, ataque);
		pstmt.setBoolean(6, poderAtaque);
          pstmt.executeUpdate();
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    /**Método en el que se insertan las variables que tendrá la tabla de Villano.
     * @param idPer variable int número identificador.
     * @param bando variable booleana que asigna bando al villano.
     * @param nombre variable String con el nombre del villano.
     * @param vida int con la vida del villano.
     * @param ataque variable int con el ataque del villano.
     * @param poderSanar variable booleana que decide si el villano tiene poder de aumentar vida o no.
     */
    public void insertV(int idPer, boolean bando, String nombre, int vida, int ataque, boolean poderSanar)
    {
        String sql = "INSERT INTO VILLANO (idPer,bando,nombre,vida,ataque, poderSanar) VALUES(?,?,?,?,?,?)";

        try
                (
                        Connection conn = this.connect();
                        PreparedStatement pstmt = conn.prepareStatement(sql)
                )
        {
          pstmt.setInt(1, idPer);
          pstmt.setBoolean(2, bando);
          pstmt.setString(3, nombre);
          pstmt.setInt(4, vida);
          pstmt.setInt(5, ataque);
          pstmt.setBoolean(6, poderSanar);
          pstmt.executeUpdate();
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    /**Método en donde se añaden los personajes, superhéroes y villanos.
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        InsertData app = new InsertData();

        // insert los persoanjes
        
        app.insertP(0,true,"Batman",400,100);
        app.insertP(1,true,"Superman",300,110);
        app.insertP(2,false,"Joker", 500, 80);
        app.insertP(3, false, "Thanos", 250, 130);
        
        app.insertS(0,true,"Batman",400,100,false);
        app.insertS(1,true,"Superman",300,110,true);
        
        app.insertV(2,false,"Joker", 500, 80,false);
        app.insertV(3, false, "Thanos", 250, 130,true);
    }

}

