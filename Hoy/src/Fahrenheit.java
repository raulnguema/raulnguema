
import java.util.*;
 
public class Fahrenheit {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        double c, f;
        System.out.print("Escriba la cantidad en grados centígrados: ");
        c = valor.nextDouble();
        f = 32+(9*c/5);
        System.out.println("En Fahrenheit es: " + f);
    }
}