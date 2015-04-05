package week3.day1;

public class BreakTest {
  public static void main(String[] args) {
    int[] mas = {1, 6, 2, 6, 2, 6};
    int pos = -1;
    for (int i = 0; i < mas.length; i++) {
      if(mas[i] == 6) {
        pos = i;
        continue;
      }
      System.out.println("after if " + i);
    }

    System.out.println(pos);


    label: for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        if(i == 3) {
          break label;
        }
        System.out.println("I = " + i + ", J = " + j);
      }
    }
  }
}
