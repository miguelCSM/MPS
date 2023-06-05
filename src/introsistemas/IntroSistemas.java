package introsistemas;

public class IntroSistemas {
    
    private static String cadena = "Viva 1342";
    char caracter = 'a';
    Boolean bandera = false;
    int cadena2 = 10;
    
    
    /*
    Declaración de variables
    
    Tipo_Dato Nombre_Identificador;
    Tipo_Dato Nombre_Identificador = valor;
    */
    
    /*
    private static byte numero1 = 127;
    byte numero2 = 100;
    
    short resultado = (short) (numero1 + numero2);
    */
    
    
    public static void main(String[] args) {
        // Memoria -> Valor y la referencia del atributo
        byte numero1 = 10, numero2 = 10, resultado = (byte) (numero1 + numero2);
        
        long resultado2 = numero1 + numero2 * 1000000000;
        
        System.out.print("Resultado = " + resultado);
        
        resultado = (byte) (numero1 + numero2);
        
        System.out.print("Resultado despues de suma = " + resultado);
        
        System.out.println(cadena);
        
    }
    
}
