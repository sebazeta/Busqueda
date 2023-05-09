import java.util.Arrays;

public class Busqueda {

    // Búsqueda lineal
    public static int busquedaLineal(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Búsqueda binaria
    public static int busquedaBinaria(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 10, 15, 20, 23, 25};
        int x = 15;

        // Búsqueda lineal
        long startTime = System.nanoTime();
        int index = busquedaLineal(arr, x);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Búsqueda lineal:");
        System.out.println("Índice encontrado: " + index);
        System.out.println("Tiempo de ejecución: " + duration + " nanosegundos");

        // Búsqueda binaria
        startTime = System.nanoTime();
        index = busquedaBinaria(arr, x);
        endTime = System.nanoTime();
        duration = (endTime - startTime);

        System.out.println("Búsqueda binaria:");
        System.out.println("Índice encontrado: " + index);
        System.out.println("Tiempo de ejecución: " + duration + " nanosegundos");
    }
}
