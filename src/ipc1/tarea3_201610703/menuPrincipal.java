package ipc1.tarea3_201610703;

import java.util.Scanner;

public class menuPrincipal {

    Scanner lector; //Creamos el primer Scanner para seleccionar este menu

    public menuPrincipal() {
        menu();
    }

    private void menu() {
        System.out.println("************************************************"); //Separacion para tener un mejor orden
        System.out.println("[IPC1]Tarea3_201610703");  //Escribimos todas las opciones del prime menu
        System.out.println("");
        System.out.println("1.Usuarios");
        System.out.println("2.Contador de digitos");
        System.out.println("3.Tres números de mayor a menor");
        System.out.println("4.Calcular promedio");
        System.out.println("5.Salir");
        System.out.println("");
        System.out.println("Ingrese una opcion:");

        int menu;
        lector = new Scanner(System.in);
        menu = lector.nextInt();

        switch (menu) { //Se eligira un opcion con la ayuda de un switch
            case 1:
                usuarios(); //todas las opciones nos mandaran a un metodo distinto
                break;
            case 2:
                contadorDeDigitos();
                break;
            case 3:
                tresNumero();
                break;
            case 4:
                calcularPromedio();
                break;
            case 5:
                System.exit(0); //Se utiliza esta opcion para que el programa finaliza
                break;
            default: //Si ingresamos un numero erroneo nos devolvera al mismo menu
                menu();
        }
    }

    private void usuarios() {
        System.out.println("************************************************");
        System.out.println("1.Ingresar Usuarios");
        System.out.println("2.Mostrar Usuarios Ascendente");
        System.out.println("3.Mostrar Usuarios Descendente");
        System.out.println("4.Menu principal");

        lector = new Scanner(System.in);
        int usuario;
        usuario = lector.nextInt();
        String vectorUsuario[] = new String[4];
        String usu;

        switch (usuario) {
            case 1:
                for (int i = 0; i <= 5; i++) {
                    System.out.println("Ingresar usuario:");
                    usu = lector.next();
                    vectorUsuario[i] = usu;
                    if (i > 0) {
                        for (int j = 0; j < i; j++) {
                            if (vectorUsuario[j].equals(vectorUsuario[i])) {
                                System.out.println("Error; ingresar otro usuario");
                                vectorUsuario[i] = usu;
                            }
                        }
                    }
                }
                usuarios();
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:
                menu();
                break;
            default:
                usuarios();
        }
    }

    private void contadorDeDigitos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void tresNumero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void calcularPromedio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
