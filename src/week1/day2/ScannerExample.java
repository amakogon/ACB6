package week1.day2;


import java.util.Scanner;

public class ScannerExample {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please, enter value a");
    int a = scanner.nextInt();
    System.out.println("Enter b");
    int b = scanner.nextInt();

    System.out.println("A = " + a);
    System.out.println("b = " + b);
  }
}
