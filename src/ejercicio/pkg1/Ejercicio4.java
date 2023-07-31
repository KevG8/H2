package ejercicio.pkg1;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingresa tu temperatura");
        int numero = 32+(9*(sp.nextInt()/5));
        
        System.out.println("La temperatura en FAH es: "+numero);
        
    }
}
