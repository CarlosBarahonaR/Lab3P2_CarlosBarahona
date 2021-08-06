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
public class Acompañamientos extends Comidas {

    private String nombre3;
    private String tipo;
    private int precioAdicional;

    public Acompañamientos(String nombre3, String tipo, int precioAdicional) {
        this.nombre3 = nombre3;
        this.tipo = tipo;
        this.precioAdicional = precioAdicional;
    }

    public Acompañamientos(String nombre3, String tipo, int precioAdicional, String ID, String nombre2, int precio, int cantidadAcompañamientos, ArrayList<Acompañamientos> listaAcompañamientos, String ubicacion, String nombre, int RTN, String slogan, ArrayList<Comidas> listaComidas) {
        super(ID, nombre2, precio, cantidadAcompañamientos, listaAcompañamientos, ubicacion, nombre, RTN, slogan, listaComidas);
        this.nombre3 = nombre3;
        this.tipo = tipo;
        this.precioAdicional = precioAdicional;
    }

    public String getNombre3() {
        return nombre3;
    }

    public void setNombre3(String nombre3) {
        this.nombre3 = nombre3;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecioAdicional() {
        return precioAdicional;
    }

    public void setPrecioAdicional(int precioAdicional) {
        this.precioAdicional = precioAdicional;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre3;
    }

}
