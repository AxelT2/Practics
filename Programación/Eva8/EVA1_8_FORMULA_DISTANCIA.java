/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_8_formula_distancia;

/**
 *
 * @author temporal2
 */
import java.util.*;
import java.lang.Math;

public class EVA1_8_FORMULA_DISTANCIA {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduzca la velocidad inicial");
        double inicial;
        double var_final;
        double time;
        double acel;
        
        inicial = input.nextDouble();
        System.out.println("Introduzca la velocidad final");
        var_final = input.nextDouble();
        System.out.println("Introduzca el tiempo");
        time = input.nextDouble();
        acel = (inicial + var_final) / 2 * time;
        System.out.println(Double.toString(acel) + " metros");
    }
}
