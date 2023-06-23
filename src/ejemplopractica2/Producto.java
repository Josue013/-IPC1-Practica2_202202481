/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopractica2;

import java.io.Serializable;

/**
 *
 * @author Josue Hurtarte
 */
public class Producto implements Serializable {
    
    public String nombre;
    public String precio;

    public Producto(String nombre, String precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    
    
    
}
