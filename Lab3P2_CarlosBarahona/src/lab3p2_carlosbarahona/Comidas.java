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
public class Comidas extends Restaurante {

    private String ID;
    private String nombre2;
    private int precio;
    private int cantidadAcompañamientos;
    private ArrayList<Acompañamientos> listaAcompañamientos;

    public Comidas() {
    }

    public Comidas(String ID, String nombre2, int precio, int cantidadAcompañamientos, ArrayList<Acompañamientos> listaAcompañamientos) {
        this.ID = ID;
        this.nombre2 = nombre2;
        this.precio = precio;
        this.cantidadAcompañamientos = cantidadAcompañamientos;
        this.listaAcompañamientos = listaAcompañamientos;
    }

    public Comidas(String ID, String nombre2, int precio, int cantidadAcompañamientos, ArrayList<Acompañamientos> listaAcompañamientos, String ubicacion, String nombre, int RTN, String slogan, ArrayList<Comidas> listaComidas) {
        super(ubicacion, nombre, RTN, slogan, listaComidas);
        this.ID = ID;
        this.nombre2 = nombre2;
        this.precio = precio;
        this.cantidadAcompañamientos = cantidadAcompañamientos;
        this.listaAcompañamientos = listaAcompañamientos;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidadAcompañamientos() {
        return cantidadAcompañamientos;
    }

    public void setCantidadAcompañamientos(int cantidadAcompañamientos) {
        this.cantidadAcompañamientos = cantidadAcompañamientos;
    }

    public ArrayList<Acompañamientos> getListaAcompañamientos() {
        return listaAcompañamientos;
    }

    public void setListaAcompañamientos(ArrayList<Acompañamientos> listaAcompañamientos) {
        this.listaAcompañamientos = listaAcompañamientos;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre2;
    }

}
