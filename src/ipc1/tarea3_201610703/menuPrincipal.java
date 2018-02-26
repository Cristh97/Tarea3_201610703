package ipc1.tarea3_201610703;

import java.util.Scanner;

public class menuPrincipal {

    Scanner lector; //Creamos el primer Scanner para seleccionar este menu
    int vector[] = new int[1];
    int vectorTres[] = new int[4];

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

    private void usuarios() {  //Creamos el siguiente menu
        System.out.println("************************************************");
        System.out.println("1.Ingresar Usuarios");
        System.out.println("2.Mostrar Usuarios Ascendente");
        System.out.println("3.Mostrar Usuarios Descendente");
        System.out.println("4.Menu principal");
        System.out.println("");
        System.out.println("Ingrese una opcion:");

        lector = new Scanner(System.in);
        int usuario;
        usuario = lector.nextInt();
        String[] vectorUsuario = new String[5]; //Asignamos nuestro vector con 5 espacios 
        String usu;

        switch (usuario) {
            case 1: //En el primer case debe ingresar los usuarios
                for (int i = 0; i < vectorUsuario.length; i++) { //utilzamos un for para que el codigo sea mas compact0
                    System.out.println("Ingresar usuario:");
                    usu = lector.next(); //igualamos el dato string usu para que sea leido por el lector
                    vectorUsuario[i] = usu;
                    if (i > 0) { //El primer usuario nunca por primera ves podra ser el repetido
                        for (int j = 0; j < i; j++) { //creamos un for para que verifique los datos anteriormente asiganados y comparados con los demas
                            if (vectorUsuario[j].equals(vectorUsuario[i])) {
                                System.out.println("Error; ingresar otro usuario");
                                String us;
                                us = lector.next(); //una nueva variable us sera la que sustituya al usuario repetido anteriormente
                                vectorUsuario[i] = us;
                            }
                        }
                    }
                }
                usuarios();
                break;
            case 2:
                /*  for (int i = 0; i < vectorUsuario.length; i++) {
                    for (int j = 0; j < vectorUsuario.length && i!=j; j++) {
                        if (vectorUsuario[i].compareToIgnoreCase(vectorUsuario[j])<0) {
                            String aux = vectorUsuario[j];
                            vectorUsuario[j] = vectorUsuario[j + 1];
                            vectorUsuario[j + 1] = aux;
                        }
                    }
                }

                  for(int n=0;n<vectorUsuario.length;n++){
                    System.out.println(n+vectorUsuario[n]);
                }*/
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                menu();
                break;
            default:
                System.out.println("Ingrese opcion valida");
                usuarios();
        }
    }

    private void contadorDeDigitos() {
        System.out.println("************************************************");
        System.out.println("1.Ingresar numero");
        System.out.println("2.Mostrar numero de digitos");
        System.out.println("4.Menu principal");
        System.out.println("");
        System.out.println("Ingrese una opcion:");

        Scanner entrada = new Scanner(System.in);
        int digito;
        digito = lector.nextInt();

        int numero1;

        switch (digito) {
            case 1:
                System.out.println("Ingrese un numero:");
                numero1 = entrada.nextInt();
                vector[0] = numero1;
                if ((numero1 < 0) || (numero1 > 100000)) {
                    System.out.println("Numero invalido, Ingrese otro numero:");
                    int numero2 = entrada.nextInt();
                    vector[0] = numero2;
                }
                contadorDeDigitos();
                break;
            case 2:
                int n = 1;
                int t = 0;
                while (n < vector[0]) {
                    if ((vector[0] / n) > 0) {
                        t = t + 1;
                        n = n * 10;
                    }
                }
                System.out.println("No. de Digitos:" + t);
                contadorDeDigitos();
                break;
            case 4:
                menu();
                break;
            default:
                System.out.println("Ingrese opcion valida");
            /*    contadorDeDigitos();*/
        }
    }

    private void tresNumero() {
        System.out.println("************************************************");
        System.out.println("1.Ingresar numeros");
        System.out.println("2.Mostrar ordenados");
        System.out.println("4.Menu principal");

        int tres;
        tres = lector.nextInt();
        int numeros;

        switch (tres) {
            case 1:
                System.out.println("************************************************");
                System.out.println("Ingrese 3 numeros");

                for (int i = 1; i < vectorTres.length; i++) {
                    numeros = lector.nextInt();
                    vectorTres[i] = numeros;
                }
                tresNumero();
                break;
            case 2:
                System.out.println("************************************************");
                System.out.println("Numero ordenado de mayor a menor:");

                int i;
                int j;
                int aux;

                for (i = 1; i < vectorTres.length; i++) {
                    j = i;
                    aux = vectorTres[i];
                    while (i > 0 && aux < vectorTres[j - 1]) {
                        vectorTres[j] = vectorTres[j - 1];
                        j--;
                    }
                    vectorTres[j] = aux;
                }

                System.out.println(vectorTres[3]);
                System.out.println(vectorTres[2]);
                System.out.println(vectorTres[1]);
                tresNumero();
                break;
            case 4:
                menu();
                break;
            default:
                System.out.println("Numero invalido");
                tresNumero();
        }
    }

    private void calcularPromedio() {
        System.out.println("************************************************");
        int a[] = new int[6];
        int b[] = new int[7];
        int c[] = new int[7];
        int d[] = new int[7];
        int e[] = new int[7];
        int f[] = new int[7];
        int a1, b1, c1, d1, e1, f1;

        System.out.println("Ingrese el Id del estudiante, seguido de sus 4 notas:");
        for (int a2 = 0; a2 < 5; a2++) {
            a1 = lector.nextInt();
            a[a2] = a1;
        }

        System.out.println("Ingrese el Id del estudiante, seguido de sus 4 notas:");
        for (int b2 = 0; b2 < 5; b2++) {
            b1 = lector.nextInt();
            b[b2] = b1;
        }

        System.out.println("Ingrese el Id del estudiante, seguido de sus 4 notas:");
        for (int c2 = 0; c2 < 5; c2++) {
            c1 = lector.nextInt();
            c[c2] = c1;
        }

        System.out.println("Ingrese el Id del estudiante, seguido de sus 4 notas:");
        for (int d2 = 0; d2 < 5; d2++) {
            d1 = lector.nextInt();
            d[d2] = d1;
        }

        System.out.println("Ingrese el Id del estudiante, seguido de sus 4 notas:");
        for (int e2 = 0; e2 < 5; e2++) {
            e1 = lector.nextInt();
            e[e2] = e1;
        }

        System.out.println("Ingrese el Id del estudiante, seguido de sus 4 notas:");
        for (int f2 = 0; f2 < 5; f2++) {
            f1 = lector.nextInt();
            f[f2] = f1;
        }

        System.out.print(a[0]);
        System.out.print(" ");
        System.out.print(a[1]);
        System.out.print(" ");
        System.out.print(a[2]);
        System.out.print(" ");
        System.out.print(a[3]);
        System.out.print(" ");
        System.out.print(a[4]);
        System.out.print(" ");
        int a3 = (a[1] + a[2] + a[3] + a[4]) / 4;
        System.out.print(a3);
        System.out.println("");

        System.out.print(b[0]);
        System.out.print(" ");
        System.out.print(b[1]);
        System.out.print(" ");
        System.out.print(b[2]);
        System.out.print(" ");
        System.out.print(b[3]);
        System.out.print(" ");
        System.out.print(b[4]);
        System.out.print(" ");
        int b3 = (b[1] + b[2] + b[3] + b[4]) / 4;
        System.out.print(b3);
        System.out.println("");

        System.out.print(c[0]);
        System.out.print(" ");
        System.out.print(c[1]);
        System.out.print(" ");
        System.out.print(c[2]);
        System.out.print(" ");
        System.out.print(c[3]);
        System.out.print(" ");
        System.out.print(c[4]);
        System.out.print(" ");
        int c3 = (c[1] + c[2] + c[3] + c[4]) / 4;
        System.out.print(c3);
        System.out.println("");

        System.out.print(d[0]);
        System.out.print(" ");
        System.out.print(d[1]);
        System.out.print(" ");
        System.out.print(d[2]);
        System.out.print(" ");
        System.out.print(d[3]);
        System.out.print(" ");
        System.out.print(d[4]);
        System.out.print(" ");
        int d3 = (d[1] + d[2] + d[3] + d[4]) / 4;
        System.out.print(d3);
        System.out.println("");

        System.out.print(e[0]);
        System.out.print(" ");
        System.out.print(e[1]);
        System.out.print(" ");
        System.out.print(e[2]);
        System.out.print(" ");
        System.out.print(e[3]);
        System.out.print(" ");
        System.out.print(e[4]);
        System.out.print(" ");
        int e3 = (e[1] + e[2] + e[3] + e[4]) / 4;
        System.out.print(e3);
        System.out.println("");

        System.out.print(f[0]);
        System.out.print(" ");
        System.out.print(f[1]);
        System.out.print(" ");
        System.out.print(f[2]);
        System.out.print(" ");
        System.out.print(f[3]);
        System.out.print(" ");
        System.out.print(f[4]);
        System.out.print(" ");
        int f3 = (f[1] + f[2] + f[3] + f[4]) / 4;
        System.out.print(f3);
        System.out.println("");
        
        menu();

    }

}
