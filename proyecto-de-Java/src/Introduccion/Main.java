package Introduccion;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    // Hola mundo!
    public static void main(String[] args) {
        System.out.println("Hola Java");


        //Tipos de datos primitivos


        //1- Variable tipo texto
        String myString = "Esto es un texto";
        String myString2 = "Esto tambien es texto";
        String myString3 = "Texto";
        String myString4 = "Mas Texto";
        System.out.println(myString);

        //1.2- Constantes
        /*El modificador que esta al principio "final"
        indica que esto no es una variable sino una
        constante.
         */
        final String constante = "Esto es una constante";


        //2- Variable tipo entero
        Integer myInt = 7;
        myInt = myInt + 4;
        System.out.println(myInt);


        //3- Variables tipo decimal

        //Float expresa 32bit de decimales. Si no especificamos el decimal en la variable hay que poner una f caso contrario dara error
        Float myFloat = 6f;
        System.out.println(myFloat);

        // Double expresa el doble de decimales o sea 64bits. Si ponemos decimal en la variable hay que poner un d.
        Double myDouble = 6d; //En consola va a aparecer 6.0
        System.out.println(myDouble);

        //4- booleanos
        Boolean myBoolean = true;
        System.out.println(myBoolean);

        //5- null

        /* myFloat = null;
        System.out.println(myFloat);

        myBoolean = null;
        System.out.println(myBoolean);
        */

        //Si quisieramos manipular la variable cuyo valor es null nos dara error
        //myFloat = myFloat + 10;
        //System.out.println(myFloat);

        //Condicionales

        //Es igual que en JavaScript

        if (myFloat != null) {
            System.out.println(myFloat + 10);
        } else {
            System.out.println("Float es null");
        }

        //Estructuras de datos

        //Arrays
        /*En Java existen las listas que es la forma
        almacenar datos como los arrays, con la diferencia
        que aca hay que especificar que tipo de datos
        vamos a guardar dentro. En Java existen los arrays
        pero no de forma nativa.
         */
        List<String> myList = new ArrayList();
        myList.add(myString);
        myList.add(myString2);
        myList.add(myString3);
        myList.add(myString4);
        System.out.println(myList);


        //Bucles
        //Son iguales que es Javascript

        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }

        Main myMain = new Main();
        myMain.myFunction(1,4);
        System.out.println(myMain.myFunction2(1,4));
    }

    //Funciones
    //Hay dos tipos de funciones
    /*void son funciones vacias, podemos pasarle
    cualquier dato
     */

    public void myFunction(int firstNumber, int secondNumber){
        System.out.println(firstNumber + secondNumber );
    }
        /*Y luego estan las funciones especificas
        que en vez de poner void ponemos el tipo de dato
        que va a retornar la funcion
         */

    public int myFunction2(int num1, int num2){
        return num1 + num2;
    }
}