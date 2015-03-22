package week1.day2;

import java.util.Scanner;

public class IfExample {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please, enter value");

    int value = scanner.nextInt();

    if (value < 5) {
      System.out.println(value * 2);
    } else {
      System.out.println(value);
    }



  }
}
