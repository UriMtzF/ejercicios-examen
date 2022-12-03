import java.util.Random;
import java.util.Scanner;

public class EjercicioBExamen {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Introduce el tamaño de una matriz cuadrada");
    int size = obj.nextInt();
    obj.close();

    int mat[][] = new int[size][size];
    Random ran = new Random();

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        mat[i][j] = ran.nextInt(10 + 10) - 10;
      }
    }

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        System.out.printf("%6d", mat[i][j]);
      }
      System.out.println("");
    }

    double sumaPromedio = 0;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        sumaPromedio += mat[i][j];
      }
    }
    double promedio = sumaPromedio / (size * size);
    System.out.println("El promedio de la matriz es: " + promedio);

    int numeroMayor = Integer.MAX_VALUE * -1;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (mat[i][j] > numeroMayor) {
          numeroMayor = mat[i][j];
        }
      }
    }
    int contador = 0;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (mat[i][j] == numeroMayor) {
          contador++;
        }
      }
    }
    System.out.println("El numero mayor es: " + numeroMayor + " y se repite " + contador + " veces");

    System.out.print("Los numeros pares son: ");
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (mat[i][j] % 2 == 0) {
          System.out.print(" " + mat[i][j] + " ");
        }
      }
    }
    System.out.println("");

    int sumaDiagonales = 0;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (i == j) {
          sumaDiagonales += mat[i][j];
        }
        if (i + j == size - 1) {
          sumaDiagonales += mat[i][j];
        }
      }
    }
    sumaDiagonales = sumaDiagonales - mat[size / 2][size / 2];
    System.out.println("La suma de las diagonales es: " + sumaDiagonales);

    int sumaUltimaFila = 0;
    for (int i = 0; i < size; i++) {
      sumaUltimaFila += mat[size - 1][i];
    }
    System.out.println("La suma de la ultima fila es: " + sumaUltimaFila);
  }
}
