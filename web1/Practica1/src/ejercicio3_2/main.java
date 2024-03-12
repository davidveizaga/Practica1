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
        String mayuscula = String.valueOf(cadena.equals("Programación Orientadaa Objeto"));


        //textoinvertido
        String textoInvertido = "";
        for (int i = cadena.cadenaInicial.length() - 1; i >= 0; i--) {
            textoInvertido = textoInvertido + cadena.cadenaInicial.charAt(i);
        }
        System.out.println("Texto invertido: "+textoInvertido);

        // contarMayusculasMinusculas
        int mayusculas = 0;
        int minusculas = 0;
        for (int i = 0; i < cadena.cadenaInicial.length(); i++) {
            char c = cadena.cadenaInicial.charAt(i);
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            }
        }

        System.out.println("Mayúsculas: " + mayusculas);
        System.out.println("Minúsculas: " + minusculas);

        String TextoSinEspacios = cadena.cadenaInicial.replaceAll(" ", "");
        System.out.println("Texto sin espacios: " + TextoSinEspacios);

        char letra = 'b';
        int cont = 0;
        for (int i = 0; i < cadena.cadenaInicial.length(); i++) {
            char c = cadena.cadenaInicial.charAt(i);
            if (c == letra || Character.toLowerCase(c) == letra || Character.toUpperCase(c) == letra) {
                cont++;
            }
        }
        System.out.println("La letra '" + letra + "' aparece " + cont + " veces.");

    }
}