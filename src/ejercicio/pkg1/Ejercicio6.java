package ejercicio.pkg1;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
   Scanner sp  = new Scanner(System.in);
                
        System.out.println("Ingrese su primer numero");
        int a1 = sp .nextInt();
        System.out.println("Ingrese su segundo numero");
        int a2 = sp .nextInt();
        
        if (a1 == a2) {
            System.out.println("Son iguales");
    }else
            System.out.println("no son iguales");
        
        }
    }