/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_carlosbarahona;

import java.util.ArrayList;
import java.util.Random;
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
        Random r2 = new Random();
        Programadores david = new Programadores("david", "1234", "David", "Apellido", 1, "Admin", 5, 50000, "Java", "9-5");
        ArrayList usuarios = new ArrayList();
        usuarios.add(david);
        ArrayList<Administradores> admins = new ArrayList();
        ArrayList<Clientes> clientes = new ArrayList();
        ArrayList<Motoristas> motoristas = new ArrayList();
        ArrayList<Programadores> programadores = new ArrayList();
        ArrayList<Restaurante> restaurante = new ArrayList();
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("Bienvenido a Hugo\n"
                    + "¿Qué desea hacer?\n"
                    + "1) Iniciar sesión\n"
                    + "2) Registrarse\n"
                    + "3) Salir");
            opcion = r.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese su nombre de usuario");
                    String usuario = r.next();
                    System.out.println("Ingrese su contraseña");
                    String contraseña = r.next();
                    int item = 0;
                    int usuarioN = 0;
                    for (int i = 0; i < usuarios.size(); i++) {
                        String usuario2 = "";
                        String contraseña2 = "";
                        String usuario3 = "";
                        String contraseña3 = "";
                        String usuario4 = "";
                        String contraseña4 = "";
                        String usuario5 = "";
                        String contraseña5 = "";

                        if (usuarios.get(i) instanceof Administradores) {
                            usuario2 = ((Administradores) usuarios.get(i)).getUsuario();

                            contraseña2 = ((Administradores) usuarios.get(i)).getContraseña();
                            if (usuario.equals(usuario2) && contraseña.equals(contraseña2)) {
                                item = i;
                                usuarioN = 1;
                                i = usuarios.size();
                            }else{
                            item=1000;
                            }
                        } else if (usuarios.get(i) instanceof Programadores) {
                            usuario3 = ((Programadores) usuarios.get(i)).getUsuario();
                            contraseña3 = ((Programadores) usuarios.get(i)).getContraseña();
                            if (usuario.equals(usuario3) && contraseña.equals(contraseña3)) {
                                item = i;
                                usuarioN = 2;
                                i = usuarios.size();
                            }else{
                            item=1000;
                            }
                        } else if (usuarios.get(i) instanceof Motoristas) {
                            usuario4 = ((Motoristas) usuarios.get(i)).getUsuario();
                            contraseña4 = ((Motoristas) usuarios.get(i)).getContraseña();
                            if (usuario.equals(usuario4) && contraseña.equals(contraseña4)) {
                                item = i;
                                usuarioN = 3;
                                i = usuarios.size();
                            }else{
                            item=1000;
                            }
                        } else if (usuarios.get(i) instanceof Clientes) {
                            usuario5 = ((Clientes) usuarios.get(i)).getUsuario();
                            contraseña5 = ((Clientes) usuarios.get(i)).getContraseña();
                            if (usuario.equals(usuario5) && contraseña.equals(contraseña5)) {
                                item = i;
                                usuarioN = 4;
                                i = usuarios.size();
                            }else{
                            item=1000;
                            }
                        }

                        if (item <= usuarios.size()) {
                            if (usuarios.get(item) instanceof Administradores && usuarioN == 1) {
                                System.out.println("¿Que desea hacer?\n"
                                        + "1) Modificar mi información\n"
                                        + "2) Visualizar mi información\n"
                                        + "3) Salir\n");
                                int opcion2 = r.nextInt();
                                while (opcion2 != 3) {
                                    switch (opcion2) {
                                        case 1: {
                                            System.out.println("¿Que desea modificar?\n"
                                                    + "1) Usuario"
                                                    + "2) Contraseña"
                                                    + "3) Nombre"
                                                    + "4) Apellido"
                                                    + "5) ID"
                                                    + "6) Puesto"
                                                    + "7) Años que ha tenido en el cargo"
                                                    + "8) Salario base"
                                                    + "9) Años de experiencia en ventas");
                                            int variable = r.nextInt();
                                            switch (variable) {
                                                case 1: {
                                                    ((Administradores) usuarios.get(item)).setUsuario(r.next());
                                                    break;
                                                }
                                                case 2: {
                                                    ((Administradores) usuarios.get(item)).setContraseña(r.next());
                                                    break;
                                                }
                                                case 3: {
                                                    ((Administradores) usuarios.get(item)).setNombre(r.next());
                                                    break;
                                                }
                                                case 4: {
                                                    ((Administradores) usuarios.get(item)).setApellido(r.next());
                                                    break;
                                                }
                                                case 5: {
                                                    ((Administradores) usuarios.get(item)).setID(r.nextInt());
                                                    break;
                                                }
                                                case 6: {
                                                    ((Administradores) usuarios.get(item)).setPuesto(r.next());
                                                    break;
                                                }
                                                case 7: {
                                                    ((Administradores) usuarios.get(item)).setAñosCargo(r.nextInt());
                                                    break;
                                                }
                                                case 8: {
                                                    ((Administradores) usuarios.get(item)).setSalarioBase(r.nextInt());
                                                    break;
                                                }
                                                case 9: {
                                                    ((Administradores) usuarios.get(item)).setAñosExperienciaV(r.nextInt());
                                                    break;
                                                }

                                            }

                                        }
                                        case 2: {
                                            System.out.println( usuarios.get(item));
                                        }
                                    }

                                }

                            } else if (usuarios.get(item) instanceof Programadores && usuarioN==2) {
                                System.out.println("¿Que desea hacer?"
                                        + "1) ");

                            } else if (usuarios.get(item) instanceof Motoristas && usuarioN==3) {
                                System.out.println("¿Que desea hacer?\n"
                                        + "1) Modificar mi información\n"
                                        + "2) Visualizar mi información\n"
                                        + "3) Salir\n");
                                int opcion2 = r.nextInt();
                                while (opcion2 != 3) {
                                    switch (opcion2) {
                                        case 1: {
                                            System.out.println("¿Que desea modificar?\n"
                                                    + "1) Usuario"
                                                    + "2) Contraseña"
                                                    + "3) Nombre"
                                                    + "4) Apellido"
                                                    + "5) ID"
                                                    + "6) Puesto"
                                                    + "7) Años que ha tenido en el cargo"
                                                    + "8) Salario base"
                                                    + "9) Comisiones"
                                                    + "10) Medio de transporte"
                                                    + "11) Cantidad de encargos que puede llevar a la vez");
                                            int variable = r.nextInt();
                                            switch (variable) {
                                                case 1: {
                                                    ((Motoristas) usuarios.get(item)).setUsuario(r.next());
                                                    break;
                                                }
                                                case 2: {
                                                    ((Motoristas) usuarios.get(item)).setContraseña(r.next());
                                                    break;
                                                }
                                                case 3: {
                                                    ((Motoristas) usuarios.get(item)).setNombre(r.next());
                                                    break;
                                                }
                                                case 4: {
                                                    ((Motoristas) usuarios.get(item)).setApellido(r.next());
                                                    break;
                                                }
                                                case 5: {
                                                    ((Motoristas) usuarios.get(item)).setID(r.nextInt());
                                                    break;
                                                }
                                                case 6: {
                                                    ((Motoristas) usuarios.get(item)).setPuesto(r.next());
                                                    break;
                                                }
                                                case 7: {
                                                    ((Motoristas) usuarios.get(item)).setAñosCargo(r.nextInt());
                                                    break;
                                                }
                                                case 8: {
                                                    ((Motoristas) usuarios.get(item)).setSalarioBase(r.nextInt());
                                                    break;
                                                }
                                                case 9: {
                                                    ((Motoristas) usuarios.get(item)).setComisiones(r.nextInt());
                                                    break;
                                                }
                                                case 10: {
                                                    ((Motoristas) usuarios.get(item)).setMedioTransporte(r.next());

                                                    break;
                                                }
                                                case 11: {
                                                    ((Motoristas) usuarios.get(item)).setCantidadEncargosVez(r.nextInt());

                                                    break;
                                                }

                                            }
                                            break;
                                        }

                                        case 2: {
                                            System.out.println( usuarios.get(item));
                                        }

                                    }

                                }

                            } else if (usuarios.get(item) instanceof Clientes && usuarioN==4) {
                                System.out.println("¿Que desea hacer?\n"
                                        + "1) Comprar comida\n"
                                        + "2) Comprar articulo\n"
                                        + "3) Modificar información\n"
                                        + "4) Eliminar cuenta\n"
                                        + "5) Listar información\n"
                                        + "6) Salir");
                                int opcion2 = r.nextInt();
                                while (opcion2 != 6) {
                                    switch (opcion2) {
                                        case 1: {
                                            System.out.println("¿De cual restaurante desea comprar?");
                                            for (int x = 0; x < restaurante.size(); x++) {
                                                System.out.println(x + ") " + restaurante.get(x));
                                            }
                                            String restaurante2 = r.next();
                                            int n = 0;
                                            for (int y = 0; y < restaurante.size(); y++) {
                                                String nombre = ((Restaurante) restaurante.get(y)).getNombre();
                                                if (restaurante2.equals(nombre)) {
                                                    n = i;
                                                    i = restaurante.size();
                                                } else {
                                                    n = 1000;
                                                }
                                            }
                                            if (n <= restaurante.size()) {
                                                if (restaurante.get(n) instanceof Restaurante) {
                                                    System.out.println("¿Que comida desea comprar?");
                                                    for (int x = 0; x < restaurante.get(n).getListaComidas().size(); x++) {
                                                        System.out.println(x + ") " + restaurante.get(n).getListaComidas().get(x));
                                                    }
                                                    String comida2 = r.next();
                                                    int n2 = 0;
                                                    for (int y = 0; y < restaurante.get(n).getListaComidas().size(); y++) {
                                                        String nombre = (restaurante.get(n).getListaComidas().get(y).getNombre2());
                                                        if (comida2.equals(nombre)) {
                                                            n2 = i;
                                                            i = restaurante.get(n).getListaComidas().size();
                                                        } else {
                                                            n2 = 1000;
                                                        }
                                                    }
                                                    if (n2 <= restaurante.get(n).getListaComidas().size()) {
                                                        if (restaurante.get(n).getListaComidas().get(n2) instanceof Comidas) {
                                                            System.out.println("¿Desea agregar un complemento?");
                                                            String resp = r.next();
                                                            if (resp.equalsIgnoreCase("Si")) {
                                                                System.out.println("¿Que acompañamiento desea agregar?");
                                                                for (int x = 0; x < restaurante.get(n).getListaComidas().get(n2).getListaAcompañamientos().size(); x++) {
                                                                    System.out.println(x + ") " + restaurante.get(n).getListaComidas().get(n2).getListaAcompañamientos().get(x));
                                                                }
                                                                String acompañamiento = r.next();
                                                                int n3 = 0;
                                                                for (int y = 0; y < restaurante.get(n).getListaComidas().get(n2).getListaAcompañamientos().size(); y++) {
                                                                    String nombre = restaurante.get(n).getListaComidas().get(n2).getListaAcompañamientos().get(y).getNombre3();
                                                                    if (acompañamiento.equals(nombre)) {
                                                                        n3 = i;
                                                                        i = restaurante.get(n).getListaComidas().get(n2).getListaAcompañamientos().size();
                                                                    } else {
                                                                        n3 = 1000;
                                                                    }
                                                                }
                                                                if (n3 <= restaurante.get(n).getListaComidas().get(n2).getListaAcompañamientos().size()) {
                                                                    if (restaurante.get(n).getListaComidas().get(n2).getListaAcompañamientos().get(n3) instanceof Acompañamientos) {
                                                                        int total= restaurante.get(n).getListaComidas().get(n2).getPrecio()+restaurante.get(n).getListaComidas().get(n2).getListaAcompañamientos().get(n3).getPrecioAdicional();
                                                                        System.out.println("Su total es:"+ " "+ total);
                                                                         
                                                                        int randomNum= r2.nextInt((motoristas.size()-0)+1)+0;
                                                                    }
                                                                }
                                                            } else {
                                                            }

                                                        }
                                                    }

                                                }

                                            }
                                            break;
                                        }
                                        case 2: {
                                            break;
                                        }
                                        case 3: {
                                            System.out.println("¿Que desea modificar?\n"
                                                    + "1) Usuario"
                                                    + "2) Contraseña"
                                                    + "3) Nombre"
                                                    + "4) Apellido"
                                                    + "5) Domocilio"
                                                    + "6) ID"
                                                   );
                                            int variable = r.nextInt();
                                            switch (variable) {
                                                case 1: {
                                                    ((Clientes) usuarios.get(item)).setUsuario(r.next());
                                                    break;
                                                }
                                                case 2: {
                                                    ((Clientes) usuarios.get(item)).setContraseña(r.next());
                                                    break;
                                                }
                                                case 3: {
                                                    ((Clientes) usuarios.get(item)).setNombre(r.next());
                                                    break;
                                                }
                                                case 4: {
                                                    ((Clientes) usuarios.get(item)).setApellido(r.next());
                                                    break;
                                                }
                                                case 5: {
                                                    ((Clientes) usuarios.get(item)).setDomicilio(r.next());
                                                    break;
                                                }
                                                case 6: {
                                                    ((Clientes) usuarios.get(item)).setID(r.nextInt());
                                                    break;
                                                }
                                               

                                            }
                                            break;
                                        }
                                        
                                        case 6:{
                                            System.out.println("¿Seguro que desea eliminar su cuenta?");
                                            String respuesta = r.next();
                                            if(respuesta.equalsIgnoreCase("Si")){
                                                 usuarios.remove(item);
                                                 System.out.println("Usuario eliminado de manera excitosa");
                                                 opcion2=6;
                                            }else{
                                                System.out.println("Su usuario no fue eliminado");
                                            }
                                         break;
                                        }

                                        case 5: {
                                            System.out.println(usuarios.get(item));
                                        }

                                    }

                                }
                            }

                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Bienvenido al registro de clientes");
                    System.out.println("Ingrese su nombre de usuario");
                    String usuario = r.next();
                    System.out.println("Ingrese su contraseña");
                    String contraseña = r.next();
                    System.out.println("Ingrese su nombre");
                    String nombre = r.next();
                    System.out.println("Ingrese su apellido");
                    String apellido = r.next();
                    System.out.println("Ingrese su domicilio");
                    String domicilio = r.next();
                    System.out.println("Ingrese su ID");
                    int ID = r.nextInt();
                    usuarios.add(new Clientes(usuario, contraseña, nombre, apellido, domicilio, ID, 0));
                    break;
                }

            }

        }

    }

}
