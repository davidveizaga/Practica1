package Ejercice3_6;
import java.util.*;

public class Tienda {
    String name;
    String propetario;
    int id_tributario;
    Computer[]computers;

    static int numberComputers;

    public Tienda(String name , String propetario , int id_tributario, int tamaño){
        if(tamaño<1){
            System.out.println("amount of computers insufficient");
        }else {
            this.name=name;
            this.propetario=propetario;
            this.id_tributario=id_tributario;
            computers=new Computer[tamaño];
            numberComputers=0;
        }

    }

    public boolean tiendaLlena(){
        return numberComputers==computers.length;
    }
    public boolean tiendaVacia(){
        return numberComputers ==0;
    }
    public void añadir(Computer computer){
        if (tiendaLlena()){
            System.out.println("tha tienda esta llena is not puede add element");
        }else {
            computers[numberComputers]=computer;
            numberComputers++;
        }
    }
    public boolean eliminar(String marcaComputer){
        int pos=buscar(marcaComputer);
        if(pos<0){
            return false;
        }
        for (int i =pos;i<numberComputers;i++){
            computers[i]=computers[i+1];
        }
        numberComputers--;
        return true;
    }
    public  int buscar(String marcaComputer){
        for (int i = 0 ;i<numberComputers;i++){
            if (computers[i].marca.equals(marcaComputer))
                return  i;
        }
        return -1;
    }
    public void imprimir(){
        for (int i=0;i<numberComputers;i++){
            System.out.println("computer"+i);
            System.out.println("Marca= "+computers[i].marca);
            System.out.println("Cantidad de memoria = "+computers[i].cantidadMemoria);
            System.out.println("Caracteristicas de procesador = "+computers[i].caracteristicasProcesador);
            System.out.println("Sistem Operative = "+computers[i].SistemOperative);
            System.out.println("Precio = "+computers[i].precio);

        }

    }
}
