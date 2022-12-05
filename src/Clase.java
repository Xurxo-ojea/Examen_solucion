<<<<<<< HEAD
class Clase {
    int i;
    String string = "string1";
    int entero;
    String string;

    public Clase(int i, String string) {
        this.i = i;
        this.entero = i;
=======
public class Clase class Clase {
    int i;
    String string = "string1";

    public Clase(int i, String string) {
        this.i = i;
>>>>>>> 7798538ff86bd13f2dfc9dc7402d60205479ca82
        this.string = string;
    }

    public void modificaObjeto(int nuevo_int, String nuevo_string) {
        i = nuevo_int;
        string = nuevo_string;
    }

    @Override
    public String toString() {
        return "Objeto { i=" + i + ", a='" + string + "\'}";
<<<<<<< HEAD
        return "Objeto { i=" + entero + ", a='" + string + "\'}";
    }
}
=======
    }
}
}
>>>>>>> 7798538ff86bd13f2dfc9dc7402d60205479ca82
