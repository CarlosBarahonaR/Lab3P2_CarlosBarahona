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
        Programadores david = new Programadores( "David", "Apellido", 1, "Admin", 5, 50000, "Java", "9-5", "david", "1234");
        ArrayList usuarios = new ArrayList();
        usuarios.add(david);
        ArrayList<Administradores> admins = new ArrayList();
        ArrayList<Clientes> clientes = new ArrayList();
        ArrayList<Motoristas> motoristas = new ArrayList();
        ArrayList<Programadores> programadores = new ArrayList();
        ArrayList<Restaurante> restaurante = new ArrayList();
        ArrayList<Tiendas> tiendas = new ArrayList();
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
                            } else {
                                item = 1000;
                            }
                        } else if (usuarios.get(i) instanceof Programadores) {
                            usuario3 = ((Programadores) usuarios.get(i)).getUsuario();
                            contraseña3 = ((Programadores) usuarios.get(i)).getContraseña();
                            if (usuario.equals(usuario3) && contraseña.equals(contraseña3)) {
                                item = i;
                                usuarioN = 2;
                                i = usuarios.size();
                            } else {
                                item = 1000;
                            }
                        } else if (usuarios.get(i) instanceof Motoristas) {
                            usuario4 = ((Motoristas) usuarios.get(i)).getUsuario();
                            contraseña4 = ((Motoristas) usuarios.get(i)).getContraseña();
                            if (usuario.equals(usuario4) && contraseña.equals(contraseña4)) {
                                item = i;
                                usuarioN = 3;
                                i = usuarios.size();
                            } else {
                                item = 1000;
                            }
                        } else if (usuarios.get(i) instanceof Clientes) {
                            usuario5 = ((Clientes) usuarios.get(i)).getUsuario();
                            contraseña5 = ((Clientes) usuarios.get(i)).getContraseña();
                            if (usuario.equals(usuario5) && contraseña.equals(contraseña5)) {
                                item = i;
                                usuarioN = 4;
                                i = usuarios.size();
                            } else {
                                item = 1000;
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
                                            System.out.println(usuarios.get(item));
                                        }
                                    }

                                }

                            } else if (usuarios.get(item) instanceof Programadores && usuarioN == 2) {
                                System.out.println("Seleccione la opcion con la cual desea hacer el CRUD\n"
                                        + "1) Administradores\n"
                                        + "2) Programadores\n"
                                        + "3) Motoristas\n"
                                        + "4) Clientes\n"
                                        + "5) Restaurantes\n"
                                        + "6) Tiendas\n"
                                        + "7) Salir");
                                int opcionn = r.nextInt();
                                while (opcionn != 7) {
                                    switch (opcionn) {
                                        case 1: {
                                            System.out.println("¿Que desea hacer?\n"
                                                    + "1) Agregar administrador\n"
                                                    + "2) Modificar administrador\n"
                                                    + "3) Eliminar administrador\n"
                                                    + "4) Listar administradores\n");
                                            int op = r.nextInt();
                                            while (op != 5) {
                                                switch (op) {
                                                    case 1: {
                                                        System.out.println("Ingrese el usuario del administrador");
                                                        String usuarioo = r.next();
                                                        System.out.println("Ingrese la contraseña del administrador");
                                                        String contraseñaa = r.next();
                                                        System.out.println("Ingrese el nombre del administrador");
                                                        String nombre = r.next();
                                                        System.out.println("Ingrese el apellido del administrador");
                                                        String apellido = r.next();
                                                        System.out.println("Ingrese el ID del administrador");
                                                        int ID = r.nextInt();
                                                        System.out.println("Ingrese el puesto del administrador");
                                                        String puesto = r.next();
                                                        System.out.println("Ingrese los años de experiencia en el cargo del administrador");
                                                        int añosExp = r.nextInt();
                                                        System.out.println("Ingrese el salario base del administrador");
                                                        int salario = r.nextInt();
                                                        System.out.println("Ingrese los años de experiencia en venta del administrador");
                                                        int añosExpV = r.nextInt();
                                                        usuarios.add(new Administradores(nombre, apellido, ID, puesto, añosExp, salario, añosExpV, usuarioo, contraseñaa));
                                                        break;
                                                    }
                                                    case 2: {
                                                        System.out.println("Ingrese el ID del adminstrador para buscarlo");
                                                        int ID2 = r.nextInt();
                                                        int item2 = 0;
                                                        for (int x = 0; x < usuarios.size(); i++) {
                                                            int ID=0;
                                                            if(usuarios.get(i) instanceof Administradores){
                                                             ID = ((Administradores) usuarios.get(i)).getID();
                                                            }
                                                            if (ID2 == ID) {
                                                                item2 = i;
                                                                i = usuarios.size();
                                                            } else {
                                                                item2 = 1000;
                                                            }
                                                        }
                                                        if (item2 <= usuarios.size()) {
                                                            if (usuarios.get(item) instanceof Administradores) {
                                                                System.out.println("¿Que desea modificar?\n"
                                                                        + "1) Usuario\n"
                                                                        + "2) Contraseña\n"
                                                                        + "3) Nombre\n"
                                                                        + "4) Apellido\n"
                                                                        + "5) ID\n"
                                                                        + "6) Puesto\n"
                                                                        + "7) Años de experiencia en el cargo\n"
                                                                        + "8) Salario base\n"
                                                                        + "9) Años de experiencia en venta");
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
                                                        } else {
                                                            System.out.println("No se encontro el ID de administrador en la lista. Consulte con el soporte tecnico de la compañia.");
                                                        }
                                                        break;
                                                    }
                                                    case 3: {
                                                        System.out.println("Ingrese el ID del adminstrador para eliminarlo");
                                                        int ID2 = r.nextInt();
                                                        int item2 = 0;
                                                        for (int y = 0; y < usuarios.size(); y++) {
                                                            int ID = 0;
                                                            if (usuarios.get(y) instanceof Administradores) {
                                                                ID = ((Administradores) usuarios.get(i)).getID();
                                                            }
                                                            if (ID2 == ID) {
                                                                item2 = i;
                                                                i = usuarios.size();
                                                            } else {
                                                                item2 = 1000;
                                                            }
                                                        }
                                                        if (item <= usuarios.size()) {
                                                            usuarios.remove(item2);
                                                        } else {
                                                            System.out.println("No se encontro el ID de administrador en la lista. Consulte con el soporte tecnico de la compañia.");
                                                        }
                                                        break;
                                                    }
                                                    case 4: {
                                                        for (int z = 0; z < usuarios.size(); z++) {
                                                            if (usuarios.get(z) instanceof Administradores) {
                                                                System.out.println(usuarios.get(i));

                                                            }
                                                        }
                                                        break;
                                                    }
                                                }

                                            }
                                            break;
                                        }
                                        case 2: {
                                            System.out.println("¿Que desea hacer?\n"
                                                    + "1) Agregar programador\n"
                                                    + "2) Modificar programador\n"
                                                    + "3) Eliminar programador\n"
                                                    + "4) Listar programadores\n");
                                            int op = r.nextInt();
                                              while (op != 5) {
                                                switch (op) {
                                                    case 1: {
                                                        System.out.println("Ingrese el usuario del programador");
                                                        String usuarioo = r.next();
                                                        System.out.println("Ingrese la contraseña del programador");
                                                        String contraseñaa = r.next();
                                                        System.out.println("Ingrese el nombre del programador");
                                                        String nombre = r.next();
                                                        System.out.println("Ingrese el apellido del programador");
                                                        String apellido = r.next();
                                                        System.out.println("Ingrese el ID del programador");
                                                        int ID = r.nextInt();
                                                        System.out.println("Ingrese el puesto del programador");
                                                        String puesto = r.next();
                                                        System.out.println("Ingrese los años de experiencia en el cargo del programador");
                                                        int añosExp = r.nextInt();
                                                        System.out.println("Ingrese el salario base del programador");
                                                        int salario = r.nextInt();
                                                        System.out.println("Ingrese el lenguaje de programacion que domina programador");
                                                        String lenguajeProg = r.next();
                                                        System.out.println("Ingrese el horario de trabajo del programador (Ejemplo 9-5)");
                                                        String horario = r.next();
                                                        usuarios.add(new Programadores(nombre, apellido, ID, puesto, añosExp, salario, lenguajeProg,horario, usuarioo, contraseñaa));
                                                        break;
                                                    }
                                                    case 2: {
                                                        System.out.println("Ingrese el ID del programador para buscarlo");
                                                        int ID2 = r.nextInt();
                                                        int item2 = 0;
                                                        for (int x = 0; x < usuarios.size(); i++) {
                                                            int ID=0;
                                                            if(usuarios.get(i) instanceof Programadores){
                                                             ID = ((Programadores) usuarios.get(i)).getID();
                                                            }
                                                            if (ID2 == ID) {
                                                                item2 = i;
                                                                i = usuarios.size();
                                                            } else {
                                                                item2 = 1000;
                                                            }
                                                        }
                                                        if (item2 <= usuarios.size()) {
                                                            if (usuarios.get(item) instanceof Programadores) {
                                                                System.out.println("¿Que desea modificar?\n"
                                                                        + "1) Usuario\n"
                                                                        + "2) Contraseña\n"
                                                                        + "3) Nombre\n"
                                                                        + "4) Apellido\n"
                                                                        + "5) ID\n"
                                                                        + "6) Puesto\n"
                                                                        + "7) Años de experiencia en el cargo\n"
                                                                        + "8) Salario base\n"
                                                                        + "9) Lenguaje de programación que domina\n"
                                                                        + "10) Horario de trabajo");
                                                                int variable = r.nextInt();
                                                                switch (variable) {
                                                                    case 1: {
                                                                        ((Programadores) usuarios.get(item)).setUsuario(r.next());
                                                                        break;
                                                                    }
                                                                    case 2: {
                                                                        ((Programadores) usuarios.get(item)).setContraseña(r.next());
                                                                        break;
                                                                    }
                                                                    case 3: {
                                                                        ((Programadores) usuarios.get(item)).setNombre(r.next());
                                                                        break;
                                                                    }
                                                                    case 4: {
                                                                        ((Programadores) usuarios.get(item)).setApellido(r.next());
                                                                        break;
                                                                    }
                                                                    case 5: {
                                                                        ((Programadores) usuarios.get(item)).setID(r.nextInt());
                                                                        break;
                                                                    }
                                                                    case 6: {
                                                                        ((Programadores) usuarios.get(item)).setPuesto(r.next());
                                                                        break;
                                                                    }
                                                                    case 7: {
                                                                        ((Programadores) usuarios.get(item)).setAñosCargo(r.nextInt());
                                                                        break;
                                                                    }
                                                                    case 8: {
                                                                        ((Programadores) usuarios.get(item)).setSalarioBase(r.nextInt());
                                                                        break;
                                                                    }
                                                                    case 9: {
                                                                        ((Programadores) usuarios.get(item)).setLenguajeProgDom(r.next());
                                                                        break;
                                                                    }
                                                                    case 10: {
                                                                        ((Programadores) usuarios.get(item)).setHorarioTrabajo(r.next());
                                                                        break;
                                                                    }
                                                                    
                                                                }
                                                            }
                                                        } else {
                                                            System.out.println("No se encontro el ID de programador en la lista. Consulte con el soporte tecnico de la compañia.");
                                                        }
                                                        break;
                                                    }
                                                    case 3: {
                                                        System.out.println("Ingrese el ID del programador para eliminarlo");
                                                        int ID2 = r.nextInt();
                                                        int item2 = 0;
                                                        for (int y = 0; y < usuarios.size(); y++) {
                                                            int ID = 0;
                                                            if (usuarios.get(y) instanceof Programadores) {
                                                                ID = ((Programadores) usuarios.get(i)).getID();
                                                            }
                                                            if (ID2 == ID) {
                                                                item2 = i;
                                                                i = usuarios.size();
                                                            } else {
                                                                item2 = 1000;
                                                            }
                                                        }
                                                        if (item <= usuarios.size()) {
                                                            usuarios.remove(item2);
                                                        } else {
                                                            System.out.println("No se encontro el ID de Programadores en la lista. Consulte con el soporte tecnico de la compañia.");
                                                        }
                                                        break;
                                                    }
                                                    case 4: {
                                                        for (int z = 0; z < usuarios.size(); z++) {
                                                            if (usuarios.get(z) instanceof Programadores) {
                                                                System.out.println(usuarios.get(i));

                                                            }
                                                        }
                                                        break;
                                                    }
                                                }

                                            }
                                            break;
                                        }
                                        case 3: {
                                            System.out.println("¿Que desea hacer?\n"
                                                    + "1) Agregar motorista\n"
                                                    + "2) Modificar motorista\n"
                                                    + "3) Eliminar motorista\n"
                                                    + "4) Listar motoristas\n");
                                            int op = r.nextInt();
                                               while (op != 5) {
                                                switch (op) {
                                                    case 1: {
                                                        System.out.println("Ingrese el usuario del motorista");
                                                        String usuarioo = r.next();
                                                        System.out.println("Ingrese la contraseña del motorista");
                                                        String contraseñaa = r.next();
                                                        System.out.println("Ingrese el nombre del motorista");
                                                        String nombre = r.next();
                                                        System.out.println("Ingrese el apellido del motorista");
                                                        String apellido = r.next();
                                                        System.out.println("Ingrese el ID del motorista");
                                                        int ID = r.nextInt();
                                                        System.out.println("Ingrese el puesto del motorista");
                                                        String puesto = r.next();
                                                        System.out.println("Ingrese los años de experiencia en el cargo del motorista");
                                                        int añosExp = r.nextInt();
                                                        System.out.println("Ingrese el salario base del motorista");
                                                        int salario = r.nextInt();
                                                        System.out.println("Ingrese el nuevo total de comision del motorista");
                                                        int comisiones = r.nextInt();
                                                        System.out.println("Ingrese el medio de transporte del motorista");
                                                        String medioTransporte = r.next();
                                                        System.out.println("Ingrese la cantidad de encargos que puede cargar el motorista");
                                                        int encargos = r.nextInt();
                                                        usuarios.add(new Motoristas(nombre, apellido, ID, puesto, añosExp, salario, comisiones, medioTransporte, encargos, usuarioo, contraseñaa));
                                                        break;
                                                    }
                                                    case 2: {
                                                        System.out.println("Ingrese el ID del Motorista para buscarlo");
                                                        int ID2 = r.nextInt();
                                                        int item2 = 0;
                                                        for (int x = 0; x < usuarios.size(); i++) {
                                                            int ID=0;
                                                            if(usuarios.get(i) instanceof Motoristas){
                                                             ID = ((Motoristas) usuarios.get(i)).getID();
                                                            }
                                                            if (ID2 == ID) {
                                                                item2 = i;
                                                                i = usuarios.size();
                                                            } else {
                                                                item2 = 1000;
                                                            }
                                                        }
                                                        if (item2 <= usuarios.size()) {
                                                            if (usuarios.get(item) instanceof Motoristas) {
                                                                System.out.println("¿Que desea modificar?\n"
                                                                        + "1) Usuario\n"
                                                                        + "2) Contraseña\n"
                                                                        + "3) Nombre\n"
                                                                        + "4) Apellido\n"
                                                                        + "5) ID\n"
                                                                        + "6) Puesto\n"
                                                                        + "7) Años de experiencia en el cargo\n"
                                                                        + "8) Salario base\n"
                                                                        + "9) Comisiones\n"
                                                                        + "10) Medio de transporte\n"
                                                                        + "11) Cantidad de encargos por vez");
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
                                                            }
                                                        } else {
                                                            System.out.println("No se encontro el ID de motorista en la lista. Consulte con el soporte tecnico de la compañia.");
                                                        }
                                                        break;
                                                    }
                                                    case 3: {
                                                        System.out.println("Ingrese el ID del Motorista para eliminarlo");
                                                        int ID2 = r.nextInt();
                                                        int item2 = 0;
                                                        for (int y = 0; y < usuarios.size(); y++) {
                                                            int ID = 0;
                                                            if (usuarios.get(y) instanceof Motoristas) {
                                                                ID = ((Motoristas) usuarios.get(i)).getID();
                                                            }
                                                            if (ID2 == ID) {
                                                                item2 = i;
                                                                i = usuarios.size();
                                                            } else {
                                                                item2 = 1000;
                                                            }
                                                        }
                                                        if (item <= usuarios.size()) {
                                                            usuarios.remove(item2);
                                                        } else {
                                                            System.out.println("No se encontro el ID de Motorista en la lista. Consulte con el soporte tecnico de la compañia.");
                                                        }
                                                        break;
                                                    }
                                                    case 4: {
                                                        for (int z = 0; z < usuarios.size(); z++) {
                                                            if (usuarios.get(z) instanceof Motoristas) {
                                                                System.out.println(usuarios.get(i));

                                                            }
                                                        }
                                                        break;
                                                    }
                                                }

                                            }
                                            break;
                                        }
                                        case 4: {
                                            System.out.println("¿Que desea hacer?\n"
                                                    + "1) Agregar cliente\n"
                                                    + "2) Modificar cliente\n"
                                                    + "3) Eliminar cliente\n"
                                                    + "4) Listar clientes\n");
                                            int op = r.nextInt();
                                              while (op != 5) {
                                                switch (op) {
                                                    case 1: {
                                                        System.out.println("Ingrese el usuario del cliente");
                                                        String usuarioo = r.next();
                                                        System.out.println("Ingrese la contraseña del cliente");
                                                        String contraseñaa = r.next();
                                                        System.out.println("Ingrese el nombre del cliente");
                                                        String nombre = r.next();
                                                        System.out.println("Ingrese el apellido del cliente");
                                                        String apellido = r.next();
                                                        System.out.println("Ingrese el domicilio del cliente");
                                                        String domicilio = r.next();
                                                        System.out.println("Ingrese el ID del cliente");
                                                        int ID = r.nextInt();
                                                        System.out.println("Ingrese la cantidad de pedidos del cliente");
                                                        int pedidos= r.nextInt();
                                                       
                                                        usuarios.add(new Clientes(nombre, apellido, domicilio, ID, pedidos, usuarioo, contraseñaa));
                                                        break;
                                                    }
                                                    case 2: {
                                                        System.out.println("Ingrese el ID del Cliente para buscarlo");
                                                        int ID2 = r.nextInt();
                                                        int item2 = 0;
                                                        for (int x = 0; x < usuarios.size(); i++) {
                                                            int ID=0;
                                                            if(usuarios.get(i) instanceof Clientes){
                                                             ID = ((Clientes) usuarios.get(i)).getID();
                                                            }
                                                            if (ID2 == ID) {
                                                                item2 = i;
                                                                i = usuarios.size();
                                                            } else {
                                                                item2 = 1000;
                                                            }
                                                        }
                                                        if (item2 <= usuarios.size()) {
                                                            if (usuarios.get(item) instanceof Clientes) {
                                                                System.out.println("¿Que desea modificar?\n"
                                                                        + "1) Usuario\n"
                                                                        + "2) Contraseña\n"
                                                                        + "3) Nombre\n"
                                                                        + "4) Apellido\n"
                                                                        + "5) Domicilio\n"
                                                                        + "6) ID\n"
                                                                        + "7) Cantidad pedidos");
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
                                                                    case 7: {
                                                                        ((Clientes) usuarios.get(item)).setCantidadPedidos(r.nextInt());
                                                                        break;
                                                                    }
                                                                  
                                                                    
                                                                }
                                                            }
                                                        } else {
                                                            System.out.println("No se encontro el ID de Cliente en la lista. Consulte con el soporte tecnico de la compañia.");
                                                        }
                                                        break;
                                                    }
                                                    case 3: {
                                                        System.out.println("Ingrese el ID del Cliente para eliminarlo");
                                                        int ID2 = r.nextInt();
                                                        int item2 = 0;
                                                        for (int y = 0; y < usuarios.size(); y++) {
                                                            int ID = 0;
                                                            if (usuarios.get(y) instanceof Clientes) {
                                                                ID = ((Clientes) usuarios.get(i)).getID();
                                                            }
                                                            if (ID2 == ID) {
                                                                item2 = i;
                                                                i = usuarios.size();
                                                            } else {
                                                                item2 = 1000;
                                                            }
                                                        }
                                                        if (item <= usuarios.size()) {
                                                            usuarios.remove(item2);
                                                        } else {
                                                            System.out.println("No se encontro el ID de Cliente en la lista. Consulte con el soporte tecnico de la compañia.");
                                                        }
                                                        break;
                                                    }
                                                    case 4: {
                                                        for (int z = 0; z < usuarios.size(); z++) {
                                                            if (usuarios.get(z) instanceof Clientes) {
                                                                System.out.println(usuarios.get(i));

                                                            }
                                                        }
                                                        break;
                                                    }
                                                }

                                            }
                                            break;
                                        }

                                        case 5: {
                                            System.out.println("¿Que desea hacer?\n"
                                                    + "1) Agregar restaurante\n"
                                                    + "2) Modificar restaurante\n"
                                                    + "3) Eliminar restaurante\n"
                                                    + "4) Listar restaurantes\n");
                                            int op = r.nextInt();
                                              while (op != 5) {
                                                switch (op) {
                                                    case 1: {
                                                        System.out.println("Ingrese el usuario del administrador");
                                                        String usuarioo = r.next();
                                                        System.out.println("Ingrese la contraseña del administrador");
                                                        String contraseñaa = r.next();
                                                        System.out.println("Ingrese el nombre del administrador");
                                                        String nombre = r.next();
                                                        System.out.println("Ingrese el apellido del administrador");
                                                        String apellido = r.next();
                                                        System.out.println("Ingrese el ID del administrador");
                                                        int ID = r.nextInt();
                                                        System.out.println("Ingrese el puesto del administrador");
                                                        String puesto = r.next();
                                                        System.out.println("Ingrese los años de experiencia en el cargo del administrador");
                                                        int añosExp = r.nextInt();
                                                        System.out.println("Ingrese el salario base del administrador");
                                                        int salario = r.nextInt();
                                                        System.out.println("Ingrese los años de experiencia en venta del administrador");
                                                        int añosExpV = r.nextInt();
                                                        usuarios.add(new Administradores(nombre, apellido, ID, puesto, añosExp, salario, añosExpV, usuarioo, contraseñaa));
                                                        break;
                                                    }
                                                    case 2: {
                                                        System.out.println("Ingrese el ID del adminstrador para buscarlo");
                                                        int ID2 = r.nextInt();
                                                        int item2 = 0;
                                                        for (int x = 0; x < usuarios.size(); i++) {
                                                            int ID=0;
                                                            if(usuarios.get(i) instanceof Administradores){
                                                             ID = ((Administradores) usuarios.get(i)).getID();
                                                            }
                                                            if (ID2 == ID) {
                                                                item2 = i;
                                                                i = usuarios.size();
                                                            } else {
                                                                item2 = 1000;
                                                            }
                                                        }
                                                        if (item2 <= usuarios.size()) {
                                                            if (usuarios.get(item) instanceof Administradores) {
                                                                System.out.println("¿Que desea modificar?\n"
                                                                        + "1) Usuario\n"
                                                                        + "2) Contraseña\n"
                                                                        + "3) Nombre\n"
                                                                        + "4) Apellido\n"
                                                                        + "5) ID\n"
                                                                        + "6) Puesto\n"
                                                                        + "7) Años de experiencia en el cargo\n"
                                                                        + "8) Salario base\n"
                                                                        + "9) Años de experiencia en venta");
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
                                                        } else {
                                                            System.out.println("No se encontro el ID de administrador en la lista. Consulte con el soporte tecnico de la compañia.");
                                                        }
                                                        break;
                                                    }
                                                    case 3: {
                                                        System.out.println("Ingrese el ID del adminstrador para eliminarlo");
                                                        int ID2 = r.nextInt();
                                                        int item2 = 0;
                                                        for (int y = 0; y < usuarios.size(); y++) {
                                                            int ID = 0;
                                                            if (usuarios.get(y) instanceof Administradores) {
                                                                ID = ((Administradores) usuarios.get(i)).getID();
                                                            }
                                                            if (ID2 == ID) {
                                                                item2 = i;
                                                                i = usuarios.size();
                                                            } else {
                                                                item2 = 1000;
                                                            }
                                                        }
                                                        if (item <= usuarios.size()) {
                                                            usuarios.remove(item2);
                                                        } else {
                                                            System.out.println("No se encontro el ID de administrador en la lista. Consulte con el soporte tecnico de la compañia.");
                                                        }
                                                        break;
                                                    }
                                                    case 4: {
                                                        for (int z = 0; z < usuarios.size(); z++) {
                                                            if (usuarios.get(z) instanceof Administradores) {
                                                                System.out.println(usuarios.get(i));

                                                            }
                                                        }
                                                        break;
                                                    }
                                                }

                                            }
                                            break;
                                        }

                                        case 6: {
                                            System.out.println("¿Que desea hacer?\n"
                                                    + "1) Agregar tienda\n"
                                                    + "2) Modificar tienda\n"
                                                    + "3) Eliminar tienda\n"
                                                    + "4) Listar tiendas\n");
                                            int op = r.nextInt();
                                              while (op != 5) {
                                                switch (op) {
                                                    case 1: {
                                                        System.out.println("Ingrese el usuario del administrador");
                                                        String usuarioo = r.next();
                                                        System.out.println("Ingrese la contraseña del administrador");
                                                        String contraseñaa = r.next();
                                                        System.out.println("Ingrese el nombre del administrador");
                                                        String nombre = r.next();
                                                        System.out.println("Ingrese el apellido del administrador");
                                                        String apellido = r.next();
                                                        System.out.println("Ingrese el ID del administrador");
                                                        int ID = r.nextInt();
                                                        System.out.println("Ingrese el puesto del administrador");
                                                        String puesto = r.next();
                                                        System.out.println("Ingrese los años de experiencia en el cargo del administrador");
                                                        int añosExp = r.nextInt();
                                                        System.out.println("Ingrese el salario base del administrador");
                                                        int salario = r.nextInt();
                                                        System.out.println("Ingrese los años de experiencia en venta del administrador");
                                                        int añosExpV = r.nextInt();
                                                        usuarios.add(new Administradores(nombre, apellido, ID, puesto, añosExp, salario, añosExpV, usuarioo, contraseñaa));
                                                        break;
                                                    }
                                                    case 2: {
                                                        System.out.println("Ingrese el ID del adminstrador para buscarlo");
                                                        int ID2 = r.nextInt();
                                                        int item2 = 0;
                                                        for (int x = 0; x < usuarios.size(); i++) {
                                                            int ID=0;
                                                            if(usuarios.get(i) instanceof Administradores){
                                                             ID = ((Administradores) usuarios.get(i)).getID();
                                                            }
                                                            if (ID2 == ID) {
                                                                item2 = i;
                                                                i = usuarios.size();
                                                            } else {
                                                                item2 = 1000;
                                                            }
                                                        }
                                                        if (item2 <= usuarios.size()) {
                                                            if (usuarios.get(item) instanceof Administradores) {
                                                                System.out.println("¿Que desea modificar?\n"
                                                                        + "1) Usuario\n"
                                                                        + "2) Contraseña\n"
                                                                        + "3) Nombre\n"
                                                                        + "4) Apellido\n"
                                                                        + "5) ID\n"
                                                                        + "6) Puesto\n"
                                                                        + "7) Años de experiencia en el cargo\n"
                                                                        + "8) Salario base\n"
                                                                        + "9) Años de experiencia en venta");
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
                                                        } else {
                                                            System.out.println("No se encontro el ID de administrador en la lista. Consulte con el soporte tecnico de la compañia.");
                                                        }
                                                        break;
                                                    }
                                                    case 3: {
                                                        System.out.println("Ingrese el ID del adminstrador para eliminarlo");
                                                        int ID2 = r.nextInt();
                                                        int item2 = 0;
                                                        for (int y = 0; y < usuarios.size(); y++) {
                                                            int ID = 0;
                                                            if (usuarios.get(y) instanceof Administradores) {
                                                                ID = ((Administradores) usuarios.get(i)).getID();
                                                            }
                                                            if (ID2 == ID) {
                                                                item2 = i;
                                                                i = usuarios.size();
                                                            } else {
                                                                item2 = 1000;
                                                            }
                                                        }
                                                        if (item <= usuarios.size()) {
                                                            usuarios.remove(item2);
                                                        } else {
                                                            System.out.println("No se encontro el ID de administrador en la lista. Consulte con el soporte tecnico de la compañia.");
                                                        }
                                                        break;
                                                    }
                                                    case 4: {
                                                        for (int z = 0; z < usuarios.size(); z++) {
                                                            if (usuarios.get(z) instanceof Administradores) {
                                                                System.out.println(usuarios.get(i));

                                                            }
                                                        }
                                                        break;
                                                    }
                                                }

                                            }
                                            break;
                                        }

                                    }

                                }

                            } else if (usuarios.get(item) instanceof Motoristas && usuarioN == 3) {
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
                                            System.out.println(usuarios.get(item));
                                        }

                                    }

                                }

                            } else if (usuarios.get(item) instanceof Clientes && usuarioN == 4) {
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
                                                                        int total = restaurante.get(n).getListaComidas().get(n2).getPrecio() + restaurante.get(n).getListaComidas().get(n2).getListaAcompañamientos().get(n3).getPrecioAdicional();
                                                                        System.out.println("Su total es:" + " " + total);

                                                                        int randomNum = r2.nextInt((motoristas.size() - 0) + 1) + 0;
                                                                        System.out.println("Su entregador es: " + motoristas.get(randomNum));
                                                                        motoristas.get(randomNum).setComisiones(+500);
                                                                        System.out.println("Su dirección de entrega es: " + "" + ((Clientes) usuarios.get(item)).getDomicilio());

                                                                    }
                                                                }
                                                            } else {
                                                                int total = restaurante.get(n).getListaComidas().get(n2).getPrecio();

                                                                System.out.println("Su total es:" + " " + total);

                                                                int randomNum = r2.nextInt((motoristas.size() - 0) + 1) + 0;
                                                                System.out.println("Su entregador es: " + motoristas.get(randomNum));
                                                                motoristas.get(randomNum).setComisiones(+500);
                                                                System.out.println("Su dirección de entrega es: " + "" + ((Clientes) usuarios.get(item)).getDomicilio());
                                                            }

                                                        }
                                                    }

                                                }

                                            }
                                            break;
                                        }
                                        case 2: {
                                            System.out.println("¿De cual tienda desea comprar?");
                                            for (int x = 0; x < tiendas.size(); x++) {
                                                System.out.println(x + ") " + tiendas.get(x));
                                            }
                                            String tienda2 = r.next();
                                            int n = 0;
                                            for (int y = 0; y < tiendas.size(); y++) {
                                                String nombre = ((Tiendas) tiendas.get(y)).getNombre();
                                                if (tienda2.equals(nombre)) {
                                                    n = i;
                                                    i = restaurante.size();
                                                } else {
                                                    n = 1000;
                                                }
                                            }
                                            if (n <= tiendas.size()) {
                                                if (tiendas.get(n) instanceof Tiendas) {
                                                    System.out.println("¿Que artículo desea comprar?");
                                                    for (int x = 0; x < tiendas.get(n).getListaArticulos().size(); x++) {
                                                        System.out.println(x + ") " + tiendas.get(n).getListaArticulos().get(x));
                                                    }
                                                    String articulo = r.next();
                                                    int n2 = 0;
                                                    for (int y = 0; y < tiendas.get(n).getListaArticulos().size(); y++) {
                                                        String nombre = (tiendas.get(n).getListaArticulos().get(y).getNombre());
                                                        if (articulo.equals(nombre)) {
                                                            n2 = i;
                                                            i = tiendas.get(n).getListaArticulos().size();
                                                        } else {
                                                            n2 = 1000;
                                                        }
                                                    }
                                                    if (n2 <= tiendas.get(n).getListaArticulos().size()) {
                                                        if (tiendas.get(n).getListaArticulos().get(n2) instanceof Articulos) {
                                                            int total = tiendas.get(n).getListaArticulos().get(n2).getPrecio();
                                                            System.out.println("Su total es:" + " " + total);

                                                            int randomNum = r2.nextInt((motoristas.size() - 0) + 1) + 0;
                                                            System.out.println("Su entregador es: " + motoristas.get(randomNum));
                                                            motoristas.get(randomNum).setComisiones(+1000);
                                                            System.out.println("Su dirección de entrega es: " + "" + ((Clientes) usuarios.get(item)).getDomicilio());

                                                        }
                                                    }

                                                }

                                            }
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

                                        case 6: {
                                            System.out.println("¿Seguro que desea eliminar su cuenta?");
                                            String respuesta = r.next();
                                            if (respuesta.equalsIgnoreCase("Si")) {
                                                usuarios.remove(item);
                                                System.out.println("Usuario eliminado de manera excitosa");
                                                opcion2 = 6;
                                            } else {
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

                        }else{
                            System.out.println("Su usuario/contraseña esta incorrecta o debe crear un usuario.");
                        
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
                    usuarios.add(new Clientes( nombre, apellido, domicilio, ID, 0, usuario, contraseña));
                    break;
                }

            }

        }

    }

}
