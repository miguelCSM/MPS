package introsistemas;

import java.util.Scanner;

public class descuentosOr {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        // Declarar variables
        double monto, descuento;
        int edad;

        // Leer variables 
        System.out.println("Ingrese edad(años)");
        edad = lector.nextInt();

        System.out.println("Ingrese el monto(pesos)");
        monto = lector.nextDouble();

        if (edad < 18 || monto >= 1500 && monto <= 3000) {
            descuento = monto * 0.05;
        } else {
            if (monto > 3000) {
                descuento = monto * 0.15;
            } else {
                if (edad >= 65) {
                    descuento = monto * 0.1;
                } else {
                    descuento = 0.0;
                }
            }
        }
        
        System.out.println("Monto: " + monto + " Descuento: " + descuento + "monto-descuento" + (monto-descuento));

    }
}
