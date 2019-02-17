package reto4;
import java.util.Scanner;

public class piramide {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño de la pirámide mayor o igual a 3: ");
        int filas = sc.nextInt();
        sc.close();
        
        System.out.println();
        for(int altura=1; altura<=filas; altura++){
            for(int espacios=1; espacios<=filas-altura; espacios++){
                System.out.print(" ");
            }
            
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
            System.out.print("*");
            }
            System.out.println();
        }
    }   
}
