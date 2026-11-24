/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoria_java.Laboratorio;

/**
 *
 * @author isaia
 */
public class SalaCine {
    // 1. Atributo privado: matriz bidimensional de booleanos 'butacas'
    private boolean [][] butacas;

    // 2. Constructor: recibe (int filas, int columnas) e instancia la matriz
    //    (Recuerda que Java inicializa los boolean a false automáticamente)
    public SalaCine(int filas, int columnas){
        butacas=new boolean[filas][columnas];
    }
    

    // 3. Método reservarAsiento(int fila, int columna): devuelve boolean
    public boolean reservarAsiento(int fila,int columna){
    //    - Valida límites de fila y columna
        if(fila>=0&&fila<butacas.length&&columna>=0&&columna<butacas[0].length){
            
    //    - Comprueba si ya está ocupada
            if (!butacas[fila][columna]){
    //    - Si está libre, la marca como true y devuelve true
                butacas[fila][columna]=true;
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    // 4. Método contarLibres(): devuelve int
    public int contarLibres(){
        int count=0;
    //    - Recorre filas y columnas con bucles anidados
        for (int i = 0; i < butacas.length; i++) {
            for (int j = 0; j <butacas[i].length; j++) {
                if(!butacas[i][j]){
                    count++;
                }
            }
                
        }

    //    - Cuenta cuántas posiciones valen false y devuelve el total
        return count;
    }    
    
    
}
