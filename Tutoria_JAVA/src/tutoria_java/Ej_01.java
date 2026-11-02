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
public class Ej_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Control de Acceso a una sala");
        
        //variables
        Scanner sc=new Scanner(System.in);
        int edad=0;
        char respuesta;
        boolean entrada=false,acompañado=false,edadValida,ingresa=false;
        
        
        //desarrollo.
        System.out.println("ingresa edad");
        do {
            edad=sc.nextInt();
            edadValida=edad>=0&&edad<=120;
            
            //System.out.println(edadValida);
            if (!edadValida) {
                System.out.println("ingrese edad Valida");
            }
        }while (!edadValida);
        
        if (edad>15) {
            
            do {
                System.out.println("tienes entrada (S/N)");
                respuesta=sc.next().charAt(0);
                if (respuesta=='S') {
                    entrada=true;
                }else if(respuesta=='N'){
                    entrada=false;
                    break;
                            
                }
            } while (respuesta!='N'&&respuesta!='S');
            
            if (edad>17&&entrada) {
                ingresa=true;
                
            }else if(entrada){
                do {
                System.out.println("venes acompañado? (S/N)");
                respuesta=sc.next().charAt(0);
                if (respuesta=='S') {
                    acompañado=true;
                    ingresa=true;
                }else if(respuesta=='N'){
                    acompañado=false;
                    break;
                }
                } while (respuesta!='N'&&respuesta!='S');
            }
                
        }
        
        if (ingresa){
            System.out.println("Ingreso Admitido");
        }else{
            System.out.println("No Admitido");
        }
            
            
        //System.out.println("control de edad logrado.");
        
        
    }
    
}
