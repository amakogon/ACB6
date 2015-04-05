package week3;

import java.util.Scanner;

public class GuessNumber {
  public static void main(String[] args) {
    int random = (int) (Math.random() * 10); // 1
    Scanner sc = new Scanner(System.in);
    int guess;
    do {
      System.out.println("Enter value");
      guess = sc.nextInt();
      if (guess < random) {
        System.out.println("try bigger");
      } else if (guess > random) {
        System.out.println("try smaller");
      }
    } while (random != guess);
    System.out.println("Good job!");

  }
}
