package Introduccion;

import java.util.Scanner;

public class Condicionales_y_Bucles {
    public static void main(String args[]){
        //Condicionales y Bucles
        //Son iguales que en JavaScript

        //Entrada de texto para usuario, es lo mismo que el promp en js
        Scanner entrada = new Scanner(System.in);

        int num = 0;


        System.out.println("Ingrese un numero");
        num = entrada.nextInt();

        //Bucle
        while (num == 0){
            System.out.println("El numero es 0");
            System.out.println("ingrese un numero valido");
            num = entrada.nextInt();
        }//Condicion
            if(num != 0){
            System.out.println("El resultado es: " + (num + 10));
        }
    }
}
