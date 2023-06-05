package fors;

import java.util.Scanner;

public class tablaMult {
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("¿Qué tabla deseas aprender?");
        
        int tabla = lector.nextInt();
        
        for (int iterator = 1; iterator <= 10; iterator++) {
            System.out.println(tabla + " X " + iterator + " = " + (tabla*iterator));
        }
        
    }
    
}
