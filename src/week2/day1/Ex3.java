package week2.day1;

import helpers.ArrayHelper;

public class Ex3 {
  public static void main(String[] args) {
    int[] mas1 = {1, 2, 3, 5, 6};

    for (int i = 0; i < mas1.length; i++) {
      System.out.print(mas1[i] + " ");
    }
    System.out.println();
    int[] mas2 = {23, 14, 152, 123, 1231, 54, 12312};

//    for (int i = 0; i < mas2.length; i++) {
//      System.out.print(mas2[i] + " ");
//    }
    ArrayHelper.printArray(mas2);

    int[] array = {1,2};
    boolean[] mas3 = {false};
//    ArrayHelper.printArray(mas3);
    ArrayHelper.printArray(array);

  }


}
