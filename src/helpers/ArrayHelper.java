package helpers;


public class ArrayHelper {

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  public static int[] genArray(int arraySize) {
    int[] mas = new int[arraySize];
    for (int i = 0; i < mas.length; i++) {
      int random = (int) (Math.random() * 10);
      mas[i] = random;
    }

    return mas;
  }

  public static int findMin(int[] array) {
    int min = array[0];
    for (int i = 0; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
      }
    }
    return min;
  }

  public static void bubbleSort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length - 1 - i; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }


}
