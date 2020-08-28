package programa;

import java.util.Random;
import java.util.Scanner;

public class pozomill {

    int arreglo[] = new int[5];

    public void pozomillonario() {
        Scanner entrada = new Scanner(System.in);
        int numerang, i = 0;
        boolean v = true;

        do {
            System.out.print("Digite los numeros: ");
            numerang = entrada.nextInt();
            if (numerang >= 0 && numerang <= 10) {
                if (i == 0) {
                    arreglo[i] = numerang;
                    i++;
                } else {
                    v = true;
                    for (int k = 0; k < i; k++) {
                        if (arreglo[k] == numerang) {
                            v = false;
                           
                        }
                    }
                }
                if (v == true) {
                    arreglo[i] = numerang;
                    i++;
                } else {
                    System.out.println("El numero ingresado ya esta registrado,por favor ingrese otro numero");
                }

            } else {
                System.out.println("No esta en el  rango  permitido");
            }
        } while (i < 5);
        for (int j = 0; j < arreglo.length; j++) {
            System.out.print(arreglo[j] + " ");

        }

    }

    public void calculo() {
        Random jue = new Random();
        boolean y = false;
        int num = jue.nextInt(11);
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == num) {
                y = true;
                break;

            }
        }

        if (y == true) {
            System.out.println("Felicidades ganastes:" + " tu numero del pozo millonario es: " + num);
        } else {
            System.out.println("LO SENTIMOS PERDISTES:" + "tu numero del pozo millonario es: " + num);
        }
    }
}
