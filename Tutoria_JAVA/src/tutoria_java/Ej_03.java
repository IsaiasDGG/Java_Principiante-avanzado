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
public class Ej_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ejercicio 03 Cajero Automático");
        
        //saldo=1000 y pin igual 1234.
        //luego hacer menu.
        
        //Variables
        Scanner sc=new Scanner(System.in);
        int saldo=1000;
        int pinCorrecto=1234;
        int errores=0,pinUsuario,menu,dinero;
        boolean bloqueoT=false,pin=false,observacion;
        
        do{
            System.out.println("Introduce Pin");
            pinUsuario=sc.nextInt();
            pin=pinUsuario==pinCorrecto;
            if (!pin){
                errores++;
                if(errores==3){
                    bloqueoT=true;
                }
            }
            
        }while (!bloqueoT&&!pin);
            
        if (!bloqueoT){
            do{
                System.out.println("Menú Cajero");
                System.out.println("1.- Consultar Saldo\n2.- Retirar Dinero\n3.- Ingresar Dinero\n0.- Salir");
                menu=sc.nextInt();
                observacion=false;
                
                switch (menu){
                    case 1://consultar saldo
                        System.out.println("Saldo: "+saldo);
                        break;
                        
                    case 2://retiro
                        System.out.println("ingrese cantidad a retirar");
                        System.out.println("debe ser multiplo de 10");
                        dinero=sc.nextInt();
                        if (dinero>0&&dinero%10==0&&saldo>=dinero) {
                            System.out.println("retiro de: "+dinero);
                            System.out.println("nuevo saldo: "+(saldo-dinero));
                            saldo=saldo-dinero;
                            
                            if (saldo>=3000) {
                                observacion=true;
                            }
                            
                        }else if(dinero<=0||dinero%10!=0){
                            System.out.println("cantidad no valida");
                        }else{
                            System.out.println("Saldo Insuficiente");
                        }
                                                
                        break;
                        
                    case 3://ingreso
                        System.out.println("ingrese cantidad a ingresar");
                        System.out.println("debe ser multiplo de 10 y maximo 1000");
                        dinero=sc.nextInt();
                        if (dinero>0&&dinero%10==0&&dinero<=1000) {
                            System.out.println("ingreso de: "+dinero);
                            System.out.println("nuevo saldo: "+(saldo+dinero));
                            saldo=saldo+dinero;
                            if (saldo>=3000) {
                                observacion=true;
                            }
                        }else{
                            System.out.println("Cantidad no Válida");
                        }
                        break;
                        
                    case 0:
                        
                        break;
                        
                    default:
                        System.out.println("Opción Incorrecta");
                        break;
                }
                
             if(observacion){
                 System.out.println("OPERACIÓN REQUIERE VERIFICACIÖN");;   
             }
            }while(menu!=0);
        }else{
            System.out.println("TARJETA BLOQUEADA");
        }
    }
    
}
