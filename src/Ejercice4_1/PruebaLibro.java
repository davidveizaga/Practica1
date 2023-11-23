package Ejercice4_1;

public class PruebaLibro {
    public static void main(String[] args) {
        Libro libro = new Libro("la vaca", "penelope", 200);
        libro.imprimirInformacion();

        LibroTexto libroTexto= new LibroTexto("Psicologia", "sipmon froit", 300, "10");
        libroTexto.imprimirInformacion();

        LibroTextoUniversal libroTextoUni = new LibroTextoUniversal("ciencia naturales", "mauricio", 400, "Naturales", "ciencia");
        libroTextoUni.imprimirInformacion();

        Novelas novela = new Novelas("el señor de los cielos", "chapo", 100, "vidareal");
        novela.imprimirInformacion();
    }
}

