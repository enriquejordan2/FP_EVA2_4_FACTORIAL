/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA2_4_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int factorial,fact2;
                Scanner captu = new Scanner(System.in);
                System.out.println("Escriba el numero: ");
                factorial = captu.nextInt();
                captu.nextLine();
                int resu = 1;
                fact2 = factorial;
                for( int i = 1; i <= fact2; i++){
                    resu = resu * factorial;
                    factorial--;
                }
               System.out.println("EL resultado es = " + resu); 
    }
    
}
