/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutoria_java;

/**
 *
 * @author isaia
 */
public class Ej_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] alumnos={"Ana","Pedro","Lucia","Carlos"};
        int[][] notas={
            {7,5,8},
            {4,3,5},
            {9,8,10},
            {6,5,4}
        };
        String alumno="";
        int sumaN,cont;
        double prom,mejorPro=0;
        
        for (int i = 0; i < alumnos.length; i++) {
            sumaN=0;
            cont=0;
            
            System.out.print("\n"+alumnos[i]+": ");
            for (int j = 0; j < notas[i].length; j++) {
                sumaN=sumaN+notas[i][j];
                cont++;
            }
            prom=((double)sumaN)/cont;
            System.out.print(prom);
            if (prom>=5) {
                System.out.print(" - APROBADO");
                
            }else{
                System.out.print(" - SUSPENSO");
            }
            if (prom>mejorPro) {
                mejorPro=prom;
                alumno=alumnos[i];
                
            }
            
        }
        System.out.println("\nMejor promedio: "+alumno);
    }
    
}
