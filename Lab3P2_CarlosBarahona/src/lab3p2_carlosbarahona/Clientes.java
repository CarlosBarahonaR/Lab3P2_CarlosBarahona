/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_carlosbarahona;

/**
 *
 * @author Admin
 */
public class Clientes extends Usuario {


    private String nombre;
    private String apellido;
    private String domicilio;
    private int ID;
    private int cantidadPedidos;

    public Clientes(String nombre, String apellido, String domicilio, int ID, int cantidadPedidos, String usuario, String contraseña) {
        super(usuario, contraseña);
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.ID = ID;
        this.cantidadPedidos = cantidadPedidos;
    }

  

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCantidadPedidos() {
        return cantidadPedidos;
    }

    public void setCantidadPedidos(int cantidadPedidos) {
        this.cantidadPedidos = cantidadPedidos;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre;
    }

}
