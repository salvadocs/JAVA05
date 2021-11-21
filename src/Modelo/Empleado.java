/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Salva
 */
public class Empleado {
    
    private int numero;
    private String nombre;
    private String apellido;
    private String foto;
    private float sueldo;
    private float sueldoMax;
    private Date fechaAlta;
        
    
    public Empleado(){
    
    }
    
    public Empleado(int numero, String nombre, String apellido, String foto, float sueldo, float sueldoMax, Date fechaAlta){
        this.numero = numero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.foto = foto;
        this.sueldo = sueldo;
        this.sueldoMax = sueldoMax;
        this.fechaAlta = fechaAlta;
    }
    //Metodos get
    public int getNumero(){
        return numero;
    }

    public String getNombre(){
        return nombre;
    }

    public String getapellido(){
        return apellido;
    }
    
    public String getFoto(){
        return foto;
    }
    
    public float getSueldo(){
        return sueldo;
    }
    
    public float getSueldoMax(){
        return sueldoMax;
    }
    
    public Date getFechaAlta(){
        return fechaAlta;
    }
    
    //Metodos set
    public void setNumero(){
        this.numero = numero;
    }
    
    public void setNombre(){
        this.nombre = nombre;
    }

    public void setApellido(){
        this.apellido = apellido;
    }     
    
    public void setFoto(){
        this.foto = foto;
    }     
    
    public void setSueldo(){
        this.sueldo = sueldo;
    }  
    
    public void setSueldoMax(){
        this.sueldoMax = sueldoMax;
    }  
    
    public void setFechaAlt(){
        this.fechaAlta = fechaAlta;
    }  
}
