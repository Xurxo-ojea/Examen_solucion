public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD

        System.out.println("\n--- Pasando un int");
        int entero = 1;
        modificaVarInt(entero);  // pasamos el valor del entero
        System.out.println("Valor del int fuera del método:    " + entero);

        System.out.println("\n--- Pasando un String");
        String string = "string1";
        modificaVarString(string); // pasamos el valor del String
        System.out.println("Valor del string fuera del método:  " + string);

        modificaInt(entero);
        System.out.println(entero);
        System.out.println("\n--- Pasando un objeto y reasignando el parámetro");
        Clase objeto = new Clase(1, "string1");
        modificaVarObjeto(objeto); // pasamos la referencia al objeto
        System.out.println("Valor del objeto fuera del método: " + objeto);

        modificaString(string);
        System.out.println(string);
        System.out.println("\n--- Pasando un objeto y modificando su contenido");
        Clase objeto2 = new Clase(1, "string1");
        modificaContenidoObjeto(objeto2); // pasamos la referencia al objeto
        System.out.println("Valor del objeto fuera del método: " + objeto2);
=======
        System.out.println("Hello world!");
        int entero = 1;
        String string = "string1";

        modificaInt(entero);
        System.out.println(entero);

        modificaString(string);
        System.out.println(string);
>>>>>>> 7798538ff86bd13f2dfc9dc7402d60205479ca82

        Clase objeto = new Clase(1, "string1");
        objeto.modificaObjeto(-99, "string modificado");
        System.out.println(objeto);
<<<<<<< HEAD
=======

    }

    private static void modificaString(String a) {
        a = "string2";
    }

    private static void modificaInt(int a) {
        a = -99;
>>>>>>> 7798538ff86bd13f2dfc9dc7402d60205479ca82
    }

    private static void modificaVarInt(int a) {
        a++; // Incrementamos en 1
        System.out.println("Valor del int dentro del método:   " + a);
    }

    private static void modificaVarString(String a) {
        a += " modificado";
        System.out.println("Valor del string dentro del método: " + a);
    }

    private static void modificaString(String a) {
        a = "string2";
        private static void modificaVarObjeto(Clase o) {
            o = new Clase(o.entero + 1, "nuevo string"); // creamos un nueva instancia
            System.out.println("Valor del objeto dentro de método: " + o);
        }

        private static void modificaInt(int a) {
            a = -99;
            private static void modificaContenidoObjeto(Clase o) {
                o.entero = -99; // modificamos el contenido de la referencia
                o.string = "string modificado";
                System.out.println("Valor del objeto dentro de método: " + o);
            }

        }