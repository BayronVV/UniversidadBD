/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author Bayron Vargas
 */
import Modelo.*;
import Servicios.Conexion;
public class Servicios {
    
    public void RegistrarD(Docente d){
        
         try{
        
            DocenteServicios ds = new DocenteServicios();
            ds.guardar(Conexion.obtener(), d);
        }
        catch(Exception e){
        
        }
    
    }
    public void EliminarD(Docente d){
    
        try{
        
            DocenteServicios ds = new DocenteServicios();
            ds.eliminar(Conexion.obtener(), d);
        }
        catch(Exception e){
        
        }
    
    }
    
}
