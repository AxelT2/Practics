/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_10_cuna_esferica;

/**
 *
 * @Axel Arath Tello Atondo 18550730
 */


public class EVA1_10_CUNA_ESFERICA {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double result;
        double radio;
        
        System.out.println("Introduzca el radio");
        radio = input.nextDouble();
        result = (double) 4 / 3 * 3.1416 * Math.pow(radio, 3);
        System.out.println(result);
    }
}


