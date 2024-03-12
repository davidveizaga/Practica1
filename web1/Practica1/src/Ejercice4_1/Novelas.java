package Ejercice4_1;

public class Novelas extends Libro{
    private String tipo;

    public Novelas(String titulo, String autor, double precio, String tipo) {
        super(titulo, autor, precio);
        this.tipo = tipo;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Tipo de Novela: " + tipo);
        System.out.println();
    }
}
