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
public class Programadores extends Usuario {

    private String nombre;
    private String apellido;
    private int ID;
    private String puesto;
    private int añosCargo;
    private int salarioBase;
    private String lenguajeProgDom;
    private String horarioTrabajo;

    public Programadores(String nombre, String apellido, int ID, String puesto, int añosCargo, int salarioBase, String lenguajeProgDom, String horarioTrabajo, String usuario, String contraseña) {
        super(usuario, contraseña);
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.puesto = puesto;
        this.añosCargo = añosCargo;
        this.salarioBase = salarioBase;
        this.lenguajeProgDom = lenguajeProgDom;
        this.horarioTrabajo = horarioTrabajo;
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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getAñosCargo() {
        return añosCargo;
    }

    public void setAñosCargo(int añosCargo) {
        this.añosCargo = añosCargo;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getLenguajeProgDom() {
        return lenguajeProgDom;
    }

    public void setLenguajeProgDom(String lenguajeProgDom) {
        this.lenguajeProgDom = lenguajeProgDom;
    }

    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }

    public void setHorarioTrabajo(String horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre;
    }

}
