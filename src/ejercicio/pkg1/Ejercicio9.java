package ejercicio.pkg1;

import java.util.Scanner;

class ejercico9 {
    
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese su primer numero");
        float numero1 = sp.nextFloat();
        System.out.println("Ingrese su segundo numero");
        float numero2 = sp.nextFloat();
        System.out.println("Ingrese su tercer numero");
        float numero3 = sp.nextFloat();


        //1 2 3
        if (numero1 > numero2) {
            if (numero1 > numero3) {
                if (numero2 > numero3) {
                    System.out.println(numero1 + " " + numero2 + " " + numero3);
                } else {
                    System.out.println(numero1 + " " + numero3 + " " + numero2);
                }
            } else {
                System.out.println(numero3 + " " + numero1 + " " + numero2);

            }
        } else {
            if (numero2 > numero3) {
                if (numero1 > numero3) {
                    System.out.println(numero2 + " " + numero1 + " " + numero3);
                } else {
                    System.out.println(numero2 + " " + numero3 + " " + numero1);
                }
            } else {
                System.out.println(numero3 + " " + numero2 + " " + numero1);

 

            }
        }

 

    }
}