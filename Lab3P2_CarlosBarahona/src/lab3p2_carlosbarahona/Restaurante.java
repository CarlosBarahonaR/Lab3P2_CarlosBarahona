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
public class Restaurante {
    private String ubicacion;
    private String nombre;
    private int RTN;
    private String slogan;
    private ArrayList<Comidas> listaComidas;

    public Restaurante() {
    }

    public Restaurante(String ubicacion, String nombre, int RTN, String slogan, ArrayList<Comidas> listaComidas) {
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.RTN = RTN;
        this.slogan = slogan;
        this.listaComidas = listaComidas;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRTN() {
        return RTN;
    }

    public void setRTN(int RTN) {
        this.RTN = RTN;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public ArrayList<Comidas> getListaComidas() {
        return listaComidas;
    }

    public void setListaComidas(ArrayList<Comidas> listaComidas) {
        this.listaComidas = listaComidas;
    }

    @Override
    public String toString() {
        return "Restaurante{" + "ubicacion=" + ubicacion + ", nombre=" + nombre + ", RTN=" + RTN + ", slogan=" + slogan + ", listaComidas=" + listaComidas + '}';
    }
    
    
    
}
