package ipc1.tarea3_201610703;

import java.util.Scanner;

public class IPC1Tarea3_201610703 {

    public static void main(String[] args) {
        menu(); //Se crea un metodo para poder regresar a este menu
    }

    private static void menu() {
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

        Scanner lector; //Creamos el primer Scanner para seleccionar este menu
        int menu = 0;
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

    private static void usuarios() {
        System.out.println("************************************************");
        System.out.println("1.Ingresar Usuarios");
        System.out.println("2.Mostrar Usuarios Ascendente");
        System.out.println("3.Mostrar Usuarios Descendente");
        System.out.println("4.Menu principal");

        Scanner lector;
        lector = new Scanner(System.in);
        int usuario = 0;
        usuario = lector.nextInt();

        switch (usuario) {
            case 1:
                
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

    private static void contadorDeDigitos() {
        System.out.println("2");
    }

    private static void tresNumero() {
        System.out.println("3");
    }

    private static void calcularPromedio() {
        System.out.println("4");
    }
}
