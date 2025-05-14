import com.monedas.modelos.Busqueda;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        int opcion;
        Busqueda busqueda = new Busqueda();
        while (true){

            opcion = busqueda.menu();
            if(opcion == 5){
                break;
            }
            busqueda.convertirMoneda(opcion);

        }
        System.out.println("Gracias por usar nuestro programa");


    }
}