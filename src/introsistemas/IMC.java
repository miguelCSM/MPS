package introsistemas;

import java.util.Scanner;

public class IMC {

    // Método main - principal (Ejecutar setencias con base en los atributos
    // y metodos de  la clase IMC)
    public static void main(String[] args) {
        // Escribir algo en pantalla
        System.out.println("Programa que calcula el IMC:");

        // Declarar atributos 
        double imc = 0.0, peso = 0.0, talla = 0.0;

        // Lector de teclado
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa talla(m)");
        talla = sc.nextDouble();

        System.out.println("Ingrese peso(Kg)");
        peso = sc.nextDouble();

        imc = peso / (talla * talla);

        System.out.println("Tu IMC es:" + imc);

        if (imc < 18.5) {
            System.out.println("Tienes peso BAJO");
        } else {
            if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("Tienes peso NORMAL");
            } else {
                if (imc >= 25 && imc <= 29.9) {
                    System.out.println("Tienes SOBREPESO");
                }else{
                    System.out.println("Tienes OBESIDAD");
                }
            }
        }

    }

}
