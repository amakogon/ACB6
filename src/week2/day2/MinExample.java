package week2.day2;

import helpers.ArrayHelper;

/**
 * Created by amakogon on 29.03.15.
 */
public class MinExample {
  public static void main(String[] args) {
    int[] mas = {7, 2, 5, -3, -8};

    int min = ArrayHelper.findMin(mas);
    System.out.println("Min value = " + min);

    int[] generated = ArrayHelper.genArray(10);
    ArrayHelper.printArray(generated);
    System.out.println(ArrayHelper.findMin(generated));

  }
}
