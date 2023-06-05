package mientras;

import java.util.Scanner;

public class promedois {
    
    public static void main(String[] args) {
        // Instancia de la clase Scanner
        Scanner lector = new Scanner(System.in);
        
        double calificacion = 0.0, promedio = 0.0;
        int respuesta = 1, contador =0;
        
        while (respuesta == 1) {
            System.out.println("Dentro del ciclo");
            
            System.out.println("Escribe la calificación");
            calificacion = lector.nextDouble();
            
            // promedio = promedio + calificacion;
            promedio += calificacion;
            
            // contador = contador + 1; contador += 1;
            contador++;
            
            System.out.println("Desea agregar más calificaciones");
            respuesta = lector.nextInt();
        }

        promedio /= contador;
        System.out.println("Promedio: " + promedio);
    }
}
