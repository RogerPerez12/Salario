
import java.util.Scanner;

public class Empleado {

    public static void main(String[] args) {

        double ISR = 0;
        double sueldo = 0;
        double AFP = 0;
        double ISSS = 0;
        double sueldofinal = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el salario del empleado");
        sueldo = entrada.nextDouble();

        if (sueldo >= 500) {
            AFP = sueldo * 0.03;
        }
            if (sueldo >= 500) {
                ISSS = sueldo * 0.02;
            } 
            
                if (sueldo >= 500) {
                    ISR = sueldo * 0.05;
                } else {
                    ISR = 0;
                }
            
        

        sueldofinal = sueldo - AFP - ISSS - ISR;
        System.out.println("El AFP es de: " + AFP);
        System.out.println("El ISSS es de: " + ISSS);
        System.out.println("El ISR es de: " + ISR);
        System.out.println("El Sueldo del Empleado es: " + sueldofinal);
    }
}
