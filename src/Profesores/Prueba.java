package Profesores;

public class Prueba {
    public static void main(String[] args) {
        Profesor profesor1 = new ProfesorTitular();
        Profesor profesor2 = (Profesor)profesor1;
        Profesor profesor3 = new Profesor();
        profesor3.imprimir();
        profesor2.imprimir();
        profesor1.imprimir();
    }
}
