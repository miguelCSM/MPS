package introsistemas;

import java.util.Scanner;


public class descuentoCond {

    public static void main(String[] args) {

        int edad;
        float monto, descuento, total;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca su edad (años)");
        edad = sc.nextInt();
        
        System.out.println("Introduzca monto en pesos");
        monto = sc.nextFloat();
        
        if(edad >= 18 && edad < 65){
            descuento = 20;
        }else if (edad >65){
            descuento = 25;
        }else{
            descuento = 0;
        }
        
        total = monto-(monto*descuento)/100;
        
        System.out.println("El usuario de edad " + edad + " tiene un descuento del " + descuento + " sobre el monto " + monto + "y un total de " + total);
    }

}
