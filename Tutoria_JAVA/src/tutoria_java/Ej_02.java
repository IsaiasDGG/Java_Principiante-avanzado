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
public class Ej_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ejercicio 2- Sistema de Reservas de un Hotel");
        //variables
        Scanner sc=new Scanner(System.in);
        boolean[] habitaciones = {true, false, false, true, false, true, false, false};
        int respuesta,menu,countLi,countOc;
        boolean respValida;
        /*habitaciones=true =ocupada
        habitaciones= false= desocupada.
        */
        
        do{//Menú
            System.out.println("Sistema de Reservas del Hotel");
            System.out.println("1.Consultar Habitaciones\n2.Realizar reserva\n3.Cancelar Reserva\n4.Ver estadísticas\n0.Salir");
            System.out.println("Escoge una opción");
            
            menu=sc.nextInt();
                        
            switch(menu){
                case 1:
                    for (int i = 0; i < habitaciones.length; i++) {
                        if (habitaciones[i]) {
                            System.out.println("Habitación N°"+(i+1)+": ocupada");
                            
                        }else {
                            System.out.println("Habitación N°"+(i+1)+": libre");
                        }
                        
                    }
                    
                    break;
                    
                case 2:
                    do{
                        System.out.println("¿Qué habitación deseas Reservar?(1-8)");
                        respuesta=sc.nextInt();
                        respValida=respuesta>0&&respuesta<=8;
                        if (respValida){
                            if (habitaciones[respuesta-1]) {
                                System.out.println("Habitación ocupada, no puede reservarse");
                            
                            }else  {
                                System.out.println("Habitación libre.\nProcedo a reservar");
                                habitaciones[respuesta-1]=true;
                            }
                        }else{
                            System.out.println("Habitación no encontrada");
                        }
                        
                        
                    }while(!respValida);
                    
                    break;
                    
                case 3:
                    do{
                        System.out.println("¿Qué habitación deseas Cancelar?(1-8)");
                        respuesta=sc.nextInt();
                        respValida=respuesta>0&&respuesta<=8;
                        if (respValida){
                            if (habitaciones[respuesta-1]) {
                                System.out.println("Habitación ocupada.\n Reserva Cancelada");
                                habitaciones[respuesta-1]=false;
                            
                            }else  {
                                System.out.println("Habitación libre. No existe reserva que cancelar");
                            }
                        }else{
                            System.out.println("Habitación no encontrada");
                        }
                        
                    }while(!respValida);
                    
                    break;
                    
                case 4:
                    countOc=0;countLi=0;
                    for (int i = 0; i < habitaciones.length; i++) {
                        if (habitaciones[i]) {
                            countOc++;
                            
                        }else{
                            countLi++;
                        }
                    }
                    System.out.println("Habitaciones Ocupadas: "+countOc);
                    System.out.println("Habitaciones Libres: "+countLi);
                    System.out.println("Porcentaje de ocupación: "+((double)countOc*100/(habitaciones.length))+"%");
                    
                    break;
                
                case 0:
                    
                    break;
                    
                default:
                    System.out.println("opción incorrecta");
                    break;
        }
        }while(menu!=0);
        
        System.out.println("fin del ejercicio");
        
        
        
    }
    
}
