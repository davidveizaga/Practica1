import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion, auxiliar=0;
        RegistroDePersona Lista[] = new RegistroDePersona[100];
        Scanner leer = new Scanner(System.in);
        Scanner LEER = new Scanner(System.in);
        do {
            menu();
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    RegistroDePersona persona = new RegistroDePersona();
                    System.out.println("ingrese su id");
                    persona.setId(leer.nextInt());
                    System.out.println("ingrese su primer nombre");
                    persona.setNombre1(LEER.nextLine());
                    System.out.println("ingrese su segundo nombre");
                    persona.setNombre2(LEER.nextLine());
                    System.out.println("ingrese su primer apellido");
                    persona.setApellido1(LEER.nextLine());
                    System.out.println("ingrese su segundo apellido");
                    persona.setApellido2(LEER.nextLine());
                    System.out.println("ingrese su edad");
                    persona.setEdad(leer.nextInt());
                    Lista[auxiliar]=persona;
                    auxiliar++;
                    break;
                case 2:
                    for (int i=0;i<auxiliar ;i++) {
                        System.out.println(Arrays.stream(Lista).sequential());
                    }
                    break;
                case 3:
                    break;
                case 4:
                    for (int i = 0; i < auxiliar; i++) {
                        System.out.println(Lista[i].toString());
                    }
                    break;

                case 5:

                    break;
                default:
                    break;
            }
        } while (opcion != 0);
    }

    static void menu() {
        System.out.println("*****MENU*****");
        System.out.println("1.- Registrarse");
        System.out.println("2.- Buscar");
        System.out.println("3.- Eliminar");
        System.out.println("4.- Listar");
        System.out.println("5.- Salir");
        System.out.println("Ingrese la opcion");
    }

}



