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
public class Motoristas extends Usuario {


    private String nombre;
    private String apellido;
    private int ID;
    private String puesto;
    private int añosCargo;
    private int salarioBase;
    private int comisiones;
    private String medioTransporte;
    private int cantidadEncargosVez;

    public Motoristas(String nombre, String apellido, int ID, String puesto, int añosCargo, int salarioBase, int comisiones, String medioTransporte, int cantidadEncargosVez, String usuario, String contraseña) {
        super(usuario, contraseña);
       
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.puesto = puesto;
        this.añosCargo = añosCargo;
        this.salarioBase = salarioBase;
        this.comisiones = comisiones;
        this.medioTransporte = medioTransporte;
        this.cantidadEncargosVez = cantidadEncargosVez;
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

    public int getComisiones() {
        return comisiones;
    }

    public void setComisiones(int comisiones) {
        this.comisiones = comisiones;
    }

    public String getMedioTransporte() {
        return medioTransporte;
    }

    public void setMedioTransporte(String medioTransporte) {
        this.medioTransporte = medioTransporte;
    }

    public int getCantidadEncargosVez() {
        return cantidadEncargosVez;
    }

    public void setCantidadEncargosVez(int cantidadEncargosVez) {
        this.cantidadEncargosVez = cantidadEncargosVez;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre ;
    }

}
