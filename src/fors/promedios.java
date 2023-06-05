package fors;

import java.util.Scanner;

public class promedios {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double calificacion, promedio = 0.0;
        int nCalif;
        
        System.out.println("Cuántas calif. desea promediar?");
        nCalif = lector.nextInt();
        
        for(int iterator = 1; iterator<=nCalif;iterator++){
            System.out.println("Ingrese la calificación" + iterator);
            calificacion = lector.nextDouble();
            
            promedio = promedio + calificacion;
        }
        
        promedio = promedio/nCalif;
        
        System.out.println("Promedio: " + promedio);
    }
}
