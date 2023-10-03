public class Main {
    // Hola mundo!
    public static void main(String[] args) {
        System.out.println("Hola Java");
        
        // Variable tipo texto
        String myString = "Esto es un texto";
        System.out.println(myString);


        // Variable tipo entero
        Integer myInt = 7;
        myInt = myInt + 4;
        System.out.println(myInt);


        //Variables tipo decimal

        //Float expresa 32bit de decimales. Si no especificamos el decimal en la variable hay que poner una f caso contrario dara error
        Float myFloat = 6f;
        System.out.println(myFloat);

        // Double expresa el doble de decimales o sea 64bits. Si ponemos decimal en la variable hay que poner un d.
        Double myDouble = 6d; //En consola va a aparecer 6.0
        System.out.println(myDouble);

        //booleanos
        Boolean myBoolean = true;
        System.out.println(myBoolean);

        //null
        myFloat = null;
        System.out.println(myFloat);

        myBoolean = null;
        System.out.println(myBoolean);

        //Si quisieramos manipular la variable cuyo valor es null nos dara error
            //myFloat = myFloat + 10;
            //System.out.println(myFloat);

        //Condicionales
        //Es igual que en JavaScript
            if(myFloat != null) {
                System.out.println(myFloat + 10);
            }else {
                System.out.println("Float es null");
            }
    }
    
}