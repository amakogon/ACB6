package week2.day1;

import java.util.Scanner;

/**
 * Created by amakogon on 28.03.15.
 */
public class Task1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int arraySize = sc.nextInt();
    int[] array = new int[arraySize];

    for (int i = 0; i < array.length; i = i + 1) {
      array[i] = (int) (Math.random() * 15);
      System.out.print(array[i] + " ");
    }
    System.out.println();

    for(int i = array.length - 1; i >= 0; i--) {
      System.out.print(array[i] + " ");
    }








  }
}
