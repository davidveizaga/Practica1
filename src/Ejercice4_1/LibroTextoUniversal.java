package Ejercice4_1;

public class LibroTextoUniversal extends LibroTexto{
    private String facultad;

    public LibroTextoUniversal (String titulo, String autor, double precio, String curso, String facultad) {
        super(titulo, autor, precio, curso);
        this.facultad = facultad;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Facultad: " + facultad);
        System.out.println();
    }
}