package ejercicio.pkg1;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
       //2 numeros por tecldo y que lo muestre en pantalla
        
        Scanner texto = new Scanner(System.in);
        System.out.println("Ingrese su primer numero");
        int numero1 = texto.nextInt();
        
        System.out.println("Ingrese su segundo numero");
        int numero2 = texto.nextInt();
        
        System.out.println("los numeros son:" +numero1+" y "+numero2);


    }
    
}
