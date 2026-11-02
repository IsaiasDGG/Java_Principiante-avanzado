/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutoria_java;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author isaia
 */
public class Ej_04 {

    /**
     * @param args the command line arguments
     */
    private static void rellenar(boolean[][]asientos){
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
               asientos[i][j]=false; 
            }
            
        }
    }
    ////////////////////////////////
    private static void mostrar(boolean[][]asientos){
        System.out.print("         ");
        for (int i = 1; i < 7; i++) {
            System.out.print("A"+(i)+"  ");
        }
        for (int i = 0; i < asientos.length; i++) {
            System.out.print("\nFila "+(i+1)+": ");
            for (int j = 0; j < asientos[i].length; j++) {
                
                if (asientos[i][j]){
                    System.out.print(" X"+"  ");
                }else{
                    System.out.print(" L"+"  ");
                }
                        
            }
            
        }
        
    }
    ////////////////////////////////////
    public static void main(String[] args) {
            System.out.println("Cine");//titulo
            //variables
            Scanner sc=new Scanner(System.in);
            boolean[][]asientos=new boolean[5][6];
            int menu;
            
            do{
                System.out.println("Escoge una opción:");
                System.out.println("\n1. Ver Sala\n2. Reservar asiento\n3. Cancelar Reserva\n4. Estadísticas\n5.Reserva Automática\n0. Salir ");
                menu=sc.nextInt();
            
            
            
            
            
            
            
            
            
            }while (menu!=0);
            
            
            
            //ejercicio.
            rellenar(asientos);
            //mostrar(asientos);
            
    }
    
}
