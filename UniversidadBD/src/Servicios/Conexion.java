/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

/**
 *
 * @author Bayron Vargas
 */
import java.sql.*;
public class Conexion {
    
    private static Connection cnx = null;
    public static Connection obtener() throws SQLException, ClassNotFoundException{
    
        if(cnx==null){
        
            try{
               Class.forName("com.mysql.jdbc.Driver");
               cnx = DriverManager.getConnection("jdbc:mysql://localhost/universidad","root","");
              
            }
            catch(SQLException ex){
                
                 throw new SQLException(ex);
            
            }
            catch(ClassNotFoundException ex){
            
                 throw new ClassNotFoundException(ex.getMessage());
            
            }
        
        }
        
        return cnx;
    
    }
    
    public static void cerrar() throws SQLException{
    
        if(cnx != null){
          cnx.close();
        }
    
    
    }
    
}
