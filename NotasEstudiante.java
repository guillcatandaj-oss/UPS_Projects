import java.util.Scanner;

public class NotasEstudiante {

    public static double promedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static int equivalenciaNotas(double prom) {
        if (prom > 90) {
            return 4;
        } else if (prom > 80) {
            return 3;
        } else if (prom > 70) {
            return 2;
        } else if (prom > 60) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la primera nota (0-100): ");
        double n1 = sc.nextDouble();

        System.out.print("Ingrese la segunda nota (0-100): ");
        double n2 = sc.nextDouble();

        System.out.print("Ingrese la tercera nota (0-100): ");
        double n3 = sc.nextDouble();

        double prom = promedio(n1, n2, n3);
        int equivalencia = equivalenciaNotas(prom);

        System.out.println("El promedio es: " + prom);
        System.out.println("La equivalencia de sus notas es: " + equivalencia);
    }
}
