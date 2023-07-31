package ejercicio.pkg1;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingresa tu numero");
        int numero = sp.nextInt();
        
        System.out.println("El doble es:" +(numero*2)+"\nEl triple es: " + (numero*3));
        
    }
    
}
