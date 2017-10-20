/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotificadora;
import java.util.Scanner;

/**
 *
 * @author Juan Zepeda
 */
public class Lotificadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Proyecto_Lotificacion obj = new Proyecto_Lotificacion();
        int opc;
        do{
        Scanner zeus = new Scanner(System.in);
        System.out.println("\n*****Menus Terrenos*****");
        System.out.println("\n1. Venta de Lote");
        System.out.println("2. Informacion Lotes");
        System.out.println("3. Salir");
        System.out.print("\n Ingrese su Opcion: ");
        opc = zeus.nextInt();
        
        switch(opc){
            case 1:
                System.out.println("\nOpcion Ingresada: \"Venta de Lote\"");
                System.out.println("\nIngrese las Coordenadas: ");
                System.out.print("Coordenada X: ");
                int x = zeus.nextInt();
                System.out.print("Coordenada Y: ");
                int y = zeus.nextInt();
                obj.ventaLote(x, y);
                break;
            case 2:
                System.out.println("\nOpcion Ingresada: \"Informacion\"");
                obj.Informacion();
                break;
            case 3:
                System.out.println("\nOpcion Ingresada: \"Salir\"");
                System.out.println("Hasta Luego!!!");
                System.exit(0);
                break;
        }
        
        }while(opc!=3);
    }
    
}
