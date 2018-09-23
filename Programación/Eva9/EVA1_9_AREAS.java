/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_areas;

/**
 *
 * @author temporal2
 */

public class EVA1_9_AREAS {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String check;
        String figura;
        String figura2;
        double trap;
        double trian;
        double cuad;
        double result;
        
        System.out.println("Qué figura está usando?");
        figura = input.nextLine();
        if (figura.equals("trapecio")) {
            System.out.println("Base menor");
            trap = input.nextDouble();
            System.out.println("Base mayor");
            trian = input.nextDouble();
            System.out.println("Altura");
            cuad = input.nextDouble();
            result = (trap + trian) * cuad / 2;
        } else {
            if (figura.equals("triangulo")) {
                System.out.println("Base");
                trap = input.nextDouble();
                System.out.println("Altura");
                cuad = input.nextDouble();
                result = trap * cuad / 2;
            } else {
                if (figura.equals("cuadrado")) {
                    System.out.println("Lado");
                    trap = input.nextDouble();
                    result = trap * trap;
                } else {
                    if (figura.equals("romboide")) {
                        System.out.println("Base");
                        trap = input.nextDouble();
                        System.out.println("Altura");
                        cuad = input.nextDouble();
                        result = trap * cuad;
                    } else {
                        result = "FIgura Inválida";
                    }
                }
            }
        }
  


