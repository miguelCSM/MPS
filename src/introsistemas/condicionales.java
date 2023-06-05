package introsistemas;

import java.util.Scanner;

public class condicionales {
    
    public static void main(String[] args) {
        byte edad;
        
        System.out.println("Ingrese la edad (años)");
        
        // Crar un instancia de Scanner
        Scanner sc = new Scanner(System.in);
        
        
        // Leer con Scanner
        edad = sc.nextByte();
        
        // Condición if (condición){}
        if (edad>=18){
            System.out.println("Bienvenido al contenido +18");
        }else{
            System.out.println("Requieres la autorización de un adulto");
        }
    }
    
}
