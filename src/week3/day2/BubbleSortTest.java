package week3.day2;

import helpers.ArrayHelper;

public class BubbleSortTest {
  public static void main(String[] args) {
    int[] mas = ArrayHelper.genArray(5);
    System.out.println("Before sort");
    ArrayHelper.printArray(mas);
    ArrayHelper.bubbleSort(mas);
    System.out.println("After sort");
    ArrayHelper.printArray(mas);
  }
}
