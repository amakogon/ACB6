package week2.day2;

import helpers.ArrayHelper;

/**
 * Created by amakogon on 29.03.15.
 */
public class TestGenArray {
  public static void main(String[] args) {
    System.out.println("Start of the program");
    int[] array = ArrayHelper.genArray(7);
    ArrayHelper.printArray(array);

    double rand = Math.random();
    ArrayHelper.printArray(ArrayHelper.genArray(15));

    System.out.println(rand);

    float f = 3.14f;

    System.out.println("End of the program");
  }
}
