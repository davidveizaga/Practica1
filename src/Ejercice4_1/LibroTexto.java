package Ejercice4_1;

public class LibroTexto extends Libro{
    private String curso;

    public LibroTexto(String titulo, String autor, double precio, String curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }


    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Curso: " + curso);
        System.out.println();
    }
}