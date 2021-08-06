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
public class Tiendas {

    private String Nombre;
    private String ubicacionMasCercana;
    private int cantidadEmpleados;
    private int tiempoDeEspera;
    private ArrayList<Articulos> listaArticulos;

    public Tiendas(String Nombre, String ubicacionMasCercana, int cantidadEmpleados, int tiempoDeEspera, ArrayList<Articulos> listaArticulos) {
        this.Nombre = Nombre;
        this.ubicacionMasCercana = ubicacionMasCercana;
        this.cantidadEmpleados = cantidadEmpleados;
        this.tiempoDeEspera = tiempoDeEspera;
        this.listaArticulos = listaArticulos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUbicacionMasCercana() {
        return ubicacionMasCercana;
    }

    public void setUbicacionMasCercana(String ubicacionMasCercana) {
        this.ubicacionMasCercana = ubicacionMasCercana;
    }

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    public void setCantidadEmpleados(int cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }

    public int getTiempoDeEspera() {
        return tiempoDeEspera;
    }

    public void setTiempoDeEspera(int tiempoDeEspera) {
        this.tiempoDeEspera = tiempoDeEspera;
    }

    public ArrayList<Articulos> getListaArticulos() {
        return listaArticulos;
    }

    public void setListaArticulos(ArrayList<Articulos> listaArticulos) {
        this.listaArticulos = listaArticulos;
    }

    @Override
    public String toString() {
        return "Nombre=" + Nombre;
    }

}
