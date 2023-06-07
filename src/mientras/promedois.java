package mientras;

import java.util.Scanner;

// Si el promedio es menor que 6 debemos indicar que está reprobado
// en caso contrario felicitarle porque ha pasado
// Se devolver el promedio y la letra que corresponde al promedio (US)

public class promedois {
    
    public static void main(String[] args) {
        // Instancia de la clase Scanner
        Scanner lector = new Scanner(System.in);
        
        double calificacion = 0.0, promedio = 0.0;
        int respuesta = 1, contador =0;
        String califUS = "";
        
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
        
        if (promedio < 6){
            System.out.println("Usted ha reprobado");
        }else{
            System.out.println("Felicidades ha pasado");
        }
        
        if (promedio <=100.00 && promedio >= 93.00){
            califUS = "A";
        }else if (promedio <= 92.99 && promedio >= 90.00){
            califUS = "A-";
        }else if(promedio <= 89.99 && promedio >= 87.00){
            califUS = "B+";
        }else if(promedio <= 86.99 && promedio >= 83.00){
            califUS = "B";
        }else if(promedio <= 82.99 && promedio >= 80.00){
            califUS = "B-";
        }else if(promedio <= 79.99 && promedio >= 77.00){
            califUS = "C+";
        }else if(promedio <= 76.99 && promedio >= 73.00){
            califUS = "C";
        }else if(promedio <= 72.99 && promedio >= 70.00){
            califUS = "C-";
        }else if(promedio <= 69.99 && promedio >= 67.00){
            califUS = "D+";
        }else if(promedio <= 66.99 && promedio >= 60.00){
            califUS = "D";
        }else if(promedio <= 59.99 && promedio >= 0.00){
            califUS = "F";
        }else{
            califUS = "NA";
        }
        
        System.out.println("Promedio: " + promedio);
        
        
    }
}
