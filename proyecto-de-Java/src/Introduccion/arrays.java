package Introduccion;

import java.util.Arrays;

public class arrays {
    public static void main (String args[]){
        //primero aclaramos el tipo de variable que va a contener el array
        String array[];
        //segundo le decimos cuantos indices va a tener
        array = new String[4];

        //ahora podemos asignar valores o variables a los indices
        array[1] = "hola";
        array[2] = "como estas?";
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}
