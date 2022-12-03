import java.util.Scanner;
import java.util.Random;

public class EjercicioAExamen {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    Random ran = new Random();
    int size;

    System.out.println("Introduce el tamaño de los vectores");
    size = obj.nextInt();

    int vecA[] = new int[size];
    int vecB[] = new int[size];
    int vecC[] = new int[size];

    boolean cont1 = true;
    int menu1;

    do {
      System.out.println("**********");
      System.out.println("1. Llenar vector A de manera aleatoria;");
      System.out.println("2. Llenar vector B de manera aleatoria");
      System.out.println("3. Realizar C=A+B");
      System.out.println("4. Realizar C=B-A");
      System.out.println("5. Mostrar vectores");
      System.out.println("6. Salir");
      System.out.println("**********");
      menu1 = obj.nextInt();

      switch (menu1) {
        case 1:
          for (int i = 0; i < vecA.length; i++) {
            vecA[i] = ran.nextInt(101 + 100) - 100;
          }
          System.out.println("Se ha llenado el vector A");
          break;
        case 2:
          for (int i = 0; i < vecB.length; i++) {
            vecB[i] = ran.nextInt(101 + 100) - 100;
          }
          System.out.println("Se ha llenado el vector B");
          break;
        case 3:
          for (int i = 0; i < vecC.length; i++) {
            vecC[i] = vecA[i] + vecB[i];
          }
          System.out.println("Se ha realizado la operacion");
          break;
        case 4:
          for (int i = 0; i < vecC.length; i++) {
            vecC[i] = vecB[i] - vecA[i];
          }
          System.out.println("Se ha realizado la operacion");
          break;
        case 5:
          int menu2;
          boolean cont2 = true;
          do {
            System.out.println("**********");
            System.out.println("Elige una opcion");
            System.out.println("1. Mostrar vector A");
            System.out.println("2. Mostrar vector B");
            System.out.println("3. Mostrar vector C");
            System.out.println("4. Salir");
            System.out.println("**********");
            menu2 = obj.nextInt();
            switch (menu2) {
              case 1:
                System.out.print("Vector A: (");
                for (int i = 0; i < vecA.length; i++) {
                  System.out.print(" " + vecA[i] + " ");
                }
                System.out.print(")");
                System.out.println("");
                break;
              case 2:
                System.out.print("Vector B: (");
                for (int i = 0; i < vecB.length; i++) {
                  System.out.print(" " + vecB[i] + " ");
                }
                System.out.print(")");
                System.out.println("");
                break;
              case 3:
                System.out.print("Vector C: (");
                for (int i = 0; i < vecC.length; i++) {
                  System.out.print(" " + vecC[i] + " ");
                }
                System.out.print(")");
                System.out.println("");
                break;
              case 4:
                cont2 = false;
                break;
              default:
                cont2 = false;
                break;
            }
          } while (menu2 < 1 || menu2 > 4 || cont2);
          break;
        case 6:
          cont1 = false;
          break;

        default:
          cont1 = false;
          break;
      }
    } while (cont1 || menu1 < 1 || menu1 > 6);
    obj.close();
  }
}