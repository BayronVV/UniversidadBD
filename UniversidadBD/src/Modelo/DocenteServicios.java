/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Bayron Vargas
 */
import java.sql.*;
public class DocenteServicios {
    
    public String a;
    
    public void guardar(Connection conexion, Docente d) throws SQLException{
    
        try{
            
           PreparedStatement consulta;
           consulta = conexion.prepareStatement("INSERT INTO docente (codigo, nombre, apellido, direccion)"+"VALUES(?,?,?,?)");
           consulta.setString(1, d.getCodigo());
           consulta.setString(2, d.getNombre());
           consulta.setString(3, d.getApellido());
           consulta.setString(4, d.getDireccion());
           consulta.executeUpdate();
            
        }
        catch (SQLException ex){
            
            throw new SQLException(ex);
        
        }
    }
    
    public void eliminar(Connection conexion, Docente d)throws SQLException{
    
        try{
            
           PreparedStatement consulta;
           consulta = conexion.prepareStatement("DELETE FROM docente WHERE `docente`.`codigo`=?");
           consulta.setString(1, d.getCodigo());
       
           consulta.executeUpdate();
            
        }
        catch (SQLException ex){
            
            throw new SQLException(ex);
        
        }
    
    }
    
    public void buscar(Connection conexion, Docente d) throws SQLException{
    
        try{
            
           PreparedStatement consulta;
           consulta = conexion.prepareStatement("select * from docente where codigo=? ");
           consulta.setString(1, d.getCodigo());
          ResultSet rs = consulta.executeQuery();
          
          while(rs.next()){
              
              d.setNombre(rs.getString("nombre"));
              d.setApellido(rs.getString("apellido"));
              d.setDireccion(rs.getString("direccion"));
              
              
              String nombre = rs.getString("nombre");
              String apellido= rs.getString("apellido"); 
              String direccion= rs.getString("direccion");
              
              System.out.println(""+nombre+" "+apellido+" "+direccion);
               a = ""+nombre+" "+apellido+" "+direccion;
          
          }
         
           
          
            
        }
        catch (SQLException ex){
            
            throw new SQLException(ex);
        
        }
    }
    
    public void actualizar(Connection conexion, Docente d) throws SQLException{
    
        try{
            
           PreparedStatement consulta;
           consulta = conexion.prepareStatement("UPDATE docente set nombre=?, apellido=?, direccion=? where codigo=?");
          
           consulta.setString(1, d.getNombre());
           consulta.setString(2, d.getApellido());
           consulta.setString(3, d.getDireccion());
           consulta.setString(4, d.getCodigo());
           consulta.executeUpdate();
            
        }
        catch (SQLException ex){
            
            throw new SQLException(ex);
        
        }
    }
    
}
    

