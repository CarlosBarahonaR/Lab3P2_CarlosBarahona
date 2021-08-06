/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_carlosbarahona;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Articulos extends Tiendas {
    private String nombre;
    private String categoria;
    private int precio;

    public Articulos(String nombre, String categoria, int precio, String Nombre, String ubicacionMasCercana, int cantidadEmpleados, int tiempoDeEspera, ArrayList<Articulos> listaArticulos) {
        super(Nombre, ubicacionMasCercana, cantidadEmpleados, tiempoDeEspera, listaArticulos);
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre;
    }
    
    
    
    
}
