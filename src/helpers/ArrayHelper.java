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
      if(array[i] < min) {
        min = array[i];
      }
    }
    return min;
  }


}
