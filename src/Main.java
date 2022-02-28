import com.umg.data.Queues.ArrayBasedQueue;
import com.umg.data.Queues.LinkedListBasedQueue;
import com.umg.data.menu.Menu;

import java.util.Scanner;
public class Main {
    // Variables globales
    static int opPrincipal, opSecundaria;
    static String dato;

    public static void main(String[] args) {

        while (opPrincipal != 3){
            Menu menu = new Menu();
            menu.menuPrincipal();

            // Declarando el objeto scanner de java
            Scanner sc = new Scanner(System.in);

            // Capturando los datos de la operación principal
            opPrincipal = sc.nextInt();

            switch (opPrincipal){
                case 1:
                    menu.menuArrays();
                    opSecundaria = sc.nextInt();
                    opSecundaria();
                    break;

                case 2:
                    menu.menuListas();
                    break;

                case 3:
                    System.out.println("Saliendo ... ");
                    break;
            }
        }
    }


    // Operación secundaria
    public static void opSecundaria(){
        // Declarando el objeto scanner de java
        Scanner scanner = new Scanner(System.in);
        ArrayBasedQueue cola = new ArrayBasedQueue(10);

        switch(opSecundaria){
            case 1:
                System.out.println("   --- Encolar ---");
                dato = scanner.nextLine();
                cola.enqueue(dato);
                break;

            case 2:
                System.out.println("   --- Desencolar ---");
                dato = scanner.nextLine();
                cola.dequeue();
                break;

            case 3:
                System.out.println("   --- Cima ---");
                break;

            case 4:
                System.out.println("   --- Tamaño ---");
                break;

            default:
                System.out.println("Digito no existente :(");
        }
    }
}
