/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_carlosbarahona;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab3P2_CarlosBarahona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner r = new Scanner(System.in);
        Programadores david = new Programadores("david", "1234", "David", "Apellido", 1, "Admin", 5, 50000, "Java", "9-5");
        ArrayList<Administradores> admins = new ArrayList();
        ArrayList<Clientes> clientes = new ArrayList();
        ArrayList<Motoristas> motoristas = new ArrayList();
        ArrayList<Programadores> programadores = new ArrayList();
        ArrayList<Restaurante> restaurante = new ArrayList();
        int opcion=0;
        while(opcion!=3){
            System.out.println("Bienvenido a Hugo\n"
                    + "¿Qué desea hacer?\n"
                    + "1) Iniciar sesión"
                    + "2) Registrarse"
                    + "3) Salir");
            opcion=r.nextInt();
            switch(opcion){
            
            
            }
        
        }

    }

}
