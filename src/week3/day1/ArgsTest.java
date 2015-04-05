package week3.day1;

public class ArgsTest {
  public static void main(String[] args) {
    int[] mas = new int[5];
    String[] words = new String[4];

    for (int i = 0; i < words.length; i++) {
      System.out.println(words[i]);
    }
    int[] nums = {1, 2, 3, 5, 6, 7};
    String[] words2 = {"Hello ", "students", "!"};

    for (int i = 0; i < words2.length; i++) {
      System.out.print(words2[i]);
    }
  }
}
