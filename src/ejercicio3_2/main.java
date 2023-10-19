package ejercicio3_2;

import java.util.Locale;

public class main {
    public static void main(String[] args) {

        Cadena cadena = new Cadena();
// Determina la longitud de la cadena
        int longitud = cadena.cadenaInicial.length();
        System.out.println("La longitud del String es = " + longitud);
// Elimina espacios en blanco al comienzo y al final
        String cadenaSinEspacios = cadena.cadenaInicial.trim();
        System.out.println("El String sin espacios en blanco = " + cadenaSinEspacios);
// Convierte los caracteres de la cadena a mayúscula
        String cadenaMayúscula = cadenaSinEspacios.toUpperCase();
        System.out.println("El String en mayúscula = " + cadenaMayúscula);
        String cadenaConcatenada = cadenaMayúscula.concat("12345");
// Concatena cadenas
        System.out.println("El String concatenado = " + cadenaConcatenada);
// Extrae una porción de la cadena
        String cadenaExtraida = cadenaConcatenada.substring(24, 31);
        System.out.println("El String extraído = " + cadenaExtraida);
// Reemplaza el carácter especificado
        String cadenaReemplazada = cadenaExtraida.replace("O", "X");
        System.out.println("El String reemplazado = " + cadenaReemplazada);
        boolean comparación = cadenaReemplazada.equals("Programación");
        // Compara cadenas
        System.out.println("Los String son iguales = " + comparación);
        //Un método que reciba como parámetro un String y calcule
        //cuántas mayúsculas tiene.
        String mayuscula= String.valueOf(cadena.equals("Programación Orientadaa Objeto"));
        System.out.println(" se repiten: "+mayuscula);

    }
  }
