import java.util.Scanner;

public class redondeoNumReal { // 

public static double redondear (double numero, int nroDecimales) { 
    double paso2 = paso1 + 0.5 ;
    long paso3 = (long) paso2; // 
    double resultado = paso3/Math.pow(10, nroDecimales);  
    return resultado;
    }
 
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Ingrese un numero decimal: ");
        double numero = sc.nextDouble();
        System.out.println("Ingrese la cantidad de decimales a redondear (0 para sin decimales)");
        int decimales = sc.nextInt();

        double redondeado = redondear(numero,decimales); 
         System.out.println ("El numero redondeado es: " + redondeado); 

   }
    
}
