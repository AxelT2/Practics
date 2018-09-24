/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_12_fracciones;

/**
 *
 * @Axel Arath Tello Atondo 18550730
 */

import java.util.*;
import java.lang.Math;

public class EVA1_12_FRACCIONES {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String opera;
        double result;
        int num1;
        int dem1;
        int num2;
        int dem2;
        
        System.out.println("¿Qué operación esta haciendo?");
        opera = input.nextLine();
        if (opera.equals("suma")) {
            System.out.println("Inserte la primera fracción");
            System.out.println("Numerador");
            num1 = input.nextInt();
            System.out.println("Denominador");
            dem1 = input.nextInt();
            System.out.println("Inserte la segunda fracción");
            System.out.println("Numerador");
            num2 = input.nextInt();
            System.out.println("Denominador");
            dem2 = input.nextInt();
            result = (double) (num1 + num2) / (dem1 + dem2);
            System.out.println(result);
        } else {
            if (opera.equals("resta")) {
                System.out.println("Inserte la primera fracción");
                System.out.println("Numerador");
                num1 = input.nextInt();
                System.out.println("Denominador");
                dem1 = input.nextInt();
                System.out.println("Inserte la segunda fracción");
                System.out.println("Numerador");
                num2 = input.nextInt();
                System.out.println("Denominador");
                dem2 = input.nextInt();
                result = (double) (num1 - num2) / (dem1 - dem2);
                System.out.println(result);
            } else {
                if (opera.equals("multiplicación")) {
                    System.out.println("Inserte la primera fracción");
                    System.out.println("Numerador");
                    num1 = input.nextInt();
                    System.out.println("Denominador");
                    dem1 = input.nextInt();
                    System.out.println("Inserte la segunda fracción");
                    System.out.println("Numerador");
                    num2 = input.nextInt();
                    System.out.println("Denominador");
                    dem2 = input.nextInt();
                    result = (double) num1 * num2 / (dem1 * dem2);
                    System.out.println(result);
                } else {
                    if (opera.equals("división")) {
                        System.out.println("Inserte la primera fracción");
                        System.out.println("Numerador");
                        num1 = input.nextInt();
                        System.out.println("Denominador");
                        dem1 = input.nextInt();
                        System.out.println("Inserte la segunda fracción");
                        System.out.println("Numerador");
                        num2 = input.nextInt();
                        System.out.println("Denominador");
                        dem2 = input.nextInt();
                        result = (double) num1 * dem2 / (dem1 * num2);
                        System.out.println(result);
                    } else {
                        System.out.println("Operación Inválida");
                    }
                }
            }
        }
    }
}
