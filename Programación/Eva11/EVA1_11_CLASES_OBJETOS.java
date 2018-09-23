import java.util.*;
import java.lang.Math;

public class EVA1_11_CLASES_OBJETOS {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double result;
        double x1;
        double x2;
        double y1;
        double y2;
        
        System.out.println("Ingrese la primera coordenada");
        System.out.println("Ingrese sólo X");
        x1 = input.nextDouble();
        System.out.println("Ahora ingrese Y");
        y1 = input.nextDouble();
        System.out.println("Ingrese la segunda coordenada");
        System.out.println("Ingrese sólo X");
        x2 = input.nextDouble();
        System.out.println("Ahora ingrese Y");
        y2 = input.nextDouble();
        result = (y2 - y1) / (x2 - x1);
        System.out.println(result);
    }
}
