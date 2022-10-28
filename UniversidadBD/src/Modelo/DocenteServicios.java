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
           consulta = conexion.prepareStatement("DELETE FROM docente WHERE `docente`.`codigo`='"+d.getCodigo()+"'");
          
       
           consulta.executeUpdate();
            
        }
        catch (SQLException ex){
            
            throw new SQLException(ex);
        
        }
    
    }
    
}
    

