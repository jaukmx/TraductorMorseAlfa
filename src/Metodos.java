package morse.ansic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Arturo
 */
public class Metodos {

    private static String[] morse = {".- ", "-... ", "-.-. ", "-.-. ", ". ", "..-. ", "--. ", ".... ", ".. ", ".--- ", "-.- ", ".-.. ", "-- ", "-. ", "--- ", ".--. ", "--.- ", ".-. ", "... ", "- ", "..- ", "...- ", ".-- ",
        "-..- ", "-.-- ", "--.. ", ".---- ", "..--- ", "...-- ", "....- ", "..... ", "-.... ", "--... ", "---.. ", "----. ", "-----  ", " "}, alfabeto = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", " "};

    public static String Alfamorse(String msg, String msg2) {

        ///abecedario
        /*a=1 b=2 c=3 d=4 e=5 f=6 g=7 h=8ijklmnopqrstuvwxyz1234567890
         */
        for (int i = 0; msg.length() > i; i++) {
            switch (msg.charAt(i)) {
                case 'a':
                    msg2 = msg2 + ".- ";
                    break;
                case 'b':
                    msg2 = msg2 + "-... ";
                    break;
                case 'c':
                    msg2 = msg2 + "-.-. ";
                    break;
                case 'd':
                    msg2 = msg2 + "-.-. ";
                    break;
                case 'e':
                    msg2 = msg2 + ". ";
                    break;
                case 'f':
                    msg2 = msg2 + "..-. ";
                    break;
                case 'g':
                    msg2 = msg2 + "--. ";
                    break;
                case 'h':
                    msg2 = msg2 + ".... ";
                    break;
                case 'i':
                    msg2 = msg2 + ".. ";
                    break;
                case 'j':
                    msg2 = msg2 + ".--- ";
                    break;
                case 'k':
                    msg2 = msg2 + "-.- ";
                    break;
                case 'l':
                    msg2 = msg2 + ".-.. ";
                    break;
                case 'm':
                    msg2 = msg2 + "-- ";
                    break;
                case 'n':
                    msg2 = msg2 + "-. ";
                    break;
                case 'o':
                    msg2 = msg2 + "--- ";
                    break;
                case 'p':
                    msg2 = msg2 + ".--. ";
                    break;
                case 'q':
                    msg2 = msg2 + "--.- ";
                    break;
                case 'r':
                    msg2 = msg2 + ".-. ";
                    break;
                case 's':
                    msg2 = msg2 + "... ";
                    break;
                case 't':
                    msg2 = msg2 + "- ";
                    break;
                case 'u':
                    msg2 = msg2 + "..- ";
                    break;
                case 'v':
                    msg2 = msg2 + "...- ";
                    break;
                case 'w':
                    msg2 = msg2 + ".-- ";
                    break;
                case 'x':
                    msg2 = msg2 + "-..- ";
                    break;
                case 'y':
                    msg2 = msg2 + "-.-- ";
                    break;
                case 'z':
                    msg2 = msg2 + "--.. ";
                    break;
                case '1':
                    msg2 = msg2 + ".---- ";
                    break;
                case '2':
                    msg2 = msg2 + "..--- ";
                    break;
                case '3':
                    msg2 = msg2 + "...-- ";
                    break;
                case '4':
                    msg2 = msg2 + "....- ";
                    break;
                case '5':
                    msg2 = msg2 + "..... ";
                    break;
                case '6':
                    msg2 = msg2 + "-.... ";
                    break;
                case '7':
                    msg2 = msg2 + "--... ";
                    break;
                case '8':
                    msg2 = msg2 + "---.. ";
                    break;
                case '9':
                    msg2 = msg2 + "----. ";
                    break;
                case '0':
                    msg2 = msg2 + "-----  ";
                    break;
                default:
                    msg2 = msg2 + "  ";

            }

        }
        return msg2;

    }

    public static void MorsAlfa(String msg) {
        String respuesta = "";       ////variable donde de arma la espuesta letra por letra
        String[] vectormorse = new String[1000]; ///vetor para la palabra en morse de maximo 1000 caracteres
        String textotemporal = "";/// El
        int i = 0, j = 0;

        while (i < msg.length()) {

            if (msg.charAt(i) != ' ') {
                System.out.println("\n EStoy en el if");
                textotemporal += Character.toString(msg.charAt(i));
                System.out.println(textotemporal);
                
            } else {

                vectormorse[j] = textotemporal + " ";
                textotemporal = "";
                
                for (int k = 0; k <= 36; k++) {
                    
                    if (vectormorse[j].equals(morse[k])) {

                        respuesta = respuesta + alfabeto[k];
                        System.out.println("Alfa= " + alfabeto[k]);
                    
                    } else if (vectormorse[j] != morse[k]) {
                        // respuesta+=" Error ";
                    }

                }
                j++;
            }
            i++;
        }

        System.out.println("\n " + msg + " en español es ='" + respuesta + "'");
        //System.out.println("\n El texto en el vector 0:" + vectormorse[0] + ":"); //D

    }

}
