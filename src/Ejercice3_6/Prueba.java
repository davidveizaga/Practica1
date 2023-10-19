package Ejercice3_6;
import java.util.*;
import java.util.concurrent.Callable;

public class Prueba {
    public static void main(String[] args) {

        Tienda tienda = new Tienda("Tienda informatica", "david veizaga", 123456, 5);
        Computer computer1 = new Computer("Arce", 50, "intel iCore 9", "Wimdows", 3500);
        Computer computer2 = new Computer("Toshiba", 80, "Intel iCore 7", "Mac", 4500);
        Computer computer3 = new Computer("Mac",100,"Intel Icore 5","Wimdows",5500);
        tienda.añadir(computer1);
        tienda.añadir(computer2);
        tienda.añadir(computer3);
        Scanner leer= new Scanner(System.in);
        String marca=leer.next();
        System.out.println("the computer a source: "+marca+"se encuentra en la posicion "+tienda.buscar(marca));
        tienda.imprimir();


    }

}
