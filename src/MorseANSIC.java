/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse.ansic;

import java.util.Scanner;
import static morse.ansic.AetodoAlfanumMorse.Alfamorse;

/**
 *
 * @author Arturo
 */
public class MorseANSIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String morse = " ", msg1;
        int res;
        Scanner teclado = new Scanner(System.in);
        String a, Traducido1;
        boolean b = true;

        while (b) {
            System.out.println("=====================================================================================\n                     Traductor Morse-Texto \n ¿Que desea hacer? , seleccione un opcion con el numero que aparece"
                    + " \n \n 1-.Traducir Texto-->Morse \n 2.-Traducir Morse-->Texto \n 3.-Salir");
            System.out.println("-->");
            a = teclado.nextLine();
            switch (a) {
                case "1":
                    System.out.println("Ingrese el mensaje en Texto");
                    res = teclado.nextInt();
                    AraRom(c)
                 
                    

                    break;
                case "2":
                    System.out.println("Ingrese el mensaje en Morse");
                    msg1 = teclado.nextLine();

                    break;
                case "3":
                    b = false;

            }
            System.out.println("   ");

        }

    }

   
}
