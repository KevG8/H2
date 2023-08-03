
package ejercicio.pkg1;

import java.util.Scanner;


public class ejercicio8 {
    
    public static void main(String[] args) {
        
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese su primer numero");
        int n1 = sp.nextInt();
        System.out.println("Ingrese su sengundo numero");
        int n2 = sp.nextInt();
        
        if (n1 == n2) {
            System.out.println("Son iguales");
        }else if (n1 > n2) {
            System.out.println(n1 + " " + n2);
        }else {
            System.out.println(n2 + " " + n1);
        }
    }
}