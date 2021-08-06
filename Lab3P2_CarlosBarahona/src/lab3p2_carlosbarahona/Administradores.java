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
public class Administradores {

    private String usuario;
    private String contraseña;
    private String nombre;
    private String apellido;
    private int ID;
    private String puesto;
    private int añosCargo;
    private int salarioBase;
    private int añosExperienciaV;

    public Administradores(String usuario, String contraseña, String nombre, String apellido, int ID, String puesto, int añosCargo, int salarioBase, int añosExperienciaV) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.puesto = puesto;
        this.añosCargo = añosCargo;
        this.salarioBase = salarioBase;
        this.añosExperienciaV = añosExperienciaV;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
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

    public int getAñosExperienciaV() {
        return añosExperienciaV;
    }

    public void setAñosExperienciaV(int añosExperienciaV) {
        this.añosExperienciaV = añosExperienciaV;
    }

    @Override
    public String toString() {
        return "Administradores{" + "usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", nombre=" + nombre + ", apellido=" + apellido + ", ID=" + ID + ", puesto=" + puesto + ", a\u00f1osCargo=" + añosCargo + ", salarioBase=" + salarioBase + ", a\u00f1osExperienciaV=" + añosExperienciaV + '}';
    }

}
