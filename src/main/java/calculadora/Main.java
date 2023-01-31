package calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Aritmetica aritmetica = new Aritmetica();
        int opcion;

        System.out.println("BIENVENIDO A LA CALCULADORA 2!");

        try {
            do {
                System.out.println("\nPOR FAVOR, SELECCIONE UNA OPCION:");
                System.out.println("1. SUMAR");
                System.out.println("2. RESTAR");
                System.out.println("3. DIVIDIR");
                System.out.println("4. MULTIPLICAR");
                System.out.println("5. SALIR");

                Scanner consola = new Scanner(System.in);
                opcion = Integer.parseInt(consola.nextLine());

                if (opcion > 5) {
                    System.out.println("OPCION INCORRECTA, POR FAVOR, DIGITE UNA OPCION VALIDA!");
                } else {

                    switch (opcion) {
                        case 1:
                            System.out.print("DIGITE EL PRIMER NUMERO: ");
                            aritmetica.a = consola.nextInt();
                            System.out.print("DIGITE EL SEGUNDO NUMERO: ");
                            aritmetica.b = consola.nextInt();
                            System.out.println("EL RESULTADO DE LA SUMA ES: " + aritmetica.sumar());
                            break;
                        case 2:
                            System.out.print("DIGITE EL PRIMER NUMERO: ");
                            aritmetica.a = consola.nextInt();
                            System.out.print("DIGITE EL SEGUNDO NUMERO: ");
                            aritmetica.b = consola.nextInt();
                            System.out.println("EL RESULTADO DE LA RESTA ES: " + aritmetica.restar());
                            break;
                        case 3:
                            System.out.print("DIGITE EL PRIMER NUMERO: ");
                            aritmetica.a = consola.nextInt();
                            System.out.print("DIGITE EL SEGUNDO NUMERO: ");
                            aritmetica.b = consola.nextInt();
                            System.out.println("EL RESULTADO DE LA DIVISION ES: " + aritmetica.dividir());
                            break;
                        case 4:
                            System.out.print("DIGITE EL PRIMER NUMERO: ");
                            aritmetica.a = consola.nextInt();
                            System.out.print("DIGITE EL SEGUNDO NUMERO: ");
                            aritmetica.b = consola.nextInt();
                            System.out.println("EL RESULTADO DE LA MULTIPLICACION ES: " + aritmetica.multiplicar());
                            break;
                    }
                }
            }
                while (opcion != 5) ;
                {
                    System.out.println("GRACIAS POR UTILIZAR LA CALCULADORA 2! :)");
                }
        } catch (NumberFormatException error) {
            System.out.println("SOLO SE PUEDE DIGITAR NUMEROS!");
        }
    }
}