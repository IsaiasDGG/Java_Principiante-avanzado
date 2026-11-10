/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutoria_java;
import java.util.Scanner;

/**
 *
 * @author isaia
 */
public class Ej_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Validador de nombres");
        
        
        //variables
        Scanner sc=new Scanner(System.in);
        String nombre;
        
        System.out.println("Ingresa un nombre valido");
        nombre=sc.nextLine();
        String min=nombre.toLowerCase();
        
        boolean nombreR1=min.length()>=5&&min.length()<=15;
        boolean nombreR2=min.contains("a");
        boolean nombreR3=min.contains("admin")||min.contains(" ");
        
 
        if(nombreR1&&nombreR2&&!nombreR3){
            System.out.println("pasa");
        }else{
            System.out.println("no pasa");
        } 
        
          
    }
    
}
