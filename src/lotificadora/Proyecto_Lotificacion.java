/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotificadora;
import java.util.Scanner;
/**
 *
 * @author sebastianmorales
 */
public class Proyecto_Lotificacion {
    private Terreno[][] arreglo = new Terreno[5][5];
    private int x;
    private int y;
    Scanner zeus = new Scanner(System.in);
    public Proyecto_Lotificacion(){
        arreglo = new Terreno[5][5];
    }
    public void ventaLote(int x, int y){
        if(x>5 || y>5 || x<0 || y<0){
            System.out.println("El Lote No Existe!!! Porfavor Ingrese una Coordenada Valida!!!");
        }else if(arreglo[x][y]==null){
            System.out.println("*****Medidas*****");
            Scanner zeus = new Scanner(System.in);
            System.out.print("\nIngrese Largo: ");
            double largo = zeus.nextDouble();
            System.out.print("Ingrese Ancho: ");
            double ancho = zeus.nextDouble();
            System.out.print("Ingrese Precio: ");
            double precio = zeus.nextDouble();
            arreglo[x][y] = new Terreno(largo,ancho,precio);
        }else{
            System.out.println("Terreno Ocupado!!!");
    }
  }
    public void Informacion(){
        int contador_ocupados=0;
        int contador_dinero=0;
        for(int f=0;f<arreglo.length;f++){
            for(int c=0;c<arreglo.length;c++){
                if(arreglo[f][c] != null){
                    contador_ocupados++;
                    contador_dinero+=arreglo[f][c].getPrecio();
                }
            }
        }
        int lotesvacios=25-contador_ocupados;
        System.out.println("\nTotal Lotes Ocupados: " + contador_ocupados);
        System.out.println("Total Dinero En Terrenos Ocupados: " + contador_dinero);
        System.out.println("Total Lotes Vacios: " + lotesvacios);
    }
}
