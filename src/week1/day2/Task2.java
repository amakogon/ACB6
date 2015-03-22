package week1.day2;

import java.util.Scanner;

/**
 * Created by amakogon on 22.03.15.
 */
public class Task2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a");
    int a = scanner.nextInt();
    System.out.println("Enter b");
    int b = scanner.nextInt();
    System.out.println("Enter c");
    int c = scanner.nextInt();

    int discriminant = b * b - 4 * a * c;

    if (discriminant < 0) {
      System.out.println("No solutions");
    } else if (discriminant == 0) {
      double x = -b / 2.0 * a;
      System.out.println("x = " + x);
    } else {
      double x1 = (-b + Math.sqrt(discriminant)) / 2.0 * a;
      double x2 = (-b - Math.sqrt(discriminant)) / 2.0 * a;
      System.out.println("x1 = " + x1);
      System.out.println("x2 = " + x2);
    }
  }
}
