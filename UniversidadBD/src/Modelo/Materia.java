/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Bayron Vargas
 */
public class Materia {
    
    private String codigo;
    private String nombre;
    private String creditos;
    private String codProfesor;

    public Materia() {
    }

    public Materia(String codigo, String nombre, String creditos, String codProfesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.codProfesor = codProfesor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getCodProfesor() {
        return codProfesor;
    }

    public void setCodProfesor(String codProfesor) {
        this.codProfesor = codProfesor;
    }
    
    
    
}
