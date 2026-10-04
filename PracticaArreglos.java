public class PracticaArreglos {

    public static void main(String[] args) {

        // Arreglo inicial con valores predefinidos
        int[] arreglo = {50, 20, 40, 80, 30};

        // Mostrar el vector original
        System.out.println("Vector original:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Llamada al método de ordenamiento por inserción
        ordenarPorInsercion(arreglo);

        // Mostrar el vector ya ordenado
        System.out.println("Vector ordenado:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }

    // Método que ordena un arreglo usando el algoritmo de inserción
    public static void ordenarPorInsercion(int[] arreglo) {

        // Recorremos el arreglo desde la segunda posición
        for (int i = 1; i < arreglo.length; i++) {  // length CORRECTO

            int clave = arreglo[i];   // Elemento actual que se desea insertar
            int j = i - 1;            // Posición anterior

            // Desplazar elementos mayores que la clave hacia la derecha
            while (j >= 0 && arreglo[j] > clave) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }

            // Insertar la clave en su posición correcta
            arreglo[j + 1] = clave;
        }
    }
}
